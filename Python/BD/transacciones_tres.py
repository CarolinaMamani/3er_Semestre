import psycopg2 as bd

conexion = bd.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5433', database = 'test_bd')

try: 
    with conexion: # todo sucede de manera automatica, esta es la mejor manera
        with conexion.cursor() as cursor:

            #nueva insercion de elemento
            sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
            valores = ('Aroow','Jita','arrocito@mail.com')
            cursor.execute(sentencia,valores)
            
            #modificando un elemento
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = ('Gumball','Waterson','zack@mail.com',1)
            cursor.execute(sentencia,valores)
            
except Exception as e:
    print(f'Ocurrio un error, se hizo un roll back: {e}')
finally:
    conexion.close()
    
print('Termina la transanccion')