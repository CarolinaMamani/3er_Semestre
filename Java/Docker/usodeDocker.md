### Instalación de Docker video 1 - EXITOSA

## Comandos comunes en Docker

### (para correr e iniciar contenedores basados en imágenes:)

- `docker run`: Permite correr una imagen que se convierte en un contenedor.
  - Con un tag: `docker run postgres:lastest`
- `docker pull`: Solo descarga la imagen pero no la ejecuta.
- `docker images | head`: Todas las imágenes hosteadas en mi computadora.
- `docker ps`: Muestra los contenedores que estamos corriendo.
- `docker ps -a`: Muestra todos los contenedores que corrieron hace un tiempo.
- `docker start f2a09f7a79bd`: Se puede volver a correr un contenedor con su id para que recupere los últimos datos que hayas agregado.
- `docker logs f2a09f7a79bd`: Para ver los logs de un contenedor específico con su id.
- `docker logs -f f2a09f7a79bd`: Con la opción `-f` muestra los logs pero no cierra sino se sigue el log.
- `docker exec`: Ejecuta un comando dentro de un contenedor que ya está corriendo.
  - `docker exec -it f2a09f7a79bd sh`: Este comando `-i` crea una sesión interactiva, el `t` emula una terminal dentro del contenedor (id). Entonces se puede ejecutar por ejemplo un sh (una shell).
    - `ls`: Dentro ahora podemos hacer el ls para ver el contenido del contenedor.
  - `docker stop f2a09f7a79bd`: Detiene el contenedor específico con su id.
- `docker run -d nginx`: Para correr el contenedor en background usando `-d` y el nombre de la imagen.

En un mismo comando también se pueden ejecutar varios contenedores usando sus id o nombres.

## Cómo desarrollar una app usando un contenedor de Docker?

1. Creamos un Dockerfile que contiene:

   - `FROM`: Especifica la imagen base.
   - `WORKDIR`: Declara el directorio de trabajo.
   - `COPY`: Copia los archivos al contenedor.
   - `RUN`: Ejecuta comandos.
   - `CMD`: Especifica el comando por defecto para el contenedor.
     - Ejemplo: `CMD ["node", "/app/src/index.js"]`.

2. Declarar donde vamos a hacer todo nuestro trabajo:

   - `WORKDIR /app`: `/app` es un directorio que no existe en node, pero se va a crear automáticamente. Todos los comandos que haga en ese directorio se van a correr dentro de este.

3. `COPY . .`: Copia el directorio en el que estoy en mi app todos los archivos que tengo en mi directorio (Dockerfile) los va a copiar dentro del contenedor en punto (.) en este caso `/app`.

4. `RUN yarn install --production`: Compila todo que tenemos en nuestro código en node.

5. Al final de cada una de las imágenes de Dockerfile, debemos especificar lo que queremos que vaya a correr:
   - `CMD ["node", "/app/src/index.js"]`: Por ejemplo, en el caso de arriba. Queremos que corra "node" y como argumento "/app/src/index.js" cuando se inicie el contenedor va a correr ese binario.
   - También se podría usar `ENTRYPOINT node`: El entrypoint permite dejar abierto un comando para después pasarle argumentos. Es útil en una imagen de Python. Cuando se hace correr la imagen al final tendríamos que pasarle este argumento `/app/src/index.js`. Todo esto es en el caso de que se tenga varios binarios que se quieran correr.

## Cómo construir un contenedor?

1. Usamos el comando:

   - `docker build .`: Construye el contenedor.
     - Pero es mejor si le agregamos un tag para darle un nombre: `docker build -t nombreImagen .`

2. Ahora comienza la descarga de la imagen en node, va a copiar todos los archivos y va a correr el `yarn install --production`.

   - LISTO, la imagen construida de nuestra aplicación. Aquí solo construimos la imagen, no la corrimos.

3. Para correr la imagen:

   - `docker run nombreImagen`: Listo el contenedor está corriendo, podemos verlo con el comando `docker ps`.
     - Podemos ver que al final dice: Listening on port 3000, es decir que la app está escuchando en el puerto 3000 para que podamos navegar y ver el contenido de esa página web: localhost:3000. Si sale error es que Docker no está compartida con el host, si queremos acceder tenemos que especificar en la línea del `docker run`: `docker run -dp 3000:3000 nombreImagen`, lo que hace es correr un nuevo contenedor con la imagen `nombreImagen` pero con otro id, pero lo va a transmitir al puerto 3000. Ahora si está funcionando la app en el puerto! Y puedo agregar cosas o hacer cambios.

4. Para parar la imagen:

   - `docker ps`
   - `docker stop idnombreImagen`

5. Para correrlo otra vez:

   - `docker run -dp 3000:3000 nombreImagen`, pero vemos que se crea otro contenedor con otro id, y todos los agregados ya no están, vuelve a como está antes de cualquier modificación.

### Como mantener esos datos?

Primero si tenemos abierto esa imagen que no queremos la cerramos con: `docker stop idnombreImagen`.

Ahora si vamos a recuperar los datos:

- `docker run -d -v /Users/kbs/ejemplo-docker/app/etc:/etc/todos -p 3000:3000 nombreImagen`

#### links de los videos:

- https://www.youtube.com/watch?v=CV_Uf3Dq-EU&ab_channel=PeladoNerd | Desde minuto 36
- https://www.youtube.com/watch?v=4Dko5W96WHg&ab_channel=HolaMundo | Falta
- https://www.youtube.com/watch?v=9eTVZwMZJsA&ab_channel=RingaTech | Falta
- https://www.youtube.com/watch?v=dPh2C6kswPQ&ab_channel=RingaTech | Falta
- https://www.youtube.com/watch?v=hQgvt-s-AHQ&ab_channel=Platzi | Falta
