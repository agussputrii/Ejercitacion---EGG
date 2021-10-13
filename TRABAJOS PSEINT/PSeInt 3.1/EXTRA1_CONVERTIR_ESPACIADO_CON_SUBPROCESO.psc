Algoritmo sin_titulo
	//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y
	//muestra una cadena con un espacio adicional tras cada letra.
	//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se
	//use dicho procedimiento.
	Definir cadena1 Como Caracter;
	Definir posicion Como Entero;
	posicion = 0;
	Escribir "Introduce una cadena:";
	Leer cadena1;
	conversionesp(cadena1,posicion);
FinAlgoritmo

SubProceso conversionesp (cadena1 Por Referencia, posicion)
	
	Para posicion = 0 hasta Longitud(cadena1)-1 Con Paso 1 Hacer
		Escribir Sin Saltar Subcadena(cadena1,posicion,posicion) " ";
	FinPara	
	Escribir "";
	
FinSubProceso
