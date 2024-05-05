class Empleado extends Persona{

    static contadorEmpleado = 0;

    constructor(nombre, apellido, edad, sueldo){ //agregamos el atributo de sueldo
        super(nombre, apellido, edad);
        this._idEmpleado = ++Empleado.contadorEmpleado;
        this._sueldo = sueldo;

    }
    get idEmeplado(){
        return this._idEmpleado;
    }

    get sueldo(){
        return this._sueldo;
    }
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }

    toString(){
        return `
        ${super.toString()}
        ${this._idEmeplado}
        ${this._sueldo}`;
    }


}