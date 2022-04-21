#include <LiquidCrystal.h>

LiquidCrystal lcd(7, 6, 5, 4, 3, 2);
int LED = 10;
int Y;
int X;
int BRILLO = 0;
int PORCENTAJE = 0;
String COLOR = "ROJO";

int POSICION = 0;

int COLORES[3] = {9, 10, 11};
int BRILLOS[3] = {0, 0, 0};

void setup() {
  lcd.begin(16, 2);
  pinMode(COLORES[0], OUTPUT);
  pinMode(COLORES[1], OUTPUT);
  pinMode(COLORES[2], OUTPUT);
  Serial.begin(9600);
}

void loop() {
  Y = analogRead(A0);
  X = analogRead(A1);

  if(Y >= 0 && Y <= 480){
    BRILLO = BRILLOS[POSICION];
    if(BRILLO != 255){
      BRILLO ++;
      BRILLOS[POSICION] = BRILLO;
      delay(10);
      lcd.clear();
    }
  } else if(Y >= 540 && Y <= 1023) {
    BRILLO = BRILLOS[POSICION];
    if(BRILLO != 0){
      BRILLO --;
      BRILLOS[POSICION] = BRILLO;
      delay(10);
      lcd.clear();
    }
  } else if(X >= 0 && X <= 480){
    delay(300);
    if(POSICION != 0){
      POSICION --;
      COLOR = encontrarColor(POSICION);
      lcd.clear();
    } else {
      POSICION = 2;
      COLOR = encontrarColor(POSICION);
      lcd.clear();
    }
  } else if(X >= 540 && X <= 1023){
    delay(300);
    if(POSICION != 2){
      POSICION ++;
      COLOR = encontrarColor(POSICION);
      lcd.clear();
    } else {
      POSICION = 0;
      COLOR = encontrarColor(POSICION);
      lcd.clear();
    }
  }
  
  analogWrite(COLORES[POSICION], BRILLOS[POSICION]);

  lcd.setCursor(0, 1);
  lcd.print("Color: ");
  lcd.print(COLOR);
  
  lcd.setCursor(0, 0);
  lcd.print("Brillo: ");
  PORCENTAJE = (BRILLOS[POSICION] * 100) / 255;
  lcd.print(PORCENTAJE);
  lcd.print("%");
  
}

String encontrarColor(int POSICION){
  switch(POSICION){
    case 0:
      return "ROJO";
      break;
    case 1:
      return "VERDE"; 
      break;
    case 2:
      return "AZUL";
      break;
  }
}
