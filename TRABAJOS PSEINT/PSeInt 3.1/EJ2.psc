Algoritmo sin_titulo
	//Crear una procedimiento que calcule la temperatura media de un día a partir de la
	//temperatura máxima y mínima. Crear un programa principal, que utilizando un
	//procedimiento, vaya pidiendo la temperatura máxima y mínima de n días y vaya
	//mostrando la media de cada día. El programa pedirá el número de días que se van a
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
	