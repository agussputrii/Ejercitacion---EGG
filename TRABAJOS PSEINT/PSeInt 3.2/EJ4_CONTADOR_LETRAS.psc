Algoritmo EJ4_CONTADOR_LETRAS
	//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
	//función debe devolver la cantidad de veces que encontró la letra. 
	///Nota: recordar el uso de la función Subcadena().

	Definir frase, letra Como Caracter;
	Escribir "Escriba la frase";
	Leer frase;
	Escribir "Escriba la letra que quiere encontrar N veces";
	Leer letra;
	
	contador_letras(frase,letra);
	
FinAlgoritmo

Funcion contador_letras(frase,letra)
	Definir aux Como Caracter;
	Definir contador,long_frase,i como entero;
	
	long_frase = Longitud(frase);
	contador = 0;
	
	Para i=0 Hasta long_frase Con Paso 1 Hacer
		aux = SubCadena(frase,i,i);
		si aux = letra
			contador = contador + 1;
		FinSi
	Fin Para
	
	Escribir "La cantidad de veces que sale la letra es ",contador;
Fin Funcion

