Algoritmo sin_titulo
//	Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario),
//	llenarla con números aleatorios entre 1 y 100 y mostrar su traspuesta
	Definir traspuesta,n,m,resultado Como Entero
	Leer n,m
	Dimension traspuesta(n,m)
	
	aleatorionum(traspuesta,n,m)
	Escribir " "
	Escribir " "
	traspuestasub(traspuesta,n,m)
	
FinAlgoritmo

SubProceso aleatorionum(traspuesta,n,m)
	Definir i,j Como entero
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			traspuesta(i,j)=Aleatorio(1,100)
		Fin Para
	Fin Para
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar " [",traspuesta(i,j) "] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

SubProceso traspuestasub(traspuesta,n,m)
	Definir i,j Como entero
	i=n
	j=m
	Para n=0 Hasta i-1 Hacer
		Para m=0 Hasta j-1 Hacer
			Escribir Sin Saltar " [",traspuesta(m,n) "] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso
	