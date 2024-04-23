import psycopg2 as bd

conexion = bd.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5433', database = 'test_bd')

try: 
   conexion.autocommit = False #transacciones, si no hacemos commit entonces no se guardan los cambios
   cursor = conexion.cursor()
   sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
   valores = ('Maria','Llanos','maloi@mail.com')
   cursor.execute(sentencia,valores)
   print('Termina la transanccion')
   
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()