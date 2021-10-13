Algoritmo EJ9_SUC
//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una 'A'. Si la primera letra es una 'A', se deberá de imprimir un mensaje por pantalla
//que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". 
///Nota: investigar la función Subcadena de Pseint. 
	Definir aword,res Como Caracter
	Escribir "Decime una frase o palabra que empiece con la letra A"
	
	Leer aword
	
	res = Subcadena(aword,0,0)
	si Mayusculas(res) = 'A' Entonces
		Escribir "CORRECTO"
		
	SiNo
		Escribir "Dale flaco te dije que empiece con A, tanto te costaba?"
	FinSi
	
FinAlgoritmo
