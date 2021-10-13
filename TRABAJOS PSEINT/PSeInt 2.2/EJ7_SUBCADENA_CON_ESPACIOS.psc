Algoritmo EJ7_SUBCADENA_CON_ESPACIOS
	//Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
	//espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
	//funcionamiento de la función Subcadena().
	//Análisis
	//Leemos una cadena y tenemos que recorrerla (necesito un bucle que vaya desde la 
	//posición 0 hasta la longitud de la cadena menos 1. En cada iteración mostramos
	//un carácter (utilizamos la función subcadena).
	// Datos de entrada:La cadena
	// Información de salida: Cada uno de los caracteres de la cadena
	// Variables: cad (caracter), posicion (entero)
	
	Definir cadena1 Como Caracter;
	Definir posicion Como Entero;
	
	Escribir "Introduce una cadena:";
	Leer cadena1;
	
	Para posicion = 0 hasta Longitud(cadena1)-1 Con Paso 1 Hacer
		Escribir Sin Saltar Subcadena(cadena1,posicion,posicion) " ";
	FinPara	
	Escribir "";
FinAlgoritmo
