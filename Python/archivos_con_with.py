# MANEJO DE CONTEXTO WITH: sintaxis simplificada, abre y cierra el archivo automaticamente

from ManejoArchivos2 import ManejoArchivos2

'''
with open('prueba.txt', 'r', encoding='utf8') as archivo: #manejo de contexto with
    print(archivo.read())
    #no es necesario el try ni el finally
    #context manager
    
    utiliza diferentes metodos: 
        __enter__ este es el que abre
        __exit__ este el que cierra
    
'''
    

with ManejoArchivos2('prueba.txt') as archivo:
    print(archivo.read())