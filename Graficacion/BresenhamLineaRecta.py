import matplotlib.pyplot as plt

def bresenhamLineaRecta(x1, y1, x2, y2):
    dx, dy = x2 - x1, y2 - y1
    m = dy / dx

    x, y = x1, y1
    p = 2*(dy - dx)

    while (x < x2 or y < y2):
        if p <= 0:
            x += 1
            p = p + 2*dy
        else:
            x += 1
            y += 1
            p = p + (2*dy) - (2*dx)

        plt.plot(x, y, marker="o")

    plt.show()

        

x1 = int(input("Coordenada x1: "))
y1 = int(input("Coordenada y1: "))
x2 = int(input("Coordenada x2: "))
y2 = int(input("Coordenada y2: "))

bresenhamLineaRecta(x1, y1, x2, y2)