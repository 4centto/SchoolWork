#include <SoftwareSerial.h>

SoftwareSerial BT(6, 7); //(TXD, RXD)
int IN1 = 2;
int IN2 = 3;
int IN3 = 4;
int IN4 = 5;

char DATA = 0;

void setup() {
  Serial.begin(9600);
  BT.begin(38400);
  pinMode(IN1, OUTPUT);
  pinMode(IN2, OUTPUT);
  pinMode(IN3, OUTPUT);
  pinMode(IN4, OUTPUT);
}

void loop() {
  if(BT.available()){
    DATA = BT.read();

    switch(DATA){
      case '0':
        parar();
        break;
      case '1':
        avanzar();
        break;
      case '2':
        retroceder();
        break;
      case '3':
        izquierda();
        break;
      case '4':
        derecha();
        break;
    }
    
  }
}

void izquierda(){
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, LOW);
  digitalWrite(IN3, HIGH);
  digitalWrite(IN4, LOW);
}

void derecha(){
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, HIGH);
  digitalWrite(IN3, LOW);
  digitalWrite(IN4, LOW);
}

void retroceder(){
  digitalWrite(IN1, HIGH);
  digitalWrite(IN2, LOW);
  digitalWrite(IN3, LOW);
  digitalWrite(IN4, HIGH);
}

void avanzar(){
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, HIGH);
  digitalWrite(IN3, HIGH);
  digitalWrite(IN4, LOW);
}

void parar(){
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, LOW);
  digitalWrite(IN3, LOW);
  digitalWrite(IN4, LOW);
}
