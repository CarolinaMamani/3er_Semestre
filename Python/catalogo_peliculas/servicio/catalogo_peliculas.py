import os #importamos desde el sistema operativo

class CatalogoPeliculas:
    #variable de clase static
    ruta_archivo = 'peliculas.txt'
    
    #metodo de clase, accede a los atributos de clase (cls)
    @classmethod 
    def agregar_peliculas(cls, pelicula):
        with open(cls.ruta_archivo, 'a', encoding="utf8") as archivo:
            archivo.write(f'{pelicula.nombre}\n')
            
    #metodo para listas las peliculas
    @classmethod
    def listar_peliculas(cls):
        with open(cls.ruta_archivo, 'r',encoding="utf8") as archivo:
            print(f'Catalogo de peliculas'.center(50,'-'))
            print(archivo.read())
            
    #metodo para eliminar peliculas
    @classmethod
    def eliminar_peliculas(cls):
        os.remove(cls.ruta_archivo)
        print(f'Archivo eliminado: {cls.ruta_archivo}')