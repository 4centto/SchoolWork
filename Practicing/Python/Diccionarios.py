ages = {"Dave":24, "Mary":42, "John":58}

print(ages["Dave"])
print(ages["John"])
print(ages["Mary"])

#Funciones de diccionarios
squares = {1: 1, 2: 4, 3: "error", 4: 16}
squares[8] = 64
squares[3] = 9
print(squares)

#Comprobar que algun dato esta dentro de un diccionario
nums = {
    1: "one",
    2: "two",
    3: "three",
}
print(1 in nums)
print("three" in nums)
print(4 not in nums)