// objetos tienen propiedades y metodos
let x = 10; //variable de tipo primitiva
console.log(x.lenght); //no encuenta atributos(propiedades)

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
