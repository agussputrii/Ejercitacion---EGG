Algoritmo EXTRA9_BICIESTO
	//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
	//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
	//por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
	//bisiesto. Nota: recuerde la función mod de PSeInt
	Definir anio Como Entero;
	Escribir "Ingrese un año para ver si es biciesto";
	leer anio;
	
	si (anio mod 400 = 0) o (anio MOD 4 = 0) y no (anio mod 100 = 0)
		Escribir "Es biciesto";
	SiNo
		Escribir "No es biciesto";
	FinSi
	
FinAlgoritmo
