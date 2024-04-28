
// let persona3 = new Persona('Carlos','Oteryy'); //no se puede hacer hosting

//Definimos las clases con la palabra reservada class:
// las clases siempre empiezan con mayuscula

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
        return this._nombre;
    }

    get apellido(){
        return this._apellido;
    }

   set nombre(nombre){
        this._nombre = nombre;
   }

   set apellido(apellido){
        this._apellido = apellido;
   }

}

// ahora vamos a crear OBJETOS:
//cada objeto maneja sus propios datos

let persona1 = new Persona('Joha','Oter');
console.log(persona1.nombre); //usamos el .nombre es el get y nos necesario poner ()
persona1.nombre= 'Anais Cyndi'; // usamos el set para cambiar el nombre
console.log(persona1.nombre);

console.log(persona1.apellido);
persona1.apellido= 'Waterson';
console.log(persona1.apellido);



let persona2 = new Persona('Anya','Forger');
console.log(persona2.nombre); //get
persona2.nombre= 'Gumball'; //set
console.log(persona2.nombre);

console.log(persona2.apellido);
persona2.apellido= 'Waterson';
console.log(persona2.apellido);

