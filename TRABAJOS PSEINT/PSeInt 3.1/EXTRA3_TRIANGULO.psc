Algoritmo EXTRA3TRIANGULO
//Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
//comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al
//usuario al comenzar. Ejemplo: si se ingresa el n�mero 3:
//1
//12
//123
	Definir a Como Entero;
	Escribir "Ingrese el tama�o del lado";
	leer a;
	
	triangulo(a);
FinAlgoritmo

SubProceso triangulo(a)
	Definir i,j Como Entero;
	i = 0;
	j = 0;
	Para i=0 Hasta a-1 Con Paso 1 Hacer
		Para j = 0 Hasta i Con Paso 1 Hacer
			Escribir Sin Saltar "* ";
		FinPara
		Escribir " ";
	FinPara
	
FinSubProceso
	