#include <Servo.h>

Servo servo1;

int PINSERVO = 2;
int PULSOMIN = 550;
int PULSOMAX = 2500;
int VALORPUT;
int ANGULO;
int POT = 0;
int LED = 3;
int BRILLO;

void setup() {
  pinMode(LED, OUTPUT);
  servo1.attach(PINSERVO, PULSOMIN, PULSOMAX);
  //Las entradas analogicas no requieren inicializacion
}

void loop() {
  VALORPUT = analogRead(POT);
  ANGULO = map(VALORPUT, 0, 1023, 0, 180);
  servo1.write(ANGULO);
  delay(10);
  BRILLO = VALORPUT / 4;
  analogWrite(LED, BRILLO);
}
