int ENA = 5;
int IN1 = 2;
int IN2 = 3;

void setup() {
  pinMode(ENA, OUTPUT);
  pinMode(IN1, OUTPUT);
  pinMode(IN2, OUTPUT);
}

void loop() {
  digitalWrite(ENA, HIGH);
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, HIGH);

  delay(3000);
  digitalWrite(ENA, LOW);
  delay(1000);
  
}
