import psycopg2 

conexion = psycopg2.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5433', database = 'test_bd')

try: 
    with conexion:
        with conexion.cursor() as cursor: 
            sentencia = 'DELETE FROM persona WHERE id_persona IN %s'
            entrada = input('Digite los numeros de registros a eliminar (separados por coma): ')
            valores = (tuple(entrada.split(',')),)#es una tupla de tuplas
            cursor.execute(sentencia, valores) 
            registros_eliminados = cursor.rowcount
            print(f'Los regisros eliminados son: {registros_eliminados}')
                
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()