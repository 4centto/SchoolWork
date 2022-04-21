int RED = 9;
int GREEN = 10;
int BLUE = 11;
int red;
int green;
int blue;

void setup() {
  pinMode(RED, OUTPUT);
  pinMode(GREEN, OUTPUT);
  pinMode(BLUE, OUTPUT);
}

void loop() {
  for(red = 0; red < 254; red++){
    analogWrite(RED, red);
    delay(10);
  }
  for(green = 0; green < 254; green++){
    analogWrite(GREEN, green);
    delay(10);
  }
  for(blue = 0; blue < 254; blue++){
    analogWrite(BLUE, blue);
    delay(10);
  }
  for(green = 255; green >= 1; green--){
    analogWrite(GREEN, green);
    delay(10);
  }
  for(blue = 255; blue >= 1; blue--){
    analogWrite(BLUE, blue);
    delay(10);
  }
  for(red = 255; red >= 1; red--){
    analogWrite(RED, red);
    delay(10);
  }
}
