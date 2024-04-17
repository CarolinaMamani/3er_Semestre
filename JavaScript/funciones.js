//FUNCIONES 
    // una funcion es un codigo reutilizable, primero la declaramos
    //la funcion realiza una tarea
    //para definirla vamos a usar la palabra reservada function, y luego definimos el nombre de la funcion

miFuncion(8, 2); //Hosting


function miFuncion(a, b){ //una funcion puede o no tener parametros en () que al momento de ser llamados seran argumentos
        //cuerpo de la funcion que se ejecutara cuando la funcion sea llamada
//    console.log('Sumamos: '+ (a + b));
        //una funcion siempre retorna, y puede no ser necesario usar la palabra return, js lo agrega
    return a + b;
}

    // llamamos a la funcion
miFuncion(5,4); //usamos los parametros para pasar argumentos (5,4)
    //podemos llamar a la funcion antes o despues de definirla y no va a suceder ningun error 
    //(hosting) mueve la declaracion al inicio del programa

    //usamos una variable para ver el trabajo que esta realizando la funcion
let resultado = miFuncion(6, 7);
console.log(resultado) //si quitamos el return del a funcion nos saldra undefined



//------FUNCIONES DE TIPO EXPRESION o FUNCION ANONIMA
let x = function(a,b){ return a + b}; //necesita cierre con ; al final
resultado = x(5,6);//variable x representa a esta funcion anonima, dentro de () van los argumentos
console.log(resultado);
    // x = variable de resultado


//-------FUNCIONES DE TIPO SELF / INVOKING (se llaman a si mismas)
(function(a,b){
    console.log('ejectando la funcion: '+(a+b));
})(9,6); //funcion anonima que se llama a si misma
//No se puede reutilizar porque no tiene variables ni nombre
//solo se llama asi misma una sola vez


// Una funcion es un tipo de dato
console.log(typeof miFuncion);

// tambien puedes ser  un objeto, que tienen propiedades, metodos asiciados a cada uno de los ojetos
//ej: quermos saber cuantos argumentos se han definido en la funcion
//arguments
function miFuncionDos(a,b){
    console.log(arguments.length); //debemos estar dentro de la funcion para realizar estas preguntas
}

miFuncionDos(5, 7,8,5); //le pasamos 4 argumentos



// metodo/funcion toString, lo llamamos con el operador de .

var miFuncionTexto = miFuncionDos.toString(); //convierte la funcion a texto
console.log(miFuncionTexto);


//-------FUNCIONES FLECHA
const sumarFuncionFlecha = (a,b) => a + b; //=> operador de flecha indica el resultado que regresa
//no se utilizan las palabras reservadas: function, las {} y return
resultado = sumarFuncionFlecha(3,7);//le pasamos los argumentos, asignamos el valor a una variable
console.log(resultado);



//Diferencias entre Argumentos y Parametros
    //PARAMETROS: lista de variables q definimos en una funcion
        //Cuando definimos una funcion dentro de los parentesis estan los paramentros de la funcion. Las variables son los parametros
    //ARGUMENTOS: son los valores que pasmos cuando llamamos a una funcion
        //Cuando llamamos a la funcion, dentro de ( ) le ponemos los argumentos
//------FUNCION DE TIPO EXPRESION
let sumar = function(a = 4,b = 8){ //valores de default
    console.log(arguments[0]);//muestra el parametro de a =
    console.log(arguments[1]);//muestra el parametro de b =
    return a + b + arguments[2];
}
resultado = sumar(3,2,9); //asigna valores a los paramentros desde los argumentos
console.log(resultado); 
//no es requerido que coincidan los nros de argumentos con el nro de parametros


//Hoisting: primero llamamos la funcion antes de ser creada/definida/declarada
//vamos a sumar todos los argumentos
let respuesta = sumarTodo(5,4,13,10,9);
console.log(respuesta);

function sumarTodo(){
    let suma = 0;
    for (let i = 0; i < arguments.length; i++){
        suma += arguments[i]; //arguments es para arreglos
    }
    return suma;
}

//Paso por valor: cuando usamos tipos que no son objetos: numerico, booleano, etc. Se aplica cuando trabajamos con funciones
//se pasa una copia de esta variable al metodo que se va a llamar
    
//Paso por referencias
//Tipos primitivos
let k = 10;
//Paso por valor:
function cambiarValor(a){//a recibe valor 10
    a =20; //nueva variable, recibe valor 20, luego se destruyo
}
cambiarValor(k); //k nunca se modfico, nada afecto
console.log(k);
