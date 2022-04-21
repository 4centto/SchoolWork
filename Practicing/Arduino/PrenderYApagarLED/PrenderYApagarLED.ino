void setup() { // Metodo para inicializar los pines de salida y de entrada
  pinMode(13, OUTPUT); // Se establece el pin de salida
}

void loop() { // Metodo para repetir indefinidamente uno procesos
  digitalWrite(13, HIGH); // Se da la orden de mandar una señal alta al pin de salida
  delay(100); // Se establece un retraso entre señales de 1 segundo
  digitalWrite(13, LOW); // Se da la orden de mandar una señal baja al pin de salida
  delay(100); // Se establece un retrasa entre señales de 1 segundo
}
