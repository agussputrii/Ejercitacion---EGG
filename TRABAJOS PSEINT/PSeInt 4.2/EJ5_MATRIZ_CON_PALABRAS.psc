Algoritmo EJ5_MATRIZ_CON_PALABRAS
//	Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//	encontrando la manera de que la frase se muestre de manera continua en la matriz.
	Definir n,m,longfrase,i Como entero
	Definir subfrase,matriz,frase Como Caracter
	n=3
	m=3
	i=0
	Dimension matriz(n,m)
	
	Escribir "Ingresa una palabra de 9 letras para nuestra matriz"
	leer frase
	frase=Mayusculas(frase)
	Para n=0 Hasta 2 Hacer
		Para m=0 Hasta 2 Hacer
			matriz(n,m) = subcadena(frase,i,i)
			Escribir Sin Saltar " [",matriz(n,m) "] "
			i=i+1
		Fin Para
		Escribir " "
	Fin Para
FinAlgoritmo
