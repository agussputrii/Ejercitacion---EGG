Algoritmo EJ3_DIVISION
//Realizar un procedimiento que permita realizar la división entre dos números y muestre
//el cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el
//divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y
//el número de restas realizadas es el cociente. 
///Por ejemplo: 50 / 13:
///50 - 13 = 37 una resta realizada
///37 - 13 = 24 dos restas realizadas
///24 - 13 = 11 tres restas realizadas
///dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
	
	Definir var_1,var_2,contador,resta Como Entero;
	Definir residuo Como Real;
	Escribir "Ingrese el dividendo";
	Leer var_1;
	
	Escribir "Ingrese el divisor";
	Leer var_2;
	
	contador = 0;
	resta = var_1;
	residuo = var_1 MOD var_2;
	
	division(var_1,var_2,resta,contador);

FinAlgoritmo

SubProceso division(var_1,var_2,resta Por Referencia,contador Por Referencia)
	
	
	mientras resta > var_2 Hacer
		resta = resta - var_2;
		contador = contador + 1;
	FinMientras

	Escribir "el residuo es ",resta "." ;
	Escribir "El cociente es ",contador ".";
FinSubProceso
	