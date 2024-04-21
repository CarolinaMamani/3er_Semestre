import psycopg2 

conexion = psycopg2.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5433', database = 'test_bd')

try: 
    with conexion:
        with conexion.cursor() as cursor: 
            cursor = conexion.cursor()
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)'#usamos placeholders para indicar los parametros
            valores = (
                ('Carlos','Lara','clara@gmail.com'),
                ('Marcos', 'Canto','mcanto@email.com'),
                ('Marc','Cuecna','canica@mail.com')
                ) # es una tupla de tuplas
            cursor.executemany(sentencia, valores) #insermany para ejecutar varios
            registros_insertados = cursor.rowcount
            print(f'Los regisros insertados son: {registros_insertados}')
                
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()