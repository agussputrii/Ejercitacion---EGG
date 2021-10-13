Algoritmo EJ1_VALIDARNOTA
	//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la
	//nota se pedirá de nuevo hasta que la nota sea correcta.
	Definir n Como Entero;
	Escribir "Ingrese la nota";
	
	leer n;
	
	Mientras n < 0 o n >= 11 Hacer
		Escribir "La nota ingresada no es correcta, por favor, ingrese una nota valida";
		Leer n;
	Fin Mientras
	
	Escribir "La nota ingresada de valor ",n " es correcta"; 
	
	
FinAlgoritmo
