Algoritmo EJ7_SUBCADENA_CON_ESPACIOS
	//Realizar un programa que pida una frase y el programa deber� mostrar la frase con un
	//espacio entre cada letra. La frase se mostrara as�: H o l a. Nota: recordar el
	//funcionamiento de la funci�n Subcadena().
	//An�lisis
	//Leemos una cadena y tenemos que recorrerla (necesito un bucle que vaya desde la 
	//posici�n 0 hasta la longitud de la cadena menos 1. En cada iteraci�n mostramos
	//un car�cter (utilizamos la funci�n subcadena).
	// Datos de entrada:La cadena
	// Informaci�n de salida: Cada uno de los caracteres de la cadena
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
