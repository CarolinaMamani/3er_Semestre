# **Docker**

### \__Contenedor_:

es una forma de empaquetar aplicaciones con sus dependencias y todo lo que necesita para funcionar.  
Son portables y faciles de compartir

Los contenedores se almacenan en un repositorio de contenedores. Tipos:

- privados
- publicos:
  - **Docker hub**

Con contendores:

- Descargamos una **Imagen** basada en linux.  
  Se pueden correr multiples versiones de un misma app al mismo tiempo

### \__Imagen_:

es el empaquetado, que contiene las dependencias, codigo

Un **conteiner** son capas tras capas de imagenes

La base de imagen suele ser Alpine Linux porque pesa poco.

- https://www.youtube.com/watch?v=4Dko5W96WHg&ab_channel=HolaMundo | Min 14

> ## Comandos comunes en Docker

### (para correr e iniciar contenedores basados en imágenes:)

- `docker run`: Permite correr una imagen que se convierte en un contenedor.
