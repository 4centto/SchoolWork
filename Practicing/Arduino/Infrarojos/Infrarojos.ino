#include <IRremote.h>

int reciver = 7;
IRrecv irrecv(reciver);
decode_results results;

int v;
boolean l1 = false;

void setup() {
  Serial.begin(9600);
  Serial.println("IR FUNCIONANDO");
  irrecv.enableIRIn();
  pinMode(2, OUTPUT);
}

void loop() {
  if(irrecv.decode(&results)){
    v = results.value;
    Serial.print("Boton: ");
    Serial.println(results.value);
    irrecv.resume();
  }
  switch(v){
    case 3251424817:
        l1 = !l1;
        if(l1){
          digitalWrite(2, HIGH);
        } else {
          digitalWrite(2, LOW);
        }
      break;
  }
}
