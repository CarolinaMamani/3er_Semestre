
from dominio.Pelicula import Pelicula
from servicio.catalogo_peliculas import CatalogoPeliculas as cp # vamos a usar esa clase con el nombbre cp

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
        if opcion == 1:
            nombre_pelicula = input('Digite le nombre de la pelicula: ')
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_peliculas(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_peliculas()
    
    except Exception as e:
        print(f'Ocurrio un error de tipo: {e}')
        opcion = None
    else: #si presiona 4
        print('Salimos del programa...')