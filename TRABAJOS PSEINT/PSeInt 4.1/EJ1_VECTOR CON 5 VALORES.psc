Algoritmo EJ1_VECTOR
	//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
	//muestre por pantalla.
	Definir vector1,i Como Entero
	Dimension vector1(5)
	Escribir "Ingresa 5 valores que quieras ver en pantalla"
	Para i=0 hasta 4 Con Paso 1 Hacer
		Leer vector1(i)
	FinPara
	
	Para i=0 hasta 4 Con Paso 1 Hacer
		Escribir Sin Saltar "[",vector1(i) "] "
	FinPara
	Escribir ""
	Escribir ""
FinAlgoritmo
