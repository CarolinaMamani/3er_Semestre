Clase 3:
Crear una base de datos en la Shell de Mongo

///Pasos//////

    windows + R
    cmd
    mongod

(en caso de no ejecutarse, agregar en el path del sistema la URL de la carpeta bin, Mongo 7.0)
(Servidor corriendo)

    windows + R
    cmd
    mongosh

(Conectado con el shell)

//Creamos la nueva coleccion dentro del Shell

    use.primeraclase
    cls (limpiar pantalla)
    db.insertar.insert({"nombre":"Carolina","edad":20})

//consulta para ver la base de datos creada

    bd.insertar.find()

Clase 4:
// Creamos base de datos con insertone e insertmany

    db.insertar.insertOne({"nombre":"Celia","edad":21})

    db.insertar.insertMany([{"nombre":"Ariel","edad":19},{"nombre":"Alan","edad":10}])

//Creamos base de datos desde Studio3T
ver las imagenes 4.1 y 4.2
