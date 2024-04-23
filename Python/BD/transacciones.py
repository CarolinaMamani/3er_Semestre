import psycopg2 as bd

conexion = bd.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5433', database = 'test_bd')

try: 
    #esto no deberia estar
   # conexion.autocommit = False #transacciones, si no hacemos commit entonces no se guardan los cambios
   cursor = conexion.cursor()
   sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
   valores = ('Maria','Llanos','maloi@mail.com')
   cursor.execute(sentencia,valores)
   conexion.commit() #hacemos el commit manualmente
   print('Termina la transanccion')
   
except Exception as e:
    conexion.rollback() #sino se hacer el comit hace rollback y queda todo como el principio
    print(f'Ocurrio un error, se hizo un roll back: {e}')
finally:
    conexion.close()