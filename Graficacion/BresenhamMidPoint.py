import matplotlib.pyplot as plt

def plotPoint(xc, yc, x, y):
    one = (xc + x, yc + y)
    two = (xc - x, yc + y)
    three = (xc + x, yc - y)
    four = (xc - x, yc - y)
    five = (xc + y, yc + x)
    six = (xc - y, yc + x)
    seven = (xc + y, yc - x)
    eight = (xc - y, yc - x)

    return [one, two, three, four, five, six, seven, eight]

def circleMidPoint(xc, yc, r):
    x, y, p = 0, r, 1 - r
    puntosT = []

    for punto in plotPoint(xc, yc, x, y):
        puntosT.append(punto)

    print(" k | Pk | x,y | 2Xk+1 | 2Yk+1")

    while x <= y:
        x = x + 1
        if p < 0:
            p = p + (2*x) + 3
        else:
            y = y - 1
            p = p + (2 * (x-y)) + 5
        
        for punto in plotPoint(xc, yc, x, y):
            puntosT.append(punto)

        print(f" {x-1} | {p} | {x},{y} | {2*x} | {2*y}")
    
    return puntosT

xc = int(input("Dame xc: "))
yc = int(input("Dame yc: "))
r = int(input("Dame el radio: "))

for p in circleMidPoint(xc, yc, r):
  plt.plot(p[0], p[1], marker="o")

plt.title("Algoritmo punto medio Bresenham")
plt.show()