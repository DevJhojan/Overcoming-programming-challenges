// Función que toma otra función como parámetro
function ejecutarFuncion(funcion) {
  console.log("Ejecutando la función proporcionada:");
  funcion();
}

// Función que será pasada como parámetro
function saludo() {
  console.log("Hola, soy una función de saludo");
}

// Llamada a la función que toma otra función como parámetro
ejecutarFuncion(saludo);
