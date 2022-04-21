int LED = 3;
int BRILLO;
int POT = 0;

void setup() {
  pinMode(LED, OUTPUT);
  //Las entradas analogicas no requieren inicializacion;
}
void loop() {
  /* SIN POTENCIOMETRO
  for(BRILLO = 0; BRILLO < 256; BRILLO++){
    analogWrite(LED, 127);
    delay(15);
  }
  for(BRILLO = 0; BRILLO >= 0; BRILLO--){
    analogWrite(LED, 127);
    delay(15);
  }
  */
  //CON POTENCIOMETRO
  BRILLO = analogRead(POT) / 4;
  analogWrite(LED, BRILLO);
}
