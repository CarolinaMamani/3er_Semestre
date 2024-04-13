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

    db.insertar.find()

Clase 4:
// Creamos base de datos con insertone e insertmany

    db.insertar.insertOne({"nombre":"Celia","edad":21})

    db.insertar.insertMany([{"nombre":"Ariel","edad":19},{"nombre":"Alan","edad":10}])

//Creamos base de datos desde Studio3T
ver las imagenes 4.1 y 4.2

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

//CLASE6:
//Indices en MongoDB
nueva base de datos: paso

            use paso
            switchetd to db paso
            db.paso.insertMany([{"nombre":"Hugo","apellido":"Garcia"},{"nombre":"Lou","apellido":"Ola"},{"nombre":"July":"apellido":"Julio"}])
            db.paso.getindexes()
            db.paso.find{"nombre":"Lou"}
            db.paso.find({"_id":objetID(""")})

creamos un index
db.paso.createindex({"apellido":1}) //solo contendra apellidos
//Indices unicos

            db.paso2.insertMany([{"usuario":"LumY_8","contrasena":"12364lm"},{"usuario":"Koetl_049","contrasena":"9849djasdk6"},{"usuario":"Hyeu99","contrasena":"jdirutm84"}])
            db.paso2.find()
            db.paso2.getIndexes()

creamos los index unicos
db.paos2.createIndex({"correo":1},{unique:true})
//Indice en segundo plano

            use segundo
            switched to db segundo
            db.segundo.insertMany([{"auto":"Chevrolet","ano":2010,"fecha":newDate()},{"auto":"Sobaru","ano":2020,"fecha":newDate()},{"auto":"Toyota","ano":1998,"fecha":newDate()}])
            db.segundo.find().pretty()
            db.segundo.createIndex({"nombre":1},{"background":true})
            db.segundo.getindexes()


