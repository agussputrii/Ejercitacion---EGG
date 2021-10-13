Algoritmo EJ8_ValorDeNotasTipoLOGICO
	//Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
	//entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
	//ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
	//variable de tipo lógico.
	Definir nota1,nota2,nota3 Como Entero
	definir a,b,c Como Logico
	
	Escribir "Tirame 3 notas que te sacaste"
	Leer nota1,nota2,nota3
	
	si nota1 >=1 y nota1 <=10 Entonces
		a = Verdadero
	SiNo
		a = Falso
	FinSi
	
	si nota2 >=1 y nota2 <=10 Entonces
		b = Verdadero
	SiNo
		b = Falso
	FinSi

	si nota3 >=1 y nota3 <=10 Entonces
		c = Verdadero
	SiNo
		c = Falso
	FinSi
	
	si a = Verdadero y b = Verdadero y c = verdadero Entonces
		Escribir "ES CORRECTO"
	SiNo
		Escribir "ES FALSO"
	FinSi

FinAlgoritmo
