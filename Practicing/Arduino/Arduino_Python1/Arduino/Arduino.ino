#include <Servo.h>

#define LED 4
#define MOT 5

Servo mot;

void setup() {
  Serial.begin(9600);
  delay(30);
  mot.attach(MOT);
  mot.write(0);
  pinMode(LED, OUTPUT);
  digitalWrite(LED, LOW);
}

int vmot = 0, vled = 0, pos;
String cad, cad1, cad2;

void loop() {

  if(Serial.available()){
    cad = Serial.readString();
    
    pos = cad.indexOf(",");
    cad1 = cad.substring(0, pos);
    cad2 = cad.substring(pos+1);

    if(vled != cad1.toInt()){
      vled = cad1.toInt();
      digitalWrite(LED, vled);
    }
    
    if(vmot != cad2.toInt()){
      vmot = cad2.toInt();
      mot.write(vmot);
    }    
    
    Serial.println(cad);
    
  }
  
}
