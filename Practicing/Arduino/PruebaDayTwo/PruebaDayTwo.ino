#include <Servo.h>

Servo servo1;

int MIN = 550;
int MAX = 2500;
int PINSERVO = 2;
int ANGULO = 90;
int X;

void setup() {
  servo1.attach(PINSERVO, MIN, MAX);
}

void loop() {
  X = analogRead(A0);
  if(X >= 0 && X < 490){
    if(ANGULO != 180){
      ANGULO++;
      delay(5);
      servo1.write(ANGULO);
    }
  } else if(X > 520 && X < 1023){
    if(ANGULO != 0){
      ANGULO--;
      delay(5);
      servo1.write(ANGULO);
    }
  }
  
}
