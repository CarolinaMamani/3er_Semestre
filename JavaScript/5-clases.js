
// let persona3 = new Persona('Carlos','Oteryy'); //no se puede hacer hosting

//Definimos las clases con la palabra reservada class:
// las clases siempre empiezan con mayuscula

class Persona{ //CLASE PADRE
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

   //Funcion o metodo de la clase padre. Heredamos este metodo a la clase Hija
   nombreCompleto(){
        return this._nombre+' '+this._apellido;
   }
   
   //Sobreescribiendo el metodo de la clase padre(Object)
   toString(){ //regrsa un String
    //se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
    //El metodo que se ejecuta depende si es una referencia(objeto) de tipo padre o hija
        return this.nombreCompleto();
    }
    static saludar(){
        console.log('Saludos desde el metodo static');
    }

    static saludar2(persona){
        console.log(persona.nombre+' '+persona.apellido+' '+persona.departamento);
    }


}



//CLASE HIJA
class Empleado extends Persona{
    constructor(nombre, apellido, departamento){ //constructor, y se agregan los paramentos de la clase padre tambien
       super(nombre, apellido); //si o si se llama al contructor de la clase padre en las clase hijas
       this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }

    //Sobreescritura del metodo que viene de la clase padre
    nombreCompleto(){
        
        return super.nombreCompleto()+', '+this._departamento;
    }

}




// ahora vamos a crear OBJETOS de la Clase PADRE:
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



// OBJETOS de la Clase HIJA:
let empleado1 = new Empleado('Maria','Luz','Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

let empleado2 = new Empleado('Carolina','Mamani','Electromecanica');
console.log(empleado2);
console.log(empleado2.departamento);


// Prototype nos permite agregar atributos o metodos de manera dinamica a nuestras clases
//Object.prototype.toString


//Polimrfismo:
//usando empleado1 hacemos el llamado desde la clase hija nombreCompleto la Sobreescritura
console.log(empleado1.toString());

// si usamos un metodo de la clase padre usa la el metodo de la clase padre
// nombreCompleto de la clase Padre
console.log(persona2.toString());


//persona1.saludar(); no se utiliza desde el objeto
//pero si desde la clase
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);