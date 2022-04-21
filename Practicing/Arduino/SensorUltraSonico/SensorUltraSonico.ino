int TRIG = 10;
int ECHO = 9;
int LED = 3;
int DURACION;
int DISTANCIA;

void setup() {
  pinMode(TRIG, OUTPUT);
  pinMode(ECHO, INPUT);
  pinMode(LED, OUTPUT);
}

void loop() {
  
  digitalWrite(TRIG, HIGH); // El trigger dispara una señal alta
  delay(1); // Demora 1ms
  digitalWrite(TRIG, LOW); // Deja de mandar señal el trigger
  
  DURACION = pulseIn(ECHO, HIGH); // Captamos la duracion que tarda en llegar el pulso
  DISTANCIA = DURACION / 58.2; // Calculamos la distancia en funcion de la duracion
  
  delay(200); //Tradamos 200ms
  
  if(DISTANCIA > 5){ // Si la distancia es mayor a 5, parpadea
    
    digitalWrite(LED, HIGH);
    delay(DISTANCIA * 10);
    digitalWrite(LED, LOW);
    
  } else if(DISTANCIA <= 5){ // Si la distancia es menor o igual a 5, el LED queda encendido
    
    digitalWrite(LED, HIGH);
    
  }
  
}
