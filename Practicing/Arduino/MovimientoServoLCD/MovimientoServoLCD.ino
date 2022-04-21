#include <LiquidCrystal.h>
#include <Servo.h>

LiquidCrystal lcd(7, 6, 5, 4, 3, 2);
Servo servo1;

int RED = 9;
int GREEN = 10;
int BLUE = 11;

int X;
int Y;
int MIN = 550;
int MAX = 2500;
int PINSERVO = 8;
int ANGULO;

void setup() {
  lcd.begin(16, 2);
  servo1.attach(PINSERVO, MIN, MAX);
  servo1.write(90);
  pinMode(RED, OUTPUT);
  pinMode(GREEN, OUTPUT);
  pinMode(BLUE, OUTPUT);
  Serial.begin(9600);
  lcd.setCursor(0,0);
  lcd.print("HOLA MUNDO");
}

void loop() {

  X = analogRead(A0);
  Y = analogRead(A1);

  delay(200);

  lcd.clear();
  if(X >= 0 && X <= 490){
    
    lcd.print("IZQUIERDA");
    ANGULO = map(X, 0, 490, 180, 0);
    servo1.write(ANGULO);
    digitalWrite(RED, HIGH);
    digitalWrite(GREEN, LOW);
    digitalWrite(BLUE, LOW);
    
  } else if(X >= 530 && X <= 1023) {
    
    lcd.print("DERECHA");
    ANGULO = map(X, 530, 1023, 180, 0);
    servo1.write(ANGULO);
    digitalWrite(BLUE, HIGH);
    digitalWrite(GREEN, LOW);
    digitalWrite(RED, LOW);
    
  } else {
    
    servo1.write(90);
    lcd.print("CENTRO");
    digitalWrite(GREEN, HIGH);
    digitalWrite(RED, LOW);
    digitalWrite(BLUE, LOW);
    
  }
}
