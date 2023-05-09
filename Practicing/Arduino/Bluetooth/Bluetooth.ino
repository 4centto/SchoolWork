/*
COMANDOS AT

  AT+NAME     Nombre del dispositivo
  AT+PSWD     Contraseña (PIN)
  AT+UART     Parámetros de comunicación
  AT+ROLE     Rol del dispositivo (0: Esclavo, 1: Maestro)
  AT+ORLG     Restaura valores de fabrica
  AT+RESET    Vuelve a modo usuario

  COMANDO? -> Lectura para valores (No modifica)
    AT+NAME?
    AT+PSWD?

  COMANDO= -> Asigna valores (Modifica)
    AT+NAME=""
    AT+PSWD=1234

*/

#include <SoftwareSerial.h>

SoftwareSerial miBT(10, 11); //(TXD, RXD)

void setup() {
  Serial.begin(9600);
  Serial.println("LISTO!!");
  miBT.begin(38400);
}

void loop() {
  if(miBT.available()){  //Lee BT y envia a arduino
    Serial.write(miBT.read());
  }
}
