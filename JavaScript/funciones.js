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


//FUNCIONES DE TIPO EXPRESION o FUNCION ANONIMA
let x = function(a,b){ return a + b}; //necesita cierre con ; al final
resultado = x(5,6);//variable x representa a esta funcion anonima, dentro de () van los argumentos
console.log(resultado);
    // x = variable de resultado


