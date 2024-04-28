
//Definimos las clases con la palabra reservada class:
// las clases siempre empiezar con mayuscula

class Persona{
    //cuerpo del clase con {}
    constructor(nombre, apellido){ //agregamos el constructor para crear un objeto
        //dentro de los parentesis agregamos los parametros
        //dentro del constructor inicializamos los atributos
        this._nombre = nombre; //ponemos _ para diferenciar el atributo(_nombre) del nombre
        this._apellido = apellido;

    }//sino se define el constructor javascript lo define de manera automatica

//Metodos GET y SET
    get nombre(){
        return this._nombre
    }

   

}

// ahora vamos a crear OBJETOS:
//cada objeto maneja sus propios datos

let persona1 = new Persona('Joha','Oter');
console.log(persona1.nombre);

let persona2 = new Persona('Anya','Forger');
console.log(persona2.nombre);


