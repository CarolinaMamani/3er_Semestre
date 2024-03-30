from NumerosIgualesException import NumerosIgualesException

# Errores o escepciones, hacen que el programa se corta de golpe
# [img] clases para el menejos de estos errores
# clase mas comun: exception
# Clase padre: BaseException

#EJEMPLOS
#1- Divicion entre zero
try:
    10/0
except Exception as e: #ZeroDivisionError es la clase hija
    print(f'Ocurrio un error: {e}')

#2- 
resultado = None
a = 7
b = 0
#3- excepciones mas especificas
try:
    resultado = a/b #modificamos

except TypeError as e: #clases hijas
    print(f'typeerror -Ocurrio un error: {type(e)}')
except ZeroDivisionError as e: #clases hijas
    print(f'zerodivisionerror- Ocurrio un error: {type(e)}')
except Exception as e: #clase padre
    print(f'exception- Ocurrio un error: {type(e)}')
print(f'El resultado es: {resultado}')
print('seguimos...')

# La clase padre va al final del bloque try except

#otra manera de escribir
try:
    a = int(input('Digite un numero: '))
    b = int(input('Digite el sgundo numero: '))
    resultado = a/b
    if a == b:
        raise NumerosIgualesException('Son numeros iguales')
except Exception as e:
    print(f'Ocurio un error: {type(e)}')

#bloques al final, else se puede usar de manera opcional
else:
    print('No se arrojo ninguna excepcion')
# finally siempre se va a ejecutar, es util para informar al usuario como termino nuestro sistema de ecepciones
    print('Ejecucion de este bloque finally')


print(f'El resultado es: {resultado}')
print('Seguimos....')

#-----------------------------------------------------
#Podemos crear clases de excepcion personalizadas




