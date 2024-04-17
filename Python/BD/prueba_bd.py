import psycopg2 # esto es para poder conectarnos a postrgre

conexion = psycopg2.connect(
    user = 'postgres',
    password = 'admin',
    host = '127.0.0.1',
    port = '5433',
    database = 'test_bd'
)

#cursor para permitir ejecutar sentencias en sql
cursor = conexion.cursor()
sentencia = 'SELECT * FROM persona'
cursor.execute(sentencia) #ejecutamos la cadena sentencia
registros = cursor.fetchall() #metodo fetchall recupera todos los registros de la sentencia que seran una lista

print(registros) #recibimos una lista, pero internamente tenemos tuplas
#conexion exitosa
#cerramos la conexion
cursor.close()
conexion.close()

