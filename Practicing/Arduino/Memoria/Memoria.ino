struct Nodo{
  Nodo *prev;
  String dato;
  Nodo *next;
};

Nodo *createNodo(String dato){
  Nodo *nuevo = new Nodo();
  nuevo->prev = NULL;
  nuevo->dato = dato;
  nuevo->next = NULL;
  return nuevo;
}

void push(String dato, Nodo *&lista){
  Nodo *nuevo = createNodo(dato);
  if(lista == NULL){
    lista = nuevo;
    Serial.println("Direccion agregada!!");
  } else {
    Nodo *aux = lista;
    while(aux->next != NULL){
      aux = aux->next;
    }
    nuevo->prev = aux;
    aux->next = nuevo;
    Serial.println("Direccion agregada!!");
  }
}

void toString(Nodo *lista){
  Nodo *aux = lista;
  while(aux != NULL){
    Serial.println("[" + aux->dato + "]");
    aux = aux->next;
  }
  Serial.println("");
}

void pop(Nodo *&lista){
  Nodo *aux = lista;
  while(aux->next != NULL){
    aux = aux->next;
  }
  aux->prev->next = NULL;
  aux->prev = NULL;
  Serial.println("Nodo eliminado correctamente!!");
}

Nodo *lista;
int CONTADOR = 0;

void setup() {
  Serial.begin(9600);
}

void loop() {
  push("HOLA " + (String)(CONTADOR), lista);
  toString(lista);
  CONTADOR ++;
  if(CONTADOR == 5){
    pop(lista);
    toString(lista);
  }
  delay(3000);
}
