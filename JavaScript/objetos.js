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
    edad: 30,
    //Agregamos metodos o funciones a los objetos 
    nombreCompleto: function(){
        return this.nombre+' '+this.apellido;
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

