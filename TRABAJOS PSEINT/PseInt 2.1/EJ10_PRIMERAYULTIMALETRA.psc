Algoritmo EJ10_
	//Continuando el ejercicio anterior, ahora se pedir� una frase o palabra y se validara si la
	//primera letra de la frase es igual a la ultima letra de la frase. Se deber� de imprimir un
	//mensaje por pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir
	//"INCORRECTO".
	Definir frase Como Caracter;
	Escribir "Decime una frase o palabra que empiece y termine con la letra A";
	
	Leer frase;
	frase = Minusculas(frase);
	
	si Subcadena(frase,0,0) = Subcadena(frase, (Longitud(frase)-1),Longitud(frase)-1) Entonces
		Escribir "CORRECTO";
	SiNo
		Escribir "Te dije que empiece y termine con A";
	FinSi
	
FinAlgoritmo
