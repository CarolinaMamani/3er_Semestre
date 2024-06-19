class Producto{
    static contadorProductos = 0;
    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }
    get idProducto(){
        return this._idProducto;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get precio(){
        return this._precio;
    }
    set precio(precio){
        this._precio = precio;
    }

    toString(){//Templete Literals: nos permite insertar codigo dinamicamente
        return `idProducto : ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
}//Fin del a clase producto

class Orden{
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS (){ //simula una constante
        return 5;
    }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = []; //arreglo vacio para recibir cada uno de los productos
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    //Metodos:
    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto); //con push agregamos el producto. Sintaxis 1
            //this._productos[this._contadorProductosAgregados++] = producto; //Sintaxis 2
        }
        else{
            console.log('No se puede agregar mas productos');
        }
    }//fin del motodo agregaProducto

    calcularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos){//ciclo for simplificado
            totalVenta += producto.precio;
        }
        return totalVenta;
    }//fin del metodo calcularTotal

    mostrarOrden(){
        let productosOrden = ' '; //cadena vacia
        for(let producto of this._productos){
            productosOrden += '\n{ '+producto.toString()+' }';
        }
        console.log(`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productosOrden}`);
    }//fin del metodo mostrarOrden

}// fin de la clase Orden


let producto1 = new Producto('Pantalon', 120);
let producto2 = new Producto('Remera', 140);
let producto3 = new Producto('Cuaderno',15);
let producto4 = new Producto('iPad pro 12 M2 + Pen', 1300)

console.log(producto1.toString());
console.log(producto2.toString());

//Creamos una orden
let orden1 = new Orden();
let orden2 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto4);
orden1.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto4);

orden1.mostrarOrden();
orden2.mostrarOrden();