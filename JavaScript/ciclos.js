
//para los ciclos necesitamos de un contador

// WHILE
let contador = 0; //Inicializamos el contador en 0
while(contador < 3){ // primero la condicion, mientras contador sea menor a 3
    console.log(contador); //imprimimos cada nuemero que se le asigno al contador
    contador++; //se le suma 1
}
// contador = 1, 2 el la condicion dice TRUE, pero 
//cuando contador =3, la condicion dice FALSE, entonces se corta el ciclo
console.log('Fin del ciclo WHILE');


// DO WHILE
let contador2 = 0;
//se ejecutara una vez, y luego revisa la condicion, si es TRUE vuelve a entrar, sino se sale
do { 
    console.log(contador2);
    contador2++; //incremento, es un operador unario, es de pos incrment
} while (contador2 <3);
console.log('Fin de ciclo DO WHILE');


//FOR
//contador se inicializa dentro del ciclo for
//pasos: inicializacion, revicion de condicion, incremento o decremento
for( let contado = 0; contado < 3 ; contado++){
    console.log(contado);
}
console.log('Fin de ciclo FOR');


//BREAK (palabra reservada)
//vamos a imprimir nuemeros pares
for (let cont = 0; cont <= 10; cont++) {
    if (cont % 2 == 0){
        console.log(cont); //muestra todos los numero pares
        break; //solo mostrara el primer numero par
        //break rompe la estructura y termina con la busqueda y va la siguiente linea de codigo
        //break aplica tambien para ciclos while y do while
    }
}
console.log('Fin de ciclo FOR con BREAK')

// CONTINUE (palabra reservada)
//vamos a preguntar si el numero NO es par
for(let con=0 ; con <=10 ; con++){
    if(con %2 !== 0){
        continue; //esto va a continuar a la siguiente iteracion
    }
}
console.log('Fir del ciclo for con CONTINUE')