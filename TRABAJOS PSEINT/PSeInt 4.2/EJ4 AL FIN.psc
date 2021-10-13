Algoritmo sin_titulo
	Definir matriz,fila,columna,num Como Entero
	fila=5
	columna=5
	Dimension matriz(fila,columna)
	num=0
	Para fila=0 Hasta 4 Hacer
		Para columna=0 Hasta 4 Hacer
			matriz(fila,columna)=Aleatorio(1,9)
		Fin Para
	Fin Para
	
	
	Para fila=0 Hasta 4 Hacer
		Para columna=0 Hasta 4 Hacer
			cero(matriz,num)
			Escribir Sin Saltar " [",matriz(fila,columna) "] "
		Fin Para
		Escribir " "
	Fin Para

FinAlgoritmo

subproceso cero(matriz,num Por Valor)
	Definir aux,fila,columna Como entero
	Definir se_encuentra Como Logico
	se_encuentra=Falso
	Para fila=0 Hasta 4 Hacer
		Para columna=0 Hasta 4 Hacer
			si matriz(0,0)<>num
			matriz(0,0)=0
			FinSi
			si matriz(1,1)<>num
				matriz(1,1)=0
			FinSi
			si matriz(2,2)<>num
				matriz(2,2)=0
			FinSi
			si matriz(3,3)<>num
				matriz(3,3)=0
			FinSi
			si matriz(4,4)<>num
				matriz(4,4)=0
			FinSi
		Fin Para
	Fin Para
FinSubProceso
