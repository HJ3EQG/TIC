// Declaracion del arreglo global de objetos
let registros = [];

// Funcion que permite agregar un registro al arreglo global 'registros'
function agregarRegistro() {
    // Creacion de un objeto base con info del formulario que representa el registro
    let usuario = {
        tipoDocumento: document.getElementById("tipo-documento").value,
        numeroDocumento: document.getElementById("numero-documento").value,
        correo: document.getElementById("correo").value,
        contrasena: document.getElementById("contrasena").value
    }

    // Agregar el objeto (registro) al arreglo
    registros.push(usuario);

    // Constancia de informacion
    console.log("Se esta agregando la siguiente info \n")
    console.log(`Tipo: ${usuario.tipoDocumento}
                 Numero: ${usuario.numeroDocumento}
                 Correo: ${usuario.correo}
                 Contraseña: ${usuario.contrasena}`)
}


// Funcion que permite obtener el arreglo ordenado por numero de documento de pasaporte ('P')
function obtenerRegPasaporte(arreglo) {
    let usuariosPasaporte = arreglo.filter(function (usuario) {
        return usuario.tipoDocumento === "P";
    });

    console.log("Usuarios con pasaporte: ")
    console.log(usuariosPasaporte);

    // Retornando la lista con usuarios con pasaporte
    return usuariosPasaporte;
}


// Funcion que permite obtener el arreglo ordenado por numero de documento de pasaporte ('P')
function ordenarArreglo(arreglo) {
    // Ordenar el arreglo por numero de documento usando funcion de comparacion
    arreglo = obtenerRegPasaporte(arreglo);

    // Bucle que itera sobre los valores del arreglo
    for (let i = 0; i < arreglo.length; i++) {
        for (let j = i + 1; j < arreglo.length; j++) {
            // Se intercambian los valores de posicion si el numero de documento es mayor
            if (arreglo[i].numeroDocumento > arreglo[j].numeroDocumento) {
                let aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }
    }

    // Constancia de informacion
    console.log("Arreglo ordenado por numero de documento ASC: ")
    console.log(arreglo);

    return arreglo;
}


// Funcion que permite filtrar los registros cuyo correo electronico contenga el dominio 'email.com'
function filtrarCorreo(arreglo) {
    // Filtrar el arreglo por correo
    let usuariosCorreo = arreglo.filter(function (usuario) {
        return usuario.correo.includes("email.com");
    });

    // Constancia de informacion
    console.log("Usuarios con dominio 'email.com': ")
    console.log(usuariosCorreo);

    // Retornando la lista con usuarios con dominio 'email.com'
    return usuariosCorreo;
}

// Funcion de prueba para listar los registros
function listar(arreglo) {
    // Listar los usuarios del arreglo
    let lista = "";
    for (let usuario of arreglo) {
        lista += `Tipo: ${usuario.tipoDocumento}
                  Numero: ${usuario.numeroDocumento}
                  Correo: ${usuario.correo}
                  Contraseña: ${usuario.contrasena}`;
    }

    // Constancia de informacion
    console.log("Lista de usuarios: ")
    console.log(lista);

    return lista;
}

// Exportacion de elementos necesarios
module.exports = {
    registros,
    agregarRegistro,
    obtenerRegPasaporte,
    ordenarArreglo,
    filtrarCorreo,
}
