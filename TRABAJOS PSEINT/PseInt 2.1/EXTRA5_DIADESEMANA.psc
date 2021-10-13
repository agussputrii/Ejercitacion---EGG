Algoritmo EXTRA5_DIADESEMANA
	//Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por
	//pantalla un mensaje que indique a qué día de la semana corresponde. Considere que el
	//número 1 corresponde al día "Lunes", y así sucesivamente.
	
	definir dia Como entero;
	Escribir "Ingrese un numero para ver el dia de la semana";
	
	Leer  dia;
	
	Segun dia Hacer
		1:
			Escribir "el numero corresponde al dia LUNES";
		2:
			Escribir "el numero corresponde al dia MARTES";
		3:
			Escribir "el numero corresponde al dia MIERCOLES";
		4:
			Escribir "el numero corresponde al dia  JUEVES";
		5:
			Escribir "el numero corresponde al dia VIERNES";
		6:
			Escribir "el numero corresponde al dia SABADO";
		7:
			Escribir "el numero corresponde al dia DOMINGO";

		De Otro Modo:
			Escribir "el numero no corresponde a ningun dia de la semana";

	Fin Segun
FinAlgoritmo
