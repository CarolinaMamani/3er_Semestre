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
        return`idProducto : ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
}//Fin del a clase producto

let producto1 = new Producto('Pantalon', 120);
let producto2 = new Producto('Remera', 140);
console.log(producto1.toString());
console.log(producto2.toString());