// Declaracion del arreglo global de objetos
let arregloGlobal = [];

function agregarRegistro(){
    // Creacion de un objeto base con info del formulario
    let usuario = {
        tipoDocumento: document.getElementById("documento").value,
        numeroDocumento: document.getElementById("numdocumento").value,
        correo: document.getElementById("correo").value,
        contrasena: document.getElementById("contrasena").value
    }

    // Agregar el objeto al arreglo
    arregloGlobal.push(usuario);

    // Constancia de informacion
    console.log("Se esta agregando la siguiente info \n")
    console.log(`Tipo: ${usuario.tipoDocumento}
                 Numero: ${usuario.numeroDocumento}
                 Correo: ${usuario.correo}
                 Contraseña ${usuario.contrasena}`)
}


function obtenerRegPasaporte(arreglo){
    let usuariosPasaporte = arreglo.filter(function(usuario){
        return usuario.tipoDocumento == "pas";
    });

    console.log("Usuarios con pasaporte: ")
    console.log(usuariosPasaporte);

    // Retornando la lista con usuarios con pasaporte
    return usuariosPasaporte;

}


function ordenarArreglo(arreglo){
    // Ordenar el arreglo por numero de documento usando funcion de comparacion
    arreglo.sort(function(a, b){
        return a.numeroDocumento - b.numeroDocumento;
    });

    // Constancia de informacion
    console.log("Arreglo ordenado por numero de documento: ")
    console.log(arreglo);

    return arreglo;
}


function filtrarCorreo(arreglo){
    // Filtrar el arreglo por correo
    let usuariosCorreo = arreglo.filter(function(usuario){
        return usuario.correo.includes("email.com");
    });

    // Constancia de informacion
    console.log("Usuarios con dominio 'email.com': ")
    console.log(usuariosCorreo);

    // Retornando la lista con usuarios con correo
    return usuariosCorreo;
}


// Exportacion de funciones necesarios
module.exports = {
    arregloGlobal,
    agregarRegistro,
    obtenerRegPasaporte,
    ordenarArreglo,
    filtrarCorreo,
}
