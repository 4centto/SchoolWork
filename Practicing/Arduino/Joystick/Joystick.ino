int X;
int Y;
int IZQUIERDO = 3;
int DERECHO = 5;
int ABAJO = 6;
int ARRIBA = 9;
int PULSADOR = 10;
int LED_SW = 11;
int SW;

void setup() {
  pinMode(IZQUIERDO, OUTPUT);
  pinMode(DERECHO, OUTPUT);
  pinMode(ABAJO, OUTPUT);
  pinMode(ARRIBA, OUTPUT);
  pinMode(LED_SW, OUTPUT);
  pinMode(PULSADOR, INPUT);
  //LAS ENTRADAS ANALOGICAS NO REQUIEREN INICIALIZACION
}

void loop() {
  X = analogRead(A0);
  Y = analogRead(A1);
  SW = analogRead(PULSADOR);

  if(X >= 0 && X < 480){
    digitalWrite(IZQUIERDO, HIGH);
  } else {
    digitalWrite(IZQUIERDO, LOW);
  }

  if(X > 520 && X < 1023){
    digitalWrite(DERECHO, HIGH);
  } else {
    digitalWrite(DERECHO, LOW);
  }

  if(Y >= 0 && Y < 480){
    digitalWrite(ABAJO, HIGH);
  } else {
    digitalWrite(ABAJO, LOW);
  }

  if(Y > 520 && Y < 1023){
    digitalWrite(ARRIBA, HIGH);
  } else {
    digitalWrite(ARRIBA, LOW);
  }

  digitalWrite(LED_SW, !SW);
  
}
