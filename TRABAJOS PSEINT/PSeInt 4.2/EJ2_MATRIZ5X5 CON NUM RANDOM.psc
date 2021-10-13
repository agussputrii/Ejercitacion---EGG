Algoritmo sin_titulo
//	Escribir un programa que realice la búsqueda lineal de un número entero ingresado por
//	el usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//	coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra.
//	En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
	Definir matriz,fila,columna,num Como Entero
	fila=5
	columna=5
	Dimension matriz(fila,columna)
	
	Escribir "Ingresa un numero entero"
	leer num
	Para fila=0 Hasta 4 Hacer
		Para columna=0 Hasta 4 Hacer
			matriz(fila,columna)=Aleatorio(1,10)
		Fin Para
	Fin Para
	
	Para fila=0 Hasta 4 Hacer
		Para columna=0 Hasta 4 Hacer
			Escribir Sin Saltar " [",matriz(fila,columna) "] "
		Fin Para
		Escribir " "
	Fin Para
	Escribir verificacion(matriz,num)
	
FinAlgoritmo

Funcion se_encuentra=verificacion(matriz,num Por Valor)
	Definir aux,fila,columna Como entero
	Definir se_encuentra Como Logico
	se_encuentra=Falso
	Para fila=0 Hasta 4 Hacer
		Para columna=0 Hasta 4 Hacer
			si matriz(fila,columna)=num
				se_encuentra=Verdadero
				Escribir "Tu numero se encuentra en la fila [",fila+1 "] de la columna [",columna+1 "]."
			FinSi
		Fin Para
	Fin Para
	
	si se_encuentra=Falso Entonces
		Escribir "No se pudo hallar el numero solicitado"
	FinSi
FinFuncion