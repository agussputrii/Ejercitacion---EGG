Algoritmo sin_titulo
	//Crear una procedimiento que calcule la temperatura media de un d�a a partir de la
	//temperatura m�xima y m�nima. Crear un programa principal, que utilizando un
	//procedimiento, vaya pidiendo la temperatura m�xima y m�nima de n d�as y vaya
	//mostrando la media de cada d�a. El programa pedir� el n�mero de d�as que se van a
	//introducir.
	
	Definir dias Como Entero
	
	Ingrese la temperatura maxima 
	leer temp_min
	Leer temp_max
	
FinAlgoritmo

SubProceso promedio(temp_min Por Referencia,temp_max Por Referencia)
	
	Definir temp_min,temp_max Como Real
	promedio = (temp_max + temp_min) / 2
	FinSubProceso
	