#include <LiquidCrystal.h>

LiquidCrystal lcd(7, 6, 5, 4, 3, 2); // Pines a los que esta conectado el lcd

int TRIG = 12;
int ECHO = 11;
int DURACION;
int DISTANCIA;
int BUZZER = 8;

int LED = 10;

float sinVal;
int toneVal;

void setup() {
  lcd.begin(16, 2); //Columnas, Filas
  pinMode(TRIG, OUTPUT);
  pinMode(ECHO, INPUT);
  pinMode(BUZZER, OUTPUT);
  pinMode(LED, OUTPUT);
}

void loop() {

  digitalWrite(TRIG, HIGH);
  delay(1);
  digitalWrite(TRIG, LOW);
  
  DURACION = pulseIn(ECHO, HIGH);
  DISTANCIA = DURACION / 58.2;

  delay(200);
  
  lcd.setCursor(0, 0);
  lcd.print("EL OBJETO ESTA A: ");
  lcd.setCursor(0, 1);
  lcd.print(DISTANCIA);
  lcd.print("cm");

  if (DISTANCIA <= 5){
    for(int i = 0; i < 180; i++){
      //Convertimos de grados a radianes
      sinVal = (sin(i * (3.1412 / 180)));
  
      //Generar una frecuencia a partir del valor de sin
      toneVal = 2000 + (int(sinVal * 1000));
      
      tone(BUZZER, toneVal); //(pin, frecuency, duration)
      analogWrite(LED, map(toneVal, 2000, 3000, 0, 255));
      delay(2);
    }
  } else {
    noTone(BUZZER);
    digitalWrite(LED, LOW);
  }
  
}
