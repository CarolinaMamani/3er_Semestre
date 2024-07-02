from psycopg2 import pool
from logger_base import log
import sys

class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5433'
    _HOST = '127.0.0.1'
    _MIN_CON = 1 #minimo de conecciones del connection pool
    _MAX_CON = 5 # no colocar tantos
    _pool = None
    
      
    @classmethod
    def obtenerConexion(cls):
        pass
    
    @classmethod
    def obtenerCursor(cls):
        pass
    
    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool()
    
if __name__ == '__main__':
    pass