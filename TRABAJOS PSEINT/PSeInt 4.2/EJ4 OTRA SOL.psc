Algoritmo sin_titulo
	Definir i,j Como Entero
	//Escribir "Ingrese la cantidad de filas y columnas que desea"
	//Leer i,j
	Dimension matriz(5,5)
	Definir matriz Como Entero
	
	Para i=0 Hasta 4
		Para j=0 Hasta 4
			//si i=j Entonces
			si j = i Entonces
				
				matriz(i,j)= 0
				//Escribir "\"
			SiNo
				matriz(i,j)= Aleatorio(1,9)
			FinSi
		FinPara
	FinPara
	imprimeMatriz(matriz)
FinAlgoritmo
SubProceso imprimeMatriz(matriz)
	Definir i, j Como Entero
	Para i=0 Hasta 4
		Para j=0 Hasta 4
			Escribir "[" matriz(i,j), "]  " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
