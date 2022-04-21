int RED = 9;
int GREEN = 10;
int BLUE = 11;

int COLORES[3] = {9, 10, 11};

void setup() {
  pinMode(RED, OUTPUT);
  pinMode(GREEN, OUTPUT);
  pinMode(BLUE, OUTPUT);
}

void loop() {
  for(int i = 0; i < 3; i++){
    for(int j = 0; j < 255; j++){
      analogWrite(COLORES[i], j); 
      delay(10);
    }
  }
  for(int i = 2; i > 0; i--){
    for(int j = 255; j > 0; j--){
      analogWrite(COLORES[i], j); 
      delay(10);
    }
  }
}
