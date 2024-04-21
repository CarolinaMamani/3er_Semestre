import psycopg2 

conexion = psycopg2.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5433', database = 'test_bd')

try: 
    with conexion:
        with conexion.cursor() as cursor: 
            cursor = conexion.cursor()
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = (
                ('Juan Carlos','Roldan','Rodo@mail.com', 7),
                ('Anita','Koba','anito@mail.com', 1)) #una tupla de tuplas
            cursor.executemany(sentencia, valores) 
            registros_actualizados = cursor.rowcount
            print(f'Los regisros actualizados son: {registros_actualizados}')
                
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()