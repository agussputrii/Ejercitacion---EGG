Algoritmo sin_titulo
	//Disponemos de un vector unidimensional de 20 elementos de tipo car�cter
	definir vectorchar,frase,frasecadena,pedidochar Como Caracter
	definir i,posisionchar Como Entero
	Dimension vectorchar(20)
	
	//Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra. 
	///Ayuda: utilizar la funci�n Subcadena de PSeInt.
	Escribir "Ingrese una frase de 20 caracteres"
	leer frase
	//frasecadena=SubCadena(frase,0,19)
	
	Para i=0 hasta 19 Hacer
		vectorchar(i)=Subcadena(frase,i,i)
		Escribir Sin Saltar vectorchar(i)
	FinPara
	
	//pedirle al usuario un car�cter cualquiera y una
	//posici�n dentro del arreglo, y el programa debe intentar ingresar el car�cter
	//en la posici�n indicada, si es que hay lugar (es decir la posici�n est� vac�a o
	//es un espacio en blanco).
	Escribir " "
	Escribir " "
	Escribir "Ingresar un caracter"
	leer pedidochar
	Escribir "Ingresar la posicion en la que desea reemplazar el caracter"
	Leer posisionchar
	
	Repetir
		escribir "La posicion se encuentra ocupada, reintentar"
		leer posisionchar
	Mientras que vectorchar(posisionchar)<>" "
	
	si vectorchar(posisionchar)=" " Entonces
		vectorchar(posisionchar)=pedidochar
		Para i=0 Hasta 19 Hacer
			Escribir Sin Saltar vectorchar(i)
		FinPara
	FinSi
	Escribir ""
	
FinAlgoritmo
