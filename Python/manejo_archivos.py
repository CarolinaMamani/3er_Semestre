
# Declaramos una variable
try:
#usamos el metodo open: para abrir archivos y trabajar en ellos
    archivo = open('prueba.txt', 'w') #sino existe lo crea, sino lo abre
# w: es write 
except Exception as e:
    print(e)
finally: #siempre se ejecuta
    archivo.close() #se cierra el archivo
