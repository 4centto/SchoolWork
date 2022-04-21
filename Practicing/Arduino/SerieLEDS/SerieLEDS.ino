int COLORES[9] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
int NUM_RANDOM;
int TIEMPO;
float ULTIMO_TIEMPO;

void setup() {
  for(int i = 0; i < 9; i++){
    pinMode(COLORES[i], OUTPUT);
  }
  Serial.begin(9600);
}

void loop() {

  NUM_RANDOM = random(1, 5);

  switch(NUM_RANDOM){
    case 1:
      serieOne();
      delay(800);
      break;
      
    case 2:
      serieTwo();
      delay(800);
      break;
      
    case 3:
      serieThree();
      delay(800);
      break;
      
    case 4:
      serieFour();
      delay(800);
      break;
      
  }
  
}

void serieOne(){
  for(int i = 0; i < 9; i++){
    digitalWrite(COLORES[i], HIGH);
    delay(20);
    digitalWrite(COLORES[i], LOW);
    delay(20);
  }
  delay(20);
  for(int i = 8; i > 0; i--){
    digitalWrite(COLORES[i], HIGH);
    delay(20);
    digitalWrite(COLORES[i], LOW);
    delay(20);
  }
}

void serieTwo(){
  digitalWrite(COLORES[4], HIGH);
  delay(20);

  for(int i = 1; i < 5; i++){
    digitalWrite(COLORES[4 - i], HIGH);
    digitalWrite(COLORES[4 + i], HIGH);
    delay(100);
    digitalWrite(COLORES[4 - i], LOW);
    digitalWrite(COLORES[4 + i], LOW);
    delay(100);
  }

  for(int i = 4; i > -1; i--){
    digitalWrite(COLORES[4 - i], HIGH);
    digitalWrite(COLORES[4 + i], HIGH);
    delay(100);
    digitalWrite(COLORES[4 - i], LOW);
    digitalWrite(COLORES[4 + i], LOW);
  }
}

void serieThree(){
  for(int k = 0; k < 20; k++){
    NUM_RANDOM = random(0, 10);
    delay(1);
  
    for(int i = 0; i < 256; i++){
      analogWrite(COLORES[NUM_RANDOM], i);
      delay(1);
    }
    for(int i = 255; i > -1; i--){
      analogWrite(COLORES[NUM_RANDOM], i);
      delay(1);
    }
  }
}

void serieFour(){
  for(int i = 0; i < 9; i++){
    digitalWrite(COLORES[i], HIGH);
    delay(100);
  }
  for(int i = 0; i < 9; i++){
    digitalWrite(COLORES[i], LOW);
    delay(100);
  }
  for(int i = 8; i > -1; i--){
    digitalWrite(COLORES[i], HIGH);
    delay(100);
  }
  for(int i = 8; i > -1; i--){
    digitalWrite(COLORES[i], LOW);
    delay(100);
  }
}
