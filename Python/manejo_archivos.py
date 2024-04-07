
# Declaramos una variable
try:
#usamos el metodo open: para abrir archivos y trabajar en ellos
    archivo = open('prueba.txt', 'w') #sino existe lo crea, sino lo abre
# w: es write 
    archivo.write('Programamos con diferentes tipo de archivos, ahora en txt.\n')
    archivo.write('Como esto terminamos, salto de linea "\n"')
except Exception as e:
    print(e)
finally: #siempre se ejecuta
    archivo.close() #se cierra el archivo
