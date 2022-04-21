int LED = 3;
int SENSOR = 0;
int VALOR;
int PWM;

void setup() {
  pinMode(LED, OUTPUT);
}

void loop() {
  VALOR = analogRead(SENSOR);
  if(VALOR < 200){
    digitalWrite(LED, HIGH);
    delay(1000);
  }
  digitalWrite(LED, LOW);
}
