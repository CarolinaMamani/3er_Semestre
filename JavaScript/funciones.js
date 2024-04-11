
miFuncion(8, 2); //Hosting

// una funcion es un codigo reutilizable, primero la declaramos
//la funcion realiza una tarea
//para definirla vamos a usar la palabra reservada function, y luego definimos el nombre de la funcion

function miFuncion(a, b){ //una funcion puede o no tener parametros en () que al momento de ser llamados seran argumentos
    //cuerpo de la funcion que se ejecutara cuando la funcion sea llamada
    console.log('Sumamos: '+ (a + b));
    //una funcion siempre retorna, y puede no ser necesario usar la palabra return
}

// llamamos a la funcion
miFuncion(5,4); //usamos los parametros para llamar argumentos (5,4)
//podemos llamar a la funcion antes o despues de definirla y no va a suceder ningun error 
//(hosting) mueve la declaracion al inicio del programa