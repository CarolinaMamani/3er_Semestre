// objetos tienen propiedades y metodos
let x = 10; //variable de tipo primitiva
console.log(x.lenght); //no encuenta atributos(propiedades)
console.log('Tipos primitivos')

// Creamos un objeto
let Persona = { //objeto memomoria con =
    //propiedades
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'gil@gmail.com',
    edad: 28,
    idioma: 'ES',
    get lang(){
        return this.idioma.toUpperCase(); //convierte las minusculas a mayusculas
    },
//SET: set que en inglés significa establecer o modificar. El método set se utilizará 
//para modificar los valores de los objetos. 
//Se combinará el uso del set con el uso del get.
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },

    //Agregamos metodos o funciones a los objetos 
    nombreCompleto: function(){
        return this.nombre+' '+this.apellido;
    },
//METODO GET:se utiliza para hacer solicitudes HTTP de tipo GET a un servidor para obtener recursos o datos. 
//se utiliza comúnmente en combinación con la API Fetch de JavaScript para hacer 
//solicitudes HTTP a un servidor y obtener datos en formato JSON, texto, HTML u otros formatos. 
//se utiliza comúnmente para obtener recursos o datos del servidor
     get nombreEdad(){
        return 'El nombre es : '+this.nombre +', Edad: '+this.edad;
     }
     
} 
console.log(Persona.nombre);
console.log(Persona.apellido);
console.log(Persona.edad);
console.log(Persona);

//imprimimos el metodo
console.log(Persona.nombreCompleto());
console.log('Ejecutando con un objeto')
//Segunda forma de crear un objeto
let persona2 = new Object(); //debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan'; //atravez del punto agregamos propiedades al objeto
persona2.direccion = 'Salida 24';
persona2.telefono = '2456754';
console.log(persona2.telefono);

console.log('creamos un nuevo objeto')
//Formas de acceder a pripiedades de los objetos 
console.log(Persona['apellido']); //accedemos como si fuera un arreglo
console.log('usamos el ciclo for in')
//for in, y accedemos al objeto como si fuera un arreglo
for(propiedad in Persona){
    //dos formas
    console.log(propiedad);
    console.log(Persona[propiedad]);
}
console.log('cambiamos y eliminamos un error')
//Agregar y eliminar propiedades de un objeto
//Para agregar propiedad apellida
Persona.apellida = 'Bernadet'; //cambiamos dinamicamente el valor del objeto
//Para eliminar
delete Persona.apellida
console.log(Persona);


//Distintas formas de imprimir un objeto
//Num 1: es la mas sencilla, concatenar cada valor de cada propiedad
console.log('Distintas formas imprir un objeto: forma1');
console.log(Persona.nombre+', '+Persona.apellido);

//Num 2: a tavez del ciclo for in
console.log('Distintas formas imprir un objeto: forma2');
for(nombrePropiedad in Persona){
    console.log(Persona[nombrePropiedad]);
}

//Num 3 : la funcion Object.values() es un metodo que devuelve el objeto como un arreglo
console.log('Distintas formas imprir un objeto: forma3');
let personaArray = Object.values(Persona);
console.log(personaArray);

//Num 4: Utilizaremos el metodo JSON.stringify
//nos imprimi una cadena como la de insertar datos en mongodb
console.log('Distintas formas imprir un objeto: forma4');
let personaString = JSON.stringify(Persona);
console.log(personaString);


//para el metodo get
console.log('Comenzamos a utilizar el metodo get: ')
console.log(Persona.nombreEdad);

//llamamos al set
console.log('Comenzamos con el metodo get  y set para idiomas');
Persona.lang = 'en'; //cambiamos el idioma
console.log(Persona.lang);


//CONSTRUCTOR
//el constructor es una función especial que se trabajará con objetos en JavaScript. 
//Para llamar una funciónconstructor se utilizará la palabra reservada new 
//lo que reservará espacio en memoria del objeto que se creará. 
//Se recomienda que el nombre de la función empiece con mayúscula.

//es sera nuestro constructor
function Persona3(nombre, apellido, email){ //metodo para la creacion de objetos
    this.nombre = nombre;
    this.apellida = apellido;
    this.email = email;

}

let padre = new Persona3('Leo','Ortiur',"gjhhau@gmail.com");
padre.nombre = 'Loid'; //podemos modificar
console.log(padre);

let madre = new Persona3('Laura','Contrera','contrea@gmail.com');
console.log(madre);

//new nos reserva un espacio de memoria para cada objeto.