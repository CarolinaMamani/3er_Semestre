// Un ARRAY es un tipo object que permite almacenar varios valores,para de declaranlo hay diferentes formas:
//crearemos un arreglo de 3 elementos

    //let autos = new Array('Ferrari','Renault','BMW'); //ES SISTAXIS VIEJA, ya no se usa

const autos = ['Ferrari','Renault','BMW']; //Sistaxis NUEVA (forma basica)
    //referencias de memoria usando CONST
    //para declarar un arreglo usamos los [] y agregamos los elementos dentro
console.log(autos);


//Recorremos los elementos de un arreglo
    // los array comienzan desde 0, tenemos 3 elementos [0] [1] [2]
console.log(autos[0]);

//Recorremos con ciclo cada uno de los elementos
for (let i = 0; i < autos.length; i++) {
    console.log(i+' : ' +autos[i]);
    
}

//Modificamos los elementos del arreglo
autos[1] = 'Chevrolet';
console.log(autos[1]);

//Agregamos nuevos valores al arreglo
    //forma 1: usando push
autos.push('Audi'); //agremoa el elemento al final del arreglo
console.log(autos); //hay 4 elementos

    // Otras formas de agregar elemtos al arreglo
    //forma 2: usando length
autos[autos.length] = 'Sobaru';
console.log(autos); //hay 5 elementos

    //forma 3: usando (teniendo CUIDADO)
autos[5] = 'Toyota'; //si nos saltamos un espacio, deja espacio vacio que ocupa memoria, no recomendado
console.log(autos);


//Como preguntar si es un Array/Arreglo?
    //usamos la clase array
console.log(Array.isArray(autos));//veuelve un booleano

    //usando intanceof
console.log(autos instanceof Array);
        //preguntamos si la variable es una instancia de la clase Array

