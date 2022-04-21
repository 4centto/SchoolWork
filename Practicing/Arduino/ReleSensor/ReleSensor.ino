int RELE = 2;
int ECHO = 3;
int TRIG = 4;

bool ON = false;

void setup() {
  pinMode(RELE, OUTPUT);
  pinMode(ECHO, INPUT);
  pinMode(TRIG, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  delay(10);
  digitalWrite(TRIG, HIGH);
  delay(10);
  digitalWrite(TRIG, LOW);
  
  int DISTANCIA = pulseIn(ECHO, HIGH) / 58.2;

  if(DISTANCIA <= 10){
    if(ON == true){
      delay(10);
      digitalWrite(RELE, HIGH);
      ON = false;
    } else {
      delay(10);
      digitalWrite(RELE, LOW);
      ON = true;
    }
    delay(5000);
  }
  
}
