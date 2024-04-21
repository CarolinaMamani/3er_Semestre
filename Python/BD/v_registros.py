import psycopg2 # esto es para poder conectarnos a postrgre

conexion = psycopg2.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5433', database = 'test_bd')

try: 
    with conexion:
        with conexion.cursor() as cursor: 
            cursor = conexion.cursor()
            sentencia = 'SELECT * FROM persona WHERE id_persona IN %s'
            entrada = input('Digite los id_persona a buscar(separados por coma): ')
            llaves_primarias = (tuple(entrada.split(', ')),)#tupla de tuplas
            cursor.execute(sentencia, llaves_primarias)
            registros = cursor.fetchall() 
            for registro in registros:
                print(registro)
                
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()
    


