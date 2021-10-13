Algoritmo sin_titulo
	//Disponemos de un vector unidimensional de 20 elementos de tipo carácter
	definir vectorchar,frase,frasecadena,pedidochar,desplazarchar Como Caracter
	definir i,posisionchar Como Entero
	Dimension vectorchar(20)
	
	///Ayuda: utilizar la función Subcadena de PSeInt.
	Escribir "Ingrese una frase de 20 caracteres"
	leer frase
	
	Para i=0 hasta 19 Hacer
		vectorchar(i)=Subcadena(frase,i,i)
		Escribir Sin Saltar vectorchar(i)
	FinPara

	Escribir " "
	Escribir " "
	Escribir "Ingresar un caracter"
	leer pedidochar
	Escribir "Ingresar la posicion en la que desea mover el caracter"
	Leer posisionchar
	
	si vectorchar(posisionchar-1)="" o vectorchar(posisionchar-1)=" " Entonces
		vectorchar(posisionchar-1)=pedidochar
	SiNo
		para i=19 Hasta posisionchar Hacer
				vectorchar(i)=vectorchar(i-1)
		FinPara
		vectorchar(posisionchar-1)=pedidochar
	FinSi
	Escribir ""
	
FinAlgoritmo

