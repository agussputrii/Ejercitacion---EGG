
Algoritmo sin_titulo
	Definir matriz, muestra como cadena
	Definir matrizValida como logico
	Definir sizeMatriz como entero
	Escribir "Ingrese la muestra de cuatro posibles bases (A,B,C,D)"
	leer muestra
	sizeMatriz= trunc(rc(Longitud(muestra))) //la raiz de la cantidad de letras me da la dimension de la matriz
	Dimension matriz(sizeMatriz, sizeMatriz) //asigno tamaño
	
	matrizValida= validarMatriz(muestra) //veo si valido es verdadero o falso
	Si (matrizValida)Entonces //si es valida la matriz
		asignarMatriz(muestra, sizeMatriz, matriz) //llamo a asignar cada letra a la matriz
		imprimirMatriz(sizeMatriz, matriz)
		detectarGenZ(sizeMatriz, matriz)
	SiNo
		Escribir "Lamentablemente la muestra no es valida"
	FinSi
	
FinAlgoritmo


Funcion esValido <- validarMatriz (muestra) //me devuelve si es v o f que es valido
	Definir esValido, diagonalPrimera,diagonalSegunda como logico 
	esValido= falso 
	diagonalPrimera=falso
	diagonalSegunda=falso
	//Galard aclara que para que la muestra sea válida el orden de la matriz (el valor de M) debe ser 3, 4 o 37
	Si (Longitud(muestra)= 9 o Longitud(muestra)= 16 o Longitud(muestra)= 1369) Entonces
		//si la muestra es de 3x3=9 o 4x4=16 o 37x37=1369
		esValido=Verdadero
	SiNo
		esValido=Falso //no es valido
	Fin Si

FinFuncion

//////////////////////////////////////////////////////////////////////////
//ACDDCADBCDABDBBA
SubProceso asignarMatriz(muestra,n,matriz Por Referencia) //paso la matriz por referencia ya que en el algoritmo principal esta vacio y aca lo relleno
	Definir fila, columna,i como entero
	i=0
	Para fila<-0 Hasta n-1 Hacer
		Para columna<-0 Hasta n-1 Hacer
		matriz(fila, columna)= SubCadena(muestra,i,i) //i va incrementandose asi va evaluando letra por letra desde la posicion 0 hasta n-1
		i=i+1
		Fin Para
	Fin Para
FinSubProceso
/////////////////////////////////////////////////////////////////////////////////
SubProceso imprimirMatriz(n,matriz)
	Definir fila, columna como entero
	
	Para fila<-0 Hasta n-1 Hacer
		Para columna<-0 Hasta n-1 Hacer
			Escribir Sin Saltar matriz(fila, columna), " "
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso
/////////////////////////////////////////aca se viene lo chido
SubProceso  detectarGenZ (n, matriz)
	Definir fila, columna, contadorA, contadorB, contadorC, contadorD como entero
	Definir encontrado,diagonalPrimera, diagonalSegunda como logico
	Definir diagonal1, diagonal2 como cadena
	Definir letra como cadena
	diagonal1=""
	diagonal2=""
	encontrado= falso
	diagonalPrimera=falso
	diagonalSegunda=falso
	contadorA=0
	contadorB=0
	contadorC=0
	contadorD=0
	
	Para fila<-0 Hasta n-1 Hacer //guardamos las diagonales de arriba a abajo
		Para columna<-0 Hasta n-1 Hacer
			Si (fila=columna)Entonces
				diagonal1=Concatenar(diagonal1,matriz(fila,columna))//guardo las letras en diagonal
			FinSi
		Fin Para
	Fin Para	
	
	//guardamos las diagonales de abajo a arriba
	Para fila<-n-1 Hasta 0 Con Paso -1 Hacer //aca cambia: fila vale n-1 para arrancar en la ultima fila y con paso -1 para que vaya "para arriba" o sea retrocediendo en fila
		Para columna<-0 Hasta n-1 Hacer
			Si (fila=columna)Entonces
				diagonal2=Concatenar(diagonal2,matriz(fila,columna))//tambien guardo las letras en diagonal
			FinSi
		Fin Para
	Fin Para
	
	
	Para fila<-0 Hasta (Longitud(diagonal1)-1)  Hacer  //recorro la primera cadena con las diagonales
		letra= SubCadena(diagonal1,fila,fila)
		Segun letra Hacer
			"A":
				contadorA=contadorA+1
			"B":
				contadorB=contadorB+1
			"C":
				contadorC=contadorC+1
			"D":
				contadorD=contadorD+1
		Fin Segun
	Fin Para
	Si (contadorA=n o contadorB=n o contadorC=n o contadorD=n) Entonces //si una letra se repite, llega hasta el tamaño de la matriz o se repite en todas las diagonales
		diagonalPrimera=verdadero
	Fin Si
	//vuelvo a inicializar en cero los contadores asi no quedan con los valores anteriores
	contadorA=0
	contadorB=0
	contadorC=0
	contadorD=0
	Para fila<-0 Hasta (Longitud(diagonal2)-1)  Hacer //hago lo mismo de recorrer las diagonales de abajo hacia arriba
		letra= SubCadena(diagonal2,fila,fila)
		Segun letra Hacer
			"A":
				contadorA=contadorA+1
			"B":
				contadorB=contadorB+1
			"C":
				contadorC=contadorC+1
			"D":
				contadorD=contadorD+1
		Fin Segun
	Fin Para
	
	Si (contadorA=n o contadorB=n o contadorC=n o contadorD=n) Entonces //lo mismo para verificar si se repitio en toda la diagonal
		diagonalSegunda=verdadero
	Fin Si
	
	Si (diagonalPrimera y diagonalSegunda)Entonces //si las dos diagonales tienen letras que se repiten en cada una se encuentra el gen z
		encontrado=Verdadero
		Escribir "Encontramos el gen Z estamos SALVADOS"
	SiNo
		encontrado=Falso
		Escribir "No encontramos el gen z"
	FinSi
	
FinSubProceso

	