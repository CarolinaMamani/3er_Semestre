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
    static getMAX_PRODUCTOS (){
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
            productosOrden += producto.toString()+' ';
        }
        console.log(`Orden: ${this._idOrden}, total: $${this.calcularTotal}, productos: ${productosOrden}`)
    }//fin del metodo mostrarOrden

}// fin de la clase Orden


let producto1 = new Producto('Pantalon', 120);
let producto2 = new Producto('Remera', 140);
console.log(producto1.toString());
console.log(producto2.toString());