Algoritmo EJ2_PROMEDIO_DIAS
	//Crear una procedimiento que calcule la temperatura media de un d�a a partir de la
	//temperatura m�xima y m�nima. Crear un programa principal, que utilizando un
	//procedimiento, vaya pidiendo la temperatura m�xima y m�nima de n d�as y vaya
	//mostrando la media de cada d�a. El programa pedir� el n�mero de d�as que se van a
	//introducir.
	
	Definir dias,i Como Entero;
	Definir temp_max,temp_min Como Real;
	
	Escribir "Ingrese el numero de dias";
	leer dias;
	
	Para i = 0 Hasta dias Con Paso 1 Hacer
		Escribir "";
		Escribir "dia ",i + 1;
		Escribir "Ingrese la temperatura minima"; 
		leer temp_min;
		Escribir "Ingrese la temperatura maxima"; 
		Leer temp_max;
		
		total(temp_min,temp_max);
	Fin Para
	
	
FinAlgoritmo

SubProceso total(temp_min Por Referencia,temp_max Por Referencia)
	
	Definir promedio Como Real;
	
	promedio = (temp_max + temp_min) / 2;
	
	Escribir promedio "�.";
	
FinSubProceso


	