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
    db.primeraclase.insert({"nombre":"Carolina","edad":20})

//consulta para ver la base de datos creada

    db.insertar.find()

---

Clase 4:
// Creamos base de datos con insertone e insertmany

    db.insertar.insertOne({"nombre":"Celia","edad":21})

    db.insertar.insertMany([{"nombre":"Ariel","edad":19},{"nombre":"Alan","edad":10}])

//Creamos base de datos desde Studio3T
ver las imagenes 4.1 y 4.2

---

Clase 5:
//Aprendemos algunos comandos

//Eliminar Datos: REMOVE, DELATEONE

    db.insert.remove({"nombre":"natalia"})

    db.insert.delateOne({"nombre":"juan"})

//Eliminar Colecciones: DROP

    db.insert.drop({"nombre de coleccion"})

// Actualizaciones: updateOne/Many= $set, $unset, $rename, $max, $min

    db.insertar.updateOne({"nombre":"luis"},{$set:{"ubicacion":"Buenos Aires"}})

    db.insertar.updateMany({"nombre":"julian"},{$set:{"edad":"25"}})

    db.insertar.updateOne({"nombre":"loi"},{$unset:{"ubicacion":""}})

    db.insetar.updateOne({"nombre":"kevin"},{$rename:{"ubicacion":"ciudad"}})

    db.insetar.updateOne({"nombre":"lucas"},{$max:{time:1000}})
    db.insetar.updateOne({"nombre":"lucas"},{$min:{time:1000}})

//Incremento $inc

    db.incremento.insertOne({"name":"youtube","url":"youtube.com","vistas":1000,"likes":50})
    db.incremento.update({"url":"youtube.com"},{$inc:{"vistas":1000}})
    db.incremento.find()
    db.incremento.update({"url":"youtube.com"},{$inc:{"like":1000}})
    db.incremento.find()

//Consultas: selection

    db.selection.insertMany([{"nombre":"jesi","edad":20},{"nombre":"fer","edad":20}])
    db.selection.find({"nombre":"jesi"},{"nombre":"fer"})

    db.primer_metodo.findOne({"nombre":"fer"})

---

CLASE6:
//Indices en MongoDB
nueva base de datos: paso

            use paso

            db.paso.insertMany([{"nombre":"Hugo","apellido":"Garcia"},{"nombre":"Lou","apellido":"Ola"},{"nombre":"July":"apellido":"Julio"}])
            db.paso.getIndexes()
            db.paso.find({"nombre":"Lou"})

creamos un index
db.paso.createIndex({"apellido":1}) //solo contendra apellidos

//Indices unicos

            use paso2

            db.paso2.insertMany([{"usuario":"LumY_8","contrasena":"12364lm"},{"usuario":"Koetl_049","contrasena":"9849djasdk6"},{"usuario":"Hyeu99","contrasena":"jdirutm84"}])
            db.paso2.find()
            db.paso2.getIndexes()

creamos los index unicos
db.paso2.createIndex({"correo":1},{unique:true})

//Indice en segundo plano

            use segundo

            db.segundo.insertMany([{"auto":"Chevrolet","ano":2010},{"auto":"Sobaru","ano":2020},{"auto":"Toyota","ano":1998}])
            db.segundo.find().pretty()
            db.segundo.createIndex({"nombre":1},{background:true})
            db.segundo.getIndexes()

---

CLASE 7

Operadores logicos en MongoDB:

    $gte mayor o = que (>=)       db.logico_1.find({cantidad:{$gte:20}})
    $gt mayor que (>)             db.logico_1.find({cantidad:{$gt:20}})

    $lte menor o = que (<=)       db.logico_1.find({cantidad:{$lte:20}})
    $lt menor que (<)             db.logico_1.find({cantidad:{$lt:20}})

        $gt + $lt (><)                db.logico_1.find({cantidad:{$gt:20, $lt:40}})
        $gte + $lte (>=<=)            db.logico_1.find({cantidad:{$gte:2000, $lte: 6000}})

---

CLASE 8

Ejercicio 1:
Ejercicio 2:
Ejercicio 3:
Ejercicio 4:
Ejercicio 5:

Ver las capturas de las imagenes Clase 8

Para crear colecciones:
use basededatos
db.createCollection("nombre de coleccion")

Para ingresar datos en las colecciones:
db.getCollection("nombre de coleccion").insertOne({"nombre":"Kiue"})

Para agregar fechas
db.coleccion...({"fecha":new Date(ano,mes,dia)})
