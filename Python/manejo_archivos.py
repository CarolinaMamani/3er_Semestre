
# Declaramos una variable
try:
#usamos el metodo open: para abrir archivos y trabajar en ellos
    archivo = open('prueba.txt', 'w', encoding = 'utf8') #sino existe lo crea, sino lo abre
# w: es write 
#utf8: para acentos
    archivo.write('Programamos con diferentes tipo de archivos, ahora en txt.\n Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo acción\n')
    archivo.write('Como esto terminamos, salto de linea "\n"')
except Exception as e:
    print(e)
finally: #siempre se ejecuta
    archivo.close() #se cierra el archivo
#archivo.write('todo quedo perfecto') : este es un error
