// OK
// Evalua la validez del documento de identidad
let checkNumDocumento = (valor, tipo) => {
    // Evalua el tipo de documento
    if (tipo == "TI" || tipo == "CC") {
        // Evalua la longitud del documento
        if (valor.length >= 8 && valor.length <= 10) {
            //Expresion regular para validar documento de identidad
            const numberRegex = new RegExp('[^0-9]+');

            return (!numberRegex.test(valor)) ? true : false;
        }

        else {
            return false;
        }

    }
    else {
        return false;
    }
}

// OK
// Evalua la validez del correo electronico
let checkCorreo = (valor) => {
    //Expresion regular para validar correo
    const emailRegex = new RegExp('^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$');

    // Expresion regurlar para validar texto unicode
    const emailRegexUnicode = new RegExp('/^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i');

    return (!emailRegex.test(valor) || !emailRegexUnicode.test(valor)) ? true : false;
}

// OK
// Evalua la validez de la contraseña
let checkContrasena = (valor) => {
    if (valor.length >= 8) {
        // Expresion regular para validar contraseña
        const passRegex = new RegExp('^(?=.*[a-zñ])(?=.*[A-ZÑ])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})');

        return (!passRegex.test(valor)) ? true : false;
    }
    else {
        return false;
    }
}


// Se exportan todos los metodos necesarios en un solo bloque de objeto
module.exports = {
    checkNumDocumento,
    checkCorreo,
    checkContrasena
}

module.exports = checkContrasena;