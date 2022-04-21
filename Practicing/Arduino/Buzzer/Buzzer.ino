float sinVal;
int toneVal;

void setup() {
  pinMode(8, OUTPUT); // Definimos el pin 8 como salida
}

void loop() {
  for(int i = 0; i < 180; i++){
    //Convertimos de grados a radianes
    sinVal = (sin(i * (3.1412 / 180)));

    //Generar una frecuencia a partir del valor de sin
    toneVal = 2000 + (int(sinVal * 1000));
    
    tone(8, toneVal); //(pin, frecuency, duration)
    delay(2);
  }
}
