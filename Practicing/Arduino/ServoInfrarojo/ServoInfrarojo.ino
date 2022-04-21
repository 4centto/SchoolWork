#include <IRremote.h>
#include <Servo.h>

Servo servo1;

int MIN = 550;
int MAX = 2500;
int PINSERVO = 2;
int PINSENSOR = 3;

int v;
int ANGULO_V = 0;

int RED = 8;
int GREEN = 9;
int BLUE = 10;

bool red = false, green = false, blue = false;

IRrecv irrecv(PINSENSOR);
decode_results results;

void setup() {
  Serial.begin(9600);
  servo1.attach(PINSERVO, MIN, MAX);
  irrecv.enableIRIn();
  servo1.write(90);
  pinMode(RED, OUTPUT);
  pinMode(GREEN, OUTPUT);
  pinMode(BLUE, OUTPUT);
}

void loop() {
  if(irrecv.decode(&results)){
    v = results.value;
    Serial.println(v);
    irrecv.resume();
  }

  switch(v){
    
    case 255:
      servo1.write(180);
      break;
    case -32641:
      servo1.write(0);
      break;

    case 8415:
      digitalWrite(RED, !digitalRead(RED));
      break;
    case -24481:
      if(green == false){
        digitalWrite(GREEN, HIGH);
        green = true;
      } else {
        digitalWrite(GREEN, LOW);
        green = false;
      }
      break;
    case 24735:
      if(blue == false){
        digitalWrite(BLUE, HIGH);
        blue = true;
      } else {
        digitalWrite(BLUE, LOW);
        blue = false;
      }
      break;
      
  }
  
}
