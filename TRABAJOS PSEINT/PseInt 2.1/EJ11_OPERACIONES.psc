Algoritmo sin_titulo
	//Construir un programa que simule un men� de opciones para realizar las cuatro
	//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
	//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
	//car�cter de la operaci�n que desea realizar: 'S' o 's' para la suma, 'R' o 'r' para la resta, 'M'
	//o 'm' para la multiplicaci�n y 'D' o 'd' para la divisi�n.
	definir num1,num2,s,r,d,m Como Real;
	Definir operacion Como Caracter;
	
	Escribir "Primero elegi los numeros, despues elegi la operacion que queres realizar, siendo que:";
	
	Escribir "S: para suma";
	Escribir "R: para resta" ;
	Escribir "M: para multiplicacion";
	Escribir "D: para division";
	
	Leer num1,num2;
	Escribir  "Ahora la operacion deseada";
	leer operacion;
	
	s = num1 + num2;
	r = num1 - num2;
	m = num1 * num2;
	d = num1 / num2;
	
	Segun operacion Hacer
			"S","s":
			Escribir "El resultado es ",s;
			"R","r":
			Escribir "El resultado es ",r;
			"M","m":
			Escribir "El resultado es ",m;
			"D","d": 
				Escribir	"El resultado es ",d;
		De Otro Modo:
			Escribir "No se ingreso correctamente la operacion, reintentar";
	FinSegun

	
FinAlgoritmo
