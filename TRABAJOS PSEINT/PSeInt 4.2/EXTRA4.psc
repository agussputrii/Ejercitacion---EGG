Algoritmo sin_titulo
	//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. 
	//Inicialice las matrices para evitar el ingreso de datos por teclado.
	Definir matriz1,matriz2,matrizres,n,m,p,acumulador Como Entero

	Dimension matriz1(3,3)
	Dimension matriz2(3,3)
	Dimension matrizres(3,3)
	acumulador=0
	Para n=0 Hasta 2 Hacer
		Para m=0 Hasta 2 Hacer
			matriz1(n,m)=Aleatorio(1,9)
			matriz2(n,m)=Aleatorio(1,9)
		FinPara
	Fin Para
	Para n=0 Hasta 2 Hacer
		Para m=0 Hasta 2 Hacer
			Escribir Sin Saltar " [",matriz1(n,m) "] "
		Fin Para
		Escribir " "
	Fin Para
	
	Escribir " "
	Escribir " "
	
	Para n=0 Hasta 2 Hacer
		Para m=0 Hasta 2 Hacer
			Escribir Sin Saltar " [",matriz2(n,m) "] "
		Fin Para
		Escribir " "
	Fin Para
	
	Para n=0 Hasta 2 Hacer
		Para m=0 Hasta 2 Hacer
			matrizres(n,m)=0
		FinPara
	Fin Para
	
	Para m=0 hasta 2 Hacer
		para n=0 hasta 2 Hacer
			acumulador=0
			Para p=0 Hasta 2
				matrizres[m,n] = matriz1[m,p] * matriz2[p,n]
				acumulador = acumulador + matrizres[m,n]
			FinPara
			Escribir Sin Saltar " [",acumulador "] "
		FinPara
		Escribir ""
	FinPara
	
	Escribir ""
//	Para n=0 Hasta 2 Hacer
//		Para m=0 Hasta 0 Hacer
//			Escribir Sin Saltar " [",matrizres(n,m) "] "
//		Fin Para
//		Escribir " "
//	Fin Para
//	Escribir ""
	
FinAlgoritmo
