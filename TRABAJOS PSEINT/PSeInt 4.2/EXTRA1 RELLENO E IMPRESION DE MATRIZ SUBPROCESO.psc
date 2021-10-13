Algoritmo sin_titulo
	//Realizar un programa que rellene de números aleatorios una matriz a través de un
	//subprograma y generar otro subprograma que muestre por pantalla la matriz final.
	Definir matriz,fila,columna Como Entero
	fila=3
	columna=3
	Dimension matriz(fila,columna)

	relleno(matriz,fila,columna)
	impresion(matriz,fila,columna)
FinAlgoritmo
SubProceso relleno(matriz,fila,columna)
Para fila=0 Hasta 2 Hacer
	Para columna=0 Hasta 2 Hacer
		matriz(fila,columna)=Aleatorio(1,9)
	Fin Para
Fin Para
FinSubProceso

SubProceso impresion(matriz,fila,columna)
	Para fila=0 Hasta 2 Hacer
		Para columna=0 Hasta 2 Hacer
			Escribir Sin Saltar " [",matriz(fila,columna) "] "
		Fin Para
		Escribir " "
	Fin Para
	FinSubProceso
	