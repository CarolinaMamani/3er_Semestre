#copy path, y pegamos la ruta especifica del archivo, agregamos \\ para que no lo vea como caracter especial
archivo = open('C:\\Users\\NYOK\\Documents\\405\\3er_Semestre\prueba.txt','r', 
               encoding= 'utf8')
#r : read
#print(archivo.read())
#a: append, anexamos informacion
#x: para crear archivos

#print(archivo.read(17))
#print(archivo.read(10)) #continuamos desde la linea anterior

print(archivo.readline()) #lee la primera linea
print(archivo.readline())

#Vamos a iterar el archivo, cada una de las lineas

#for linea in archivo:
    #print(linea) Iteramos todos los elementos del archivo linea por linea
    
print(archivo.readlines(1))
print(archivo.readlines()[1])#accedemos al archivo como si fuera una lista separada por comas
# con [] muestrra la oracion


