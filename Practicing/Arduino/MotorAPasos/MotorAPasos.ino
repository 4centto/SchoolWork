// Arduino stepper motor control code

#include <Stepper.h> // Include the header file

// change this to the number of steps on your motor
#define STEPS 2048

// create an instance of the stepper class using the steps and pins
Stepper stepper(STEPS, 8, 10, 9, 11);

void setup() {
  Serial.begin(9600);
  stepper.setSpeed(3);
}

void loop() {
  if(Serial.available()){
    int value = Serial.parseInt();
    stepper.step(value);
  }
  digitalWrite(8, LOW);
  digitalWrite(9, LOW);
  digitalWrite(10, LOW);
  digitalWrite(11, LOW);
}
