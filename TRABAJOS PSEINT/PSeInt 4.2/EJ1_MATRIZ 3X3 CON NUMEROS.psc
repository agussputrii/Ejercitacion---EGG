Algoritmo sin_titulo
	//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el
	//usuario y los muestre por pantalla.
	Definir matriz,fila,columna Como Entero
	fila=3
	columna=3
	Dimension matriz(fila,columna)
	
	Escribir "Ingresa 9 numeros para nuestra matriz"
	
	Para fila=0 Hasta 2 Hacer
		Para columna=0 Hasta 2 Hacer
			Leer matriz(fila,columna)
		Fin Para
	Fin Para
	
	Para fila=0 Hasta 2 Hacer
		Para columna=0 Hasta 2 Hacer
			Escribir Sin Saltar " [",matriz(fila,columna) "] "
		Fin Para
		Escribir " "
	Fin Para
FinAlgoritmo
