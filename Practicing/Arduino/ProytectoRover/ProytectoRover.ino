int IN1 = 2;
int IN2 = 3;
int IN3 = 4;
int IN4 = 5;

int TRIG = 7;
int ECHO = 6;

void setup(){
  Serial.begin(9600);
  pinMode(IN1, OUTPUT);
  pinMode(IN2, OUTPUT);
  pinMode(IN3, OUTPUT);
  pinMode(IN4, OUTPUT);
  pinMode(TRIG, OUTPUT);
  pinMode(ECHO, INPUT);
}

void loop(){
  int DISTANCIA = getSignal(); // Calculamos la distancia del pulso
  
  if (DISTANCIA <= 15 && DISTANCIA >= 2){ // si la distancia es menor de 15cm
    para(); //DETENEMOS LOS MOTORES 200 ms
    delay(200);
          
    girar(); // RETROCEDE DURANTE
        
    para(); 
    delay(500);
  } else {                            
    avanza(); //SI NO EXISTE OBSTACULO CONTINUA AVANZANDO
  }
}

int getSignal(){
  digitalWrite(TRIG, HIGH);
  delay(10);
  digitalWrite(TRIG, LOW);

  int DISTANCIA = pulseIn(ECHO, HIGH) / 58.2;

  delay(10);

  return DISTANCIA;
  
}

void girar(){
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, HIGH);
  digitalWrite(IN3, LOW);
  digitalWrite(IN4, HIGH);
  delay(750);
}

void para(){
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, LOW);
  digitalWrite(IN3, LOW);
  digitalWrite(IN4, LOW);
}

void avanza(){
  digitalWrite(IN1, LOW);
  digitalWrite(IN2, HIGH);
  digitalWrite(IN3, HIGH);
  digitalWrite(IN4, LOW);
}
