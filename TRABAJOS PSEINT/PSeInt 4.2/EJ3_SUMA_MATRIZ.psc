Algoritmo sin_titulo
//	Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario)
//	realizar un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos
//	otro subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar
//	la matriz y los resultados por pantalla.
	Definir matriz,fila,columna,n,m Como Entero
	Escribir	"Ingresa el numero de filas y columnas deseadas"
	Leer n,m
	Dimension matriz(n,m)
	
	Para fila=0 Hasta n-1 Con Paso 1 Hacer
		Para columna=0 hasta m-1 Con Paso 1 Hacer
			matriz(fila,columna)=Aleatorio(1,10)
		FinPara
	Fin Para
	
	escribirmatriz(matriz,n,m)
	
	suma(matriz,n,m)
	
FinAlgoritmo

SubProceso escribirmatriz(matriz,n,m)
	Definir fila, columna Como Entero
	Para fila=0 Hasta n-1 Con Paso 1 Hacer
		Para columna=0 hasta m-1 Con Paso 1 Hacer
			Escribir Sin Saltar " [",matriz(fila,columna) "] "
		FinPara
		escribir " "
	FinPara
FinSubProceso

Funcion suma(matriz,n,m)
	Definir resultado,fila,columna Como Entero
	resultado=0
	Para fila=0 Hasta n-1 Con Paso 1 Hacer
		Para columna=0 hasta m-1 Con Paso 1 Hacer
			resultado = resultado + matriz(fila,columna) 
		FinPara
	FinPara
	Escribir "La suma de los numeros actuales de la matriz es de [",resultado "]"
FinFuncion
