Algoritmo sin_titulo
//	Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos
//	y ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna
//	de ceros.
	Definir matriz,a,b Como Entero
	dimension matriz(5,15)
	
	Para a = 0 Hasta 4 Con Paso 1 Hacer
		Para b = 0 Hasta 14 Con Paso 1 Hacer
			Si a = 0 O a = 4 O b = 0 O b = 14 Entonces
				Escribir Sin Saltar "[1] ";
			SiNo
				Escribir Sin Saltar "[0] ";
			FinSi
		Fin Para
		
		Escribir "";
	Fin Para
FinAlgoritmo
