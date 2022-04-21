#include <Servo.h>
/*
Este rpograma hace que mientras mas cerca este un objeto del sensor, el servo, se mueva de direccion
*/

Servo servo1;

int TRIG = 10;
int ECHO = 9;
int PINSERVO = 3;
int DURACION;
int DISTANCIA;
int PULSOMIN = 550;
int PULSOMAX = 2500;
int ANGULO = 0;
int LED = 5;

void setup() {
  servo1.attach(PINSERVO, PULSOMIN, PULSOMAX);
  pinMode(TRIG, OUTPUT);
  pinMode(ECHO, INPUT);
  pinMode(LED, OUTPUT);
}

void loop() {

  digitalWrite(TRIG, HIGH);
  delay(1);
  digitalWrite(TRIG, LOW);

  DURACION = pulseIn(ECHO, HIGH);
  DISTANCIA = DURACION / 52.8;

  delay(200);

  if(DISTANCIA > 5){

    digitalWrite(LED, HIGH);
    delay(DISTANCIA * 10);
    digitalWrite(LED, LOW);
    
  } else if(DISTANCIA <= 5){
    digitalWrite(LED, HIGH);
  }

  ANGULO = map(DISTANCIA, 0, 20, 0, 180);

  servo1.write(ANGULO);
  delay(20);
  
}
