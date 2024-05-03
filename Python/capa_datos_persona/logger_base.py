
#Manejo de Logging
import logging as log

# llamamos una configuracion basica
if __name__=='__main__':
    log.basicConfig(level=log.DEBUG)
    log.debug('Mensaje a nivel debug')
    log.info('Mensaje a nivel info')
    log.warning('Mensaje a nivel watning')
    log.error('mensaje a nivel error')
    log.critical('Mensaje a nivel critical')