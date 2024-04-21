import psycopg2 # esto es para poder conectarnos a postrgre

conexion = psycopg2.connect(user = 'postgres', password = 'admin', host = '127.0.0.1', port = '5433', database = 'test_bd')

try: 
    with conexion:
        with conexion.cursor() as cursor: # Este uso de with cierra el recurso del cursor automaticamente
        #cursor para permitir ejecutar sentencias en sql
            cursor = conexion.cursor()
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s'
            #%s es un placeholder
            id_persona = input('Digite un numero para el id_persona: ')
            #pasamos una tupla (,) al execute
            cursor.execute(sentencia,(id_persona,)) #ejecutamos la cadena sentencia
           #fetchone va a mostrar solo uno
            registros = cursor.fetchone() #metodo fetchall recupera todos los registros de la sentencia que seran una lista
            print(registros) #recibimos una lista, pero internamente tenemos tuplas
#conexion exitosa
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:#cerramos la conexion, para que siempre se ejecute al final
    conexion.close()
    



