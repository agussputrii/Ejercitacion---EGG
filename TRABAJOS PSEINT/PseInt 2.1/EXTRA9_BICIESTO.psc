Algoritmo EXTRA9_BICIESTO
	//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
	//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
	//por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
	//bisiesto. Nota: recuerde la funci�n mod de PSeInt
	Definir anio Como Entero;
	Escribir "Ingrese un a�o para ver si es biciesto";
	leer anio;
	
	si (anio mod 400 = 0) o (anio MOD 4 = 0) y no (anio mod 100 = 0)
		Escribir "Es biciesto";
	SiNo
		Escribir "No es biciesto";
	FinSi
	
FinAlgoritmo
