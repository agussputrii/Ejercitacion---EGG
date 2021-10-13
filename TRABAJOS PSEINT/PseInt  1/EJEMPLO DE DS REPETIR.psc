Algoritmo sin_titulo
	//definir las variables
    Definir edad Como Entero
    Definir codigo Como Real
    Definir final Como Real
	Escribir "ingrese la edad"
	leer edad
	Si edad >= 18 Entonces
		Escribir "puede ingresar a la discoteca"
		
	SiNo
		Escribir "NO entras puto"
		
	Fin Si
	Repetir
		
		Escribir "Desea continuar (si es: 1, no es 2)"
		Leer codigo
		Si codigo==1 Entonces
			Escribir "ingrese la edad"
			leer edad
			Si edad >= 18 Entonces
				Escribir "puede ingresar a la discoteca"
				
			SiNo
				Escribir "NO entras puto"
				
			Fin Si
		SiNo
			final <- 3
			Escribir "Termino"
		Fin Si
	Hasta Que 3 == final
FinAlgoritmo
