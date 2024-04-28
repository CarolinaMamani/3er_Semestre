import psycopg2 as bd

conexion = bd.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5433', database = 'test_bd')

try: 

   conexion.autocommit = False# se inicia la transaccion
   
   #nueva insercion de elemento
   cursor = conexion.cursor()
   sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
   valores = ('Roger','Waterson','rabit@mail.com')
   cursor.execute(sentencia,valores)
   
   #modificando un elemento
   sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
   valores = ('Yanes','Waterson','jwton@mail.com',1)
   cursor.execute(sentencia,valores)
   
   conexion.commit() # se cierra la transaccion
   print('Termina la transanccion')
   
except Exception as e:
    conexion.rollback() #sino se hacer el comit hace rollback y queda todo como el principio
    print(f'Ocurrio un error, se hizo un roll back: {e}')
finally:
    conexion.close()