
opcion = None
#creamos un ciclo while
while opcion != 4:
    #introducion un try catch
    try:
        print('Opciones: ')
        print('1. Agregar Pliculas')
        print('2. Listar las peliculas')
        print('3. Eliminar catalogo de peliculas')
        print('4. Salir owe')
        #hacemos la salida y entrada para que el usuario ingrese las opciones
        opcion = int(input('Digite una opcion de menu (1-4): '))
    except Exception as e:
        print(f'Ocurrio un error de tipo: {e}')
        opcion = None
    else: #si presiona 4
        print('Salimos del programa')