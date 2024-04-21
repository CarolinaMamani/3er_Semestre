import psycopg2 

conexion = psycopg2.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5433', database = 'test_bd')

try: 
    with conexion:
        with conexion.cursor() as cursor: 
            cursor = conexion.cursor()
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)'#usamos placeholders para indicar los parametros
            valores = ('Carlos','Lara','clara@gmail.com') # es una tupla
            cursor.execute(sentencia, valores)
            # esto se hacer para guardar la base de datos: 
            # conexion.commit() pero el with lo hace en automatico
            registros_insertados = cursor.rowcount
            print(f'Los regisros insertados son: {registros_insertados}')
                
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()
    
