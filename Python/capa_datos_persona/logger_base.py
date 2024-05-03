
#Manejo de Logging
# pagina: docs.python.org/3/howto/logging.html
import logging as log

#dateformat=daefmt
log.basicConfig(level=log.DEBUG,
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',
                datefmt='%I:%M:%S %p',
                handlers=[
                    log.FileHandler('capa_datos.log'),
                    log.StreamHandler()
                ]) 

# llamamos una configuracion basica
if __name__=='__main__':
   
    log.debug('Mensaje a nivel debug')
    log.info('Mensaje a nivel info')
    log.warning('Mensaje a nivel watning')
    log.error('mensaje a nivel error')
    log.critical('Mensaje a nivel critical')
    
#handler, recurso para mandar la info a la consola y configurar un archivo