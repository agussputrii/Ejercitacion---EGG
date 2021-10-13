Algoritmo EXTRA6_DiaMesAnio
	Definir dia,mes,anio Como Entero;
	Definir messelect Como Caracter;
	Escribir "ingrese un dia";
	
	Repetir
		Leer dia;
		si dia > 31 o dia <=0 Entonces
			Escribir "Error, ingrese una fecha valida";
			FinSi
	Mientras Que dia >= 31 o dia < 1

	Escribir "Ingrese un mes utlizando numeros";
	
	Repetir 
		Leer mes;
		si mes <= 0 O mes > 12
			Escribir "Error, ingrese un mes valido";
		FinSi
	Mientras Que mes < 1 o mes > 12
	
	Escribir "Finalmente, ingrese un anio";
	
	Repetir
		Leer anio;
		si anio < 1 o anio > 2021
			Escribir "Error, ingrese un anio valido";
		FinSi
	Mientras Que anio < 1 o anio > 2021
	
	Segun mes Hacer
		1: messelect = "enero";
		2: messelect = "febrero";
		3: messelect = "marzo";
		4: messelect = "abril";
		5: messelect = "mayo";
		6: messelect = "junio";
		7: messelect = "julio";
		8: messelect = "agosto";
		9: messelect = "septimebre";
		10: messelect = "octubre";
		11: messelect = "noviembre";
		12: messelect = "diciembre";
		De Otro Modo:
			Escribir "El mes ingresado no es correcto";
	FinSegun

	Escribir "La fecha que usted eligio es ",dia " de " messelect " del " anio;
	
FinAlgoritmo