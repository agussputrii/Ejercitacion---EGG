Algoritmo CAMBIAR_NUMERO_SIN_AUXILIAR
	
	Definir  numA,numB Como entero
	
	Escribir "escriba el valor de A: "
	Leer numA
	Escribir "escriba el valor de B: "
	Leer numB
	
	numA = numA + numB
	numB = numA - numB
	numA = numA - numB
	
	Escribir  "el valor de A es ",numA " y el valor de b es ",numB "."
	
FinAlgoritmo
