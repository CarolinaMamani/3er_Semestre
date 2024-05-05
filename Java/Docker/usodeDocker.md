### Instalación de Docker video 1 - EXITOSA

> # **Docker nos permite correr miles de cosas sin tener la necesidad de tener que instalarlos en la computadora**

> ## Comandos comunes en Docker

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

> ## Cómo desarrollar una app usando un contenedor de Docker?

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

> ## Cómo construir un contenedor?

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

> ### Como mantener esos datos?

Primero si tenemos abierto esa imagen que no queremos la cerramos con: `docker stop idnombreImagen`.

Ahora si vamos a recuperar los datos:

- `docker run -d -v /Users/kbs/ejemplo-docker/app/etc:/etc/todos -p 3000:3000 nombreImagen`

Y cuando demos modifiquemos, como estamos usando los directorios "etc" se van a guardar en esa capeta. Cuando iniciamos un nuevo contenedor con esos directorios, se crear de forma automatica y seguiran guardando los datos que se agregaron

- `ls etc/todo.db`
  Lo que modifique ahi dentro, ya desde dentro del contenedor o las carpetas, se iran guardando  
   Nos permite guardar una **Base de Datos**  
   Nos permite hacer cambion sin tener que estar recontruyendo la imegen otra vez

Para moficar un archivo dentro del Contenedor: `vim src/static/js/app.js`  
Una vez hechos los cambios:

- `docker run -d -v /Users/kbs/ejemplo-docker/app/etc:/etc/todos -p 3000:3000 -v /Users/kbs/ejemplo-docker/app/src:/app/src  nombreImagen`

Podemos ver que los cambios que hicimos aun permanecen, no importa desde donde los modifiquemos. Es decir que poder editar tranquilamente en Visual Studio Code y desarrollar todo que queremos.

> ### Una vez que termine que trabajar:
>
> Tenemos que meter esos cambios dentro de la imagen. Tenemos que reconstruir la imagen:

- `docker build -t nombreImagen:v2 .` le ponemos un tag ` v2 .`

> ## Como compartir la imagen que hice en mi compu, a otra persona?
>
> DockerHub da hostting gratruito para imagenes publicas, aunque solo para una  
> Vamos a subir la imagen a nuestro registro de Docker:

1.  Nos creamos una cuenta en DockerHub
2.  En ubuntu escribimos `docker login` nos pedira usuario y contrasena
3.  Vemos que imagen queremos con `docker images | head` copiamos el id de esa imagen (ej: 78b6f5560d5f)
4.  Volvemos a tagear esa imagen con nuestro nombre de usuario `docker tag 78b6f5560d5f lumiyu/nombreImegen:v2`
5.  Ahora si podemos hacer Push! `docker push lumiyu/nombreImegen:v2` comenzara a subir la imagen
6.  En el DockerHub nos saldra la imagen con ese nombre "lumiyu/nombreImegen" y van a aparecer los tag que hayamos subido.

**Entoncres cualquier persona se puede descargar mi imagen usando `docker push lumiyu/nombreImegen:v2`**

> ## Muchas veces necesitamos mas de 1 contenedor:
>
> Lo mas comun es tener un contener con una base de datos, y tener otro contener donde se corre la app y que se conecte a esa base de datos.  
> Queremos que la app se conecte a ese contenedor de BD. Es recomendable siempre tener las 2 cosas separadas

Vamos a hacer un Multi Conteiner  
 Ejemplo:
Cramos una carpata para almacenarlos: `cd multi-container`  
Vamos a correr 2 contenedores: Base de Datos y Aplicacion

## MySQL

1.  Creamos una nueva Red: `docker network create todo-app`despues de create va el nombre ej:`todo-app`
2.  Colocarelos el siguente comando que esta largo:
    > > `docker run -d \` el `-d` es para que inicie como detach (en background)  
    > > `--network todo-app --network-alias mysql \` le pasamos la **network** que creamos (**todo-app**) y una nueva linea (mysql). Nos va a facilitar encontrar la IP dentro del contenedor, no va hacer necesario poner la IP  
    > > `-v todo-mysql-data:/var/lib/mysql \` le vamos a pasar un volumen `-v` creara un directorio llamado "todo-mysql-data" y lo va a montar dentro de "var/lib/mysql"  
    > > `-e MYSQL_ROOT_PASSWORD=secret \` el `-e` agrega las variables de entorno a mysql, entonces la contasena seria "secret"  
    > > `-e MYSQL_DATABASE=todos \` aqui se va a crear una base de datos llamada "todos"  
    > > `mysql:5.7` y aqui le pasamos la imagen que queremos correr (mysql) y el tag o la version (5.7)

Todo esto lo podemos corroborar en la documentacion de Docker sobre MySQL: **hub.docker.com/\_/mysql**

_**Siempre leer las documentaciones de cualquier lenguaje porque nos ayuda a aprender nuevas funciones que nos seran muy utiles en el futuro**_

Con `docker ps` veremos que el contenedor ya esta corriendo.

- `docker exec -it 78b6f5560d5f mysql -p` el `exec` nos permite correr comandos dentro de contenedores que ya estan corriendo. El `-it` es para que no levante una terminal interactiva. `mysql -p` es lo que se va a correr dentro del contenedor.
- - Nos pedira la Password, ponemos la que pusimos (secret)
- - Escribimos `show databases;` en la terminal que nos salio de mysql, ahi vemos que si se creo la base de datos "todos".

Pudimos correr un comando dentro del contenedor para conectarnos a esa base de datos.

- - Para salir del mysql: `^DBye`

### **Como nos conectamos a MySQL?**

Por ejemplo, vamos a usar una imagen llamada "nicolaka/netshoot", la queremos conectar al contendor de mysql a travez de la network que creamos (todo-app).
Escribirmos esto:

- `docker run -it --network todo-app nicolaka/netshoot`  
  esta parte de `--network todo-app` es con la que nos conectamos en el mysql

- `dig mysql` veremos que resolvio la IP del contenedor de MySQL.
- `CTRL + C` para salir del contendor

Esto nos permite que cualquier contenedor que corramos en nuestra red todo-app pueda conectarse al cotenedor de mysql

### **Correr nuestra APP**

Vamos a correrla en el MySQL, la app me permite que le pase variables de entorno para conectarme a mysql

- `docker run -dp 3000:3000 \` le pasamos el puerto 3000 para poder verlo en el navegador
- `--network todo-app \` nuestra network
- `-e MYSQL_HOST=mysql \`
- `-e MYSQL_USER=root \`
- `-e MYSQL_PASSWORD=secret \` nuestra contrasenia
- `-e MYSQL_DB=todos \` nuestra base de datos
- `nombreImagen:v2` el nombre de nuesta app y la version de esta que queremos

Con `docker ps` vemos que se estan corriendo los 2 contenedores

- Para saber si estamos conectados podemos corroborar con: `docker logs bd6a6f68b887` le colocamos el ID del contenedor de nuesta app nombreImagen
- Para cerrar el contenedor: `docker stop bd6a6f68b887` aun usando el ID

Y si abrimos el contendor otra vez usando los comandos del principio:

- `docker run -dp 3000:3000 \`
- `--network todo-app \`
- `-e MYSQL_HOST=mysql \`
- `-e MYSQL_USER=root \`
- `-e MYSQL_PASSWORD=secret \`
- `-e MYSQL_DB=todos \`
- `nombreImagen:v2`

Veremos que todos los cambios que hayamos hecho siguen estado porque se guardaros en la base de datos.

Es decir que podemos correr 2 contendores conectados entre si. Y haciendo los volumenes persistentes para mysql (para el guardado de esos datos)

Siempre al terminar de usar los contenedores debemos cerrarlos con `docker stop ID`

## DOCKER COMPOSE (MySQL, automatizacion)

Es una forma facil de escribir todas las lineas de docker y sus configuraciones en un solo archivo, y que sea mas facil de mirar y administrar

1. `vlm docker-compose.yaml` Vamos a abrir ese archivo "**yaml**" . Podemos ver que tiene la version del a sitaxis y la seccion de servicios.
   Dentro de la seccion de **Servicios**, declaramos los servicos que vamos a correr dentro de docker compose. Esto nos va a permitir correr varios contendores usando un solo archivo, y automaticamente los va a meter a la misma red.

Automaticamente Docker compose va a crear una nueva red (como hicimos con el **todo-app**) cada vez que creemos un archivo de docker compose. Y va meter todos los servicios que estan dentro del archivo en la misma red.
Por ejemplo en el archivo vamos a tener 2 servicio: app y mysql

- Achivo de Docker compose:

  - `version: "3.7"`

    `services:`

    `app:`

    `image: lumiyu/nombreImagen:v2`  
     `ports:`  
     `- 3000:3000`  
     `environment:`  
     `MYSQL_HOST: mysql`  
     `MYSQL_USER: root`  
     `MYSQL_PASSWORD: secret`  
     `MYSQL_DB: todos`

    `mysql:`

    `image: mysql:5.7`  
     `volumes:`  
     `- ./todo-mysql-data:/var/lib/mysql` el `./` es una forma de dar la ruta de nuestro directorio  
     `environment:`  
     `MYSQL_ROOT_PASSWORD: secret`  
     `MYSQL_DATABASE: todos`

en esos archivos podemos modificar los nombres y contrasenias.
Esta es la mejor forma. Y evita errores

- Guardamos el archivo con `x`

### Como hacemos para correr lo que esta dentro de Docker Compose?

Ejecutamos el siguiente comendo:

- `docker-compose up -d`
  Ahora ya se creo todo, la red y los 2 contenedores de app y mysql. Encaso de alguna falla volver a ejcutar el `docker-compose up -d` porque algunos tardo mucho en crearse.

  https://docs.docker.com/compose/startup-order/

### links de los videos:

- https://www.youtube.com/watch?v=CV_Uf3Dq-EU&ab_channel=PeladoNerd | Terminado
- https://www.youtube.com/watch?v=4Dko5W96WHg&ab_channel=HolaMundo | Falta
- https://www.youtube.com/watch?v=9eTVZwMZJsA&ab_channel=RingaTech | Falta
- https://www.youtube.com/watch?v=dPh2C6kswPQ&ab_channel=RingaTech | Falta
- https://www.youtube.com/watch?v=hQgvt-s-AHQ&ab_channel=Platzi | Falta
