## EjERCICIO 1

Crea un objeto Jason que represente un pedido online. Este objeto debe de contener:
* ID del pedido (tipo numerico)
* Fecha del pedido (cadena de texto)
* Cliente (objeto con nombre, email y direccion (otro objeto con calle, ciudad y codigo postal))
* Lista de productos (array de objetos (nombre, cantidad y precio))
* Envio urgente (tipo booleano)
* Estado del pedido (puede ser de tipo "pendiente", "enviado", "entregado", null si aun no se ha procesado en tienda)
* Total del pedido (tipo numerico, aqui sera la suma del precio y la cantidad de los productos).

{
    "id": 12586,
    "fechaPedido": "Doce de Abril",
    "cliente": {
        "nombre": "Pepe",
        "email": "pepe@gmail.com",
        "direccion"{
            "calle": "federico",
            "ciudad": "huelva",
            "codigoPostal": 41008
        }
    },
    "productos": [{
        "nombre": "ps5",
        "cantidad": 2,
        "precio": 500
    }
    {
        "nombre": "switch2",
        "cantidad": 1,
        "precio": 470
    }
],
    "tipoEnvio": true,
    "estado": null,
    "total" 1470

}