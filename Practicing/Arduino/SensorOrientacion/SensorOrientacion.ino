int LED = 3;
int SENSOR = 2;
int ESTADO = 0;

void setup() {
  pinMode(LED, OUTPUT);
  pinMode(SENSOR, INPUT);
}

void loop() {
  ESTADO = digitalRead(SENSOR);
  digitalWrite(LED, ESTADO);
  delay(100);
}
