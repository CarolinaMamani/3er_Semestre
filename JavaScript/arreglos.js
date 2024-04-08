// es un tipo object que permite almacenar varios valores,para de declaranlo hay diferentes formas:
//crearemos un arreglo de 3 elementos
//let autos = new Array('Ferrari','Renault','BMW'); //ES SISTAXIS VIEJA, ya no se usa

const autos = ['Ferrari','Renault','BMW']; //Sistaxis NUEVA (forma basica)
//referencias de memoria usando CONST
//para declarar un arreglo usamos los [] y agregamos los elementos dentro
console.log(autos);


//Recorremos los elementos de un arreglo
// los array comienzan desde 0, tenemos 3 elementos [0] [1] [2]
console.log(autos[0])

//Recorremos con ciclo cada uno de los elementos
for (let i = 0; i < autos.length; i++) {
    console.log(i+' : ' +autos[i]);
    
}

