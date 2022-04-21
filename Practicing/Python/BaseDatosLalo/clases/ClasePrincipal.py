import Laptop, Pantalla, DataBase

bd = DataBase.DataBase()

eleccion_menu, eleccion_leer, eleccion_imprimir, eleccion_buscar, eleccion_editar = 0, 0, 0, 0, 0
c1, c2, c3 = "", "", ""
lap, pan = 1, 1

while(eleccion_menu != 5):

    print("")
    print("** MENU PRINCIPAL **")
    print("  1. Leer")
    print("  2. Imprimir")
    print("  3. Buscar")
    print("  4. Editar")
    print("  5. Salir")
    print("")

    eleccion_menu = int(input("¿Que deseas hacer? "))

    if eleccion_menu == 1:
        print("  1. Laptop")
        print("  2. Pantalla")
        print("")
        eleccion_leer = int(input("¿Cual producto ingresaras? "))
        print("")

        if eleccion_leer == 1:
            l = Laptop.Laptop()
            l.setId("L" + str(lap))
            l.setMarca(input("Marca: "))
            l.setModelo(input("Modelo: "))
            l.setPrecio(input("Precio: "))

            lap += 1

            bd.setListaLaptops(l)

            print("")
            print("Se agrego correctamente la laptop")
            print("")

        elif eleccion_leer == 2:
            p = Pantalla.Pantalla()
            p.setId("P" + str(pan))
            p.setMarca(input("Marca: "))
            p.setModelo(input("Modelo: "))
            p.setPrecio(input("Precio: "))

            pan = pan + 1

            bd.setListaPantallas(p)

            print("")
            print("Se agrego correctamente la pantalla")
            print("")

        else:
            print("")
            print("El producto seleccionado no existe")
            print("")

    elif eleccion_menu == 2:
        print("")
        print("  1. Laptop")
        print("  2. Pantalla")
        print("")
        eleccion_imprimir = int(input("¿Que productos deseas imprimir? "))

        if eleccion_imprimir == 1:
            lista_laptops = bd.getListaLaptops()

            if len(lista_laptops) == 0:
                print("")
                print("No hay laptops registradas aun")
            else:
                print("")
                print("**** LAPTOPS ****")
                for i in range(len(lista_laptops)):
                    print("ID:", lista_laptops[i].getId())
                    print("   Marca:", lista_laptops[i].getMarca())
                    print("   Modelo:", lista_laptops[i].getModelo())
                    print("   Precio:", lista_laptops[i].getPrecio())
                    print("")
                print("*****************")

        elif eleccion_imprimir == 2:
            lista_pantallas = bd.getListaPantallas()

            if len(lista_pantallas) == 0:
                print("")
                print("No hay pantallas registradas aun")
            else:
                print("")
                print("**** PANTALLAS ****")
                for i in range(len(lista_pantallas)):
                    print("ID:", lista_pantallas[i].getId())
                    print("   Marca:", lista_pantallas[i].getMarca())
                    print("   Modelo:", lista_pantallas[i].getModelo())
                    print("   Precio:", lista_pantallas[i].getPrecio())
                    print("")
                print("*******************")

        else:
            print("")
            print("Los productos seleccionados no existen")

    elif eleccion_menu == 3:
        print("")
        print("  1. Laptop")
        print("  2. Pantalla")
        print("")
        eleccion_buscar = int(input("¿Que productos deseas buscar? "))

        if eleccion_buscar == 1:
            lista_laptops = bd.getListaLaptops()

            if len(lista_laptops) == 0:
                print("")
                print("* No hay laptops registradas aun *")
            else:
                id_ = input("Ingresa el ID de la laptop: ")
                contador = 0
                for i in range(len(lista_laptops)):
                    if lista_laptops[i].getId() == id_:
                        contador += 1
                        print("* " + str(lista_laptops[i].getId()) + " *")
                        print("   Marca:", lista_laptops[i].getMarca())
                        print("   Modelo:", lista_laptops[i].getModelo())
                        print("   Precio:", lista_laptops[i].getPrecio())
                        print("")

                if contador == 0:
                    print("")
                    print("* No se encontraron coincidencias *")

        elif eleccion_buscar == 2:
            lista_pantallas = bd.getListaPantallas()

            if len(lista_pantallas) == 0:
                print("")
                print("* No hay pantallas registradas aun *")
            else:
                id_ = input("Ingresa el ID de la pantalla: ")
                contador = 0
                for i in range(len(lista_pantallas)):
                    if lista_pantallas[i].getId() == id_:
                        contador += 1
                        print("* " + str(lista_pantallas[i].getId()) + " *")
                        print("   Marca:", lista_pantallas[i].getMarca())
                        print("   Modelo:", lista_pantallas[i].getModelo())
                        print("   Precio:", lista_pantallas[i].getPrecio())
                        print("")

                if contador == 0:
                    print("")
                    print("* No se encontraron coincidencias *")

        else:
            print("")
            print("Los productos seleccionados no existen")

    elif eleccion_menu == 4:
        print("")
        print("  1. Laptop")
        print("  2. Pantalla")
        print("")
        eleccion_editar = int(input("¿Que productos deseas editar? "))

        if eleccion_buscar == 1:
            lista_laptops = bd.getListaLaptops()

            if len(lista_laptops) == 0:
                print("")
                print("* No hay laptops registradas aun *")
            else:
                id_ = input("Ingresa el ID de la laptop: ")
                contador = 0
                for i in range(len(lista_laptops)):
                    if lista_laptops[i].getId() == id_:
                        contador += 1
                        marca = input("Marca: ")
                        modelo = input("Modelo: ")
                        precio = input("Precio: ")

                        bd.listaLaptopModificada(id_, marca, modelo, precio)

                        print("* Producto modificado correctamente *")

                if contador == 0:
                    print("")
                    print("* No se encontraron coincidencias *")

        elif eleccion_buscar == 2:
            lista_pantallas = bd.getListaPantallas()

            if len(lista_pantallas) == 0:
                print("")
                print("* No hay pantallas registradas aun *")
            else:
                id_ = input("Ingresa el ID de la pantalla: ")
                contador = 0
                for i in range(len(lista_pantallas)):
                    if lista_pantallas[i].getId() == id_:
                        contador += 1
                        marca = input("Marca: ")
                        modelo = input("Modelo: ")
                        precio = input("Precio: ")

                        bd.listaPantallaModificada(id_, marca, modelo, precio)

                        print("* Producto modificado correctamente *")

                if contador == 0:
                    print("")
                    print("* No se encontraron coincidencias *")

        else:
            print("")
            print("Los productos seleccionados no existen")

    elif eleccion_menu == 5:
        break
    else:
        print("La opcion que ingresaste no existe :(")

print("¡¡Hasta Luego!!")