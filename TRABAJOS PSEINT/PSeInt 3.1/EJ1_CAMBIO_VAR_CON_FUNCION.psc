Algoritmo intercambio_valores_de_dos_variables
	//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo
	//entero. La variable A, debe terminar con el valor de la variable B.
	
	definir var_1,var_2 Como Entero;
	
	Escribir "Ingresa dos numeros enteros";
	Leer var_1,var_2;
	
	Escribir "Las variables fueron intercambiadas con exito";
	
	Escribir cambio_var(var_1,var_2);
	
	Escribir var_1;
	Escribir var_2;
	
FinAlgoritmo

Funcion  intercambio = cambio_var(var_1 Por Referencia, var_2 Por referencia)
	var_1 = var_1 + var_2;
	var_2 = var_1 - var_2;
	var_1 = var_1 - var_2;

FinFuncion
