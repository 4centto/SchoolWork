#include <LiquidCrystal.h>

LiquidCrystal lcd(7, 6, 5, 4, 3, 2); // Pines a los que esta conectado el lcd
int tiempo = 0;

void setup() {
  lcd.begin(16, 2); //Columnas, Filas
}

void loop() {
  /*
  lcd.setCursor(0, 0);
  lcd.print("Hola, han pasado: ");
  lcd.setCursor(0, 1);
  tiempo = millis() / 1000;
  lcd.print(tiempo);
  lcd.print(" seg.");
  */

  //lcd.setCursor(0, 0);
  //lcd.print("Ingrese clave: ");
  /*
  lcd.display();
  delay(500);
  lcd.noDisplay();
  delay(500);
  */
  //lcd.setCursor(0, 1);
  //lcd.cursor();
  //delay(500);
  //lcd.noCursor();
  //delay(500);

  lcd.setCursor(2, 0);
  lcd.print("Prueba Scroll");
  lcd.scrollDisplayLeft();
  delay(1000);
  
}
