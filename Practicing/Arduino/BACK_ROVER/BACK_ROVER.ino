/*
   Arduino and MPU6050 Accelerometer and Gyroscope Sensor Tutorial
   by Dejan, https://howtomechatronics.com
*/

#include <Wire.h>

const int MPU = 0x68; // MPU6050 I2C address
float AccX, AccY, AccZ;
float GyroX, GyroY, GyroZ;
float accAngleX, accAngleY, gyroAngleX, gyroAngleY, gyroAngleZ;
float roll, pitch, yaw;
float AccErrorX, AccErrorY, GyroErrorX, GyroErrorY, GyroErrorZ;
float elapsedTime, currentTime, previousTime;
int c = 0;

int IN1 = 3;
int IN2 = 4;
int IN3 = 5;
int IN4 = 6;

int TRIG = 7;
int ECHO = 9;

bool LISTO = true;

int auxiliar = 0;

void setup() {
  pinMode(IN1, OUTPUT);
  pinMode(IN2, OUTPUT);
  pinMode(IN3, OUTPUT);
  pinMode(IN4, OUTPUT);
  pinMode(TRIG, OUTPUT);
  pinMode(ECHO, INPUT);

  Serial.begin(19200);
  Wire.begin();                      // Initialize comunication
  Wire.beginTransmission(MPU);       // Start communication with MPU6050 // MPU=0x68
  Wire.write(0x6B);                  // Talk to the register 6B
  Wire.write(0x00);                  // Make reset - place a 0 into the 6B register
  Wire.endTransmission(true);        //end the transmission
  
  calculate_IMU_error();
  delay(20);
  
}

void loop() {
  if(getSignal() > 20 && LISTO == true){
    go();
  } else {
    if(LISTO == true){
      noGo();
      LISTO = false;
      delay(1000);
    } else {
      // === Read gyroscope data === //
      previousTime = currentTime;        // Previous time is stored before the actual time read
      currentTime = millis();            // Current time actual time read
      elapsedTime = (currentTime - previousTime) / 1000; // Divide by 1000 to get seconds
      Wire.beginTransmission(MPU);
      Wire.write(0x43); // Gyro data first register address 0x43
      Wire.endTransmission(false);
      Wire.requestFrom(MPU, 6, true); // Read 4 registers total, each axis value is stored in 2 registers
      GyroX = (Wire.read() << 8 | Wire.read()) / 131.0; // For a 250deg/s range we have to divide first the raw value by 131.0, according to the datasheet
      GyroY = (Wire.read() << 8 | Wire.read()) / 131.0;
      GyroZ = (Wire.read() << 8 | Wire.read()) / 131.0;
      // Correct the outputs with the calculated error values
      GyroX = GyroX + 0.56; // GyroErrorX ~(-0.56)
      GyroY = GyroY - 2; // GyroErrorY ~(2)
      GyroZ = GyroZ + 0.79; // GyroErrorZ ~ (-0.8)
    
      // Currently the raw values are in degrees per seconds, deg/s, so we need to multiply by sendonds (s) to get the angle in degrees
      gyroAngleX = gyroAngleX + GyroX * elapsedTime; // deg/s * s = deg
      gyroAngleY = gyroAngleY + GyroY * elapsedTime;
      yaw =  yaw + GyroZ * elapsedTime;
    
      // Complementary filter - combine acceleromter and gyro angle values
      roll = 0.96 * gyroAngleX + 0.04 * accAngleX;
      pitch = 0.96 * gyroAngleY + 0.04 * accAngleY;

      if(yaw < (auxiliar + 90)){
        right();
      } else {
        noGo();
        LISTO = true;
        auxiliar += 90;
        delay(1000);
      }
      delay(100);
      
    }
  }
}

//Metodo que nos da la distancia antes de chocar con la pared
int getSignal(){
  digitalWrite(TRIG, HIGH);
  delay(10);
  digitalWrite(TRIG, LOW);

  int DISTANCIA = pulseIn(ECHO, HIGH) / 58.2;

  delay(10);

  return DISTANCIA;
}

//Método para avanzar
void go(){
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, HIGH);
  digitalWrite(IN3, HIGH);
  digitalWrite(IN4, LOW);
}

//Método para parar
void noGo(){
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, LOW);
  digitalWrite(IN3, LOW);
  digitalWrite(IN4, LOW);
}

//Método para girar a la derecha
void right(){
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, LOW);
  digitalWrite(IN3, HIGH);
  digitalWrite(IN4, LOW);
}

void calculate_IMU_error() {
  // We can call this funtion in the setup section to calculate the accelerometer and gyro data error. From here we will get the error values used in the above equations printed on the Serial Monitor.
  // Note that we should place the IMU flat in order to get the proper values, so that we then can the correct values
  // Read accelerometer values 200 times
  while (c < 200) {
    Wire.beginTransmission(MPU);
    Wire.write(0x3B);
    Wire.endTransmission(false);
    Wire.requestFrom(MPU, 6, true);
    AccX = (Wire.read() << 8 | Wire.read()) / 16384.0 ;
    AccY = (Wire.read() << 8 | Wire.read()) / 16384.0 ;
    AccZ = (Wire.read() << 8 | Wire.read()) / 16384.0 ;
    // Sum all readings
    AccErrorX = AccErrorX + ((atan((AccY) / sqrt(pow((AccX), 2) + pow((AccZ), 2))) * 180 / PI));
    AccErrorY = AccErrorY + ((atan(-1 * (AccX) / sqrt(pow((AccY), 2) + pow((AccZ), 2))) * 180 / PI));
    c++;
  }
  //Divide the sum by 200 to get the error value
  AccErrorX = AccErrorX / 200;
  AccErrorY = AccErrorY / 200;
  c = 0;
  // Read gyro values 200 times
  while (c < 200) {
    Wire.beginTransmission(MPU);
    Wire.write(0x43);
    Wire.endTransmission(false);
    Wire.requestFrom(MPU, 6, true);
    GyroX = Wire.read() << 8 | Wire.read();
    GyroY = Wire.read() << 8 | Wire.read();
    GyroZ = Wire.read() << 8 | Wire.read();
    // Sum all readings
    GyroErrorX = GyroErrorX + (GyroX / 131.0);
    GyroErrorY = GyroErrorY + (GyroY / 131.0);
    GyroErrorZ = GyroErrorZ + (GyroZ / 131.0);
    c++;
  }
  //Divide the sum by 200 to get the error value
  GyroErrorX = GyroErrorX / 200;
  GyroErrorY = GyroErrorY / 200;
  GyroErrorZ = GyroErrorZ / 200;
  // Print the error values on the Serial Monitor
  Serial.print("AccErrorX: ");
  Serial.println(AccErrorX);
  Serial.print("AccErrorY: ");
  Serial.println(AccErrorY);
  Serial.print("GyroErrorX: ");
  Serial.println(GyroErrorX);
  Serial.print("GyroErrorY: ");
  Serial.println(GyroErrorY);
  Serial.print("GyroErrorZ: ");
  Serial.println(GyroErrorZ);
}
