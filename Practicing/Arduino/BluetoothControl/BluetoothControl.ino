#include <SoftwareSerial.h>
#include <Servo.h>

SoftwareSerial BT(10, 11);
Servo servo1;
Servo servo2;
Servo servo3;
Servo servo4;

char DATO = 0;

int cUno = 90, cDos = 90, cTres = 90, cCuatro = 90;
bool movido = false, movidas = false, reiniciado = false;

void setup(){
  Serial.begin(9600);
  BT.begin(38400);
  
  servo1.attach(2, 550, 2400);
  servo2.attach(3, 550, 2500);
  servo3.attach(4, 550, 2500);
  servo4.attach(5, 550, 2500);

  delay(500);
  servo1.write(90);
  delay(50);
  servo2.write(90);
  delay(50);
  servo3.write(90);
  delay(50);
  servo4.write(90);
  delay(50);
}

//[(0, EN MEDIO),(1, IZQUIERDA),(2, DERECHA),(3, ARRIBA),(4, ABAJO)]

void loop() {
  if(BT.available()){
    
    DATO = BT.read();

    if(DATO == '3'){ //Mover la araña hacia adelante
      patasAdelante();
      if(movido == true){
        patasAtras();
        if(movidas == true){
          delay(100);
          reiniciar();
          if(reiniciado == true){
            cUno = 90;
            cDos = 90;
            cTres = 90;
            cCuatro = 90;
            movido = false;
            movidas = false;
            reiniciado = false;
          }
        }
      }
    }
    
  }
}

void reiniciar(){
  servo1.write(90);
  servo2.write(90);
  servo3.write(90);
  servo4.write(90);
  reiniciado = true; 
}

void patasAtras(){
  if(cTres < 160){
    servo4.write(cTres);
    cTres += 10;
  } else {
    movidas = true;
  }
  if(cCuatro > 20){
    servo3.write(cCuatro);
    cCuatro -= 10;
  } else {
    movidas = true;
  }
}

void patasAdelante(){
  if(cUno < 160){
    servo1.write(cUno);
    cUno += 10;
  } else {
    movido = true;
  }
  if(cDos > 20){
    servo2.write(cDos);
    cDos -= 10;
  } else {
    movido = true;
  }
}
