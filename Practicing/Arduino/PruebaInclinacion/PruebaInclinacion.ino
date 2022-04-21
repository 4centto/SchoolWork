int SENSOR = 3;
int LED = 4;

void setup() {
  pinMode(SENSOR, INPUT);
  pinMode(LED, OUTPUT);
}

void loop() {
  if(digitalRead(SENSOR) == HIGH){
    digitalWrite(LED, LOW);
  } else{
    digitalWrite(LED, HIGH);
  }
}
