Algoritmo sin_titulo
	//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo
	//y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados
	//al arreglo.
	Definir suma,resta,div,multi,vectornum,i,auxdiv,resdiv Como Real
	Dimension vectornum(10) 
	suma=0
	multi=1
	
	Escribir "Ingresa 10 numeros"
	
	Para i=0 Hasta 9 Con Paso 1 Hacer
		Leer vectornum(i)
	Fin Para
	
	resta=vectornum(0)

	Para i=0 Hasta 9 Con Paso 1 Hacer
		suma = suma + vectornum(i)
		resta = resta - vectornum(i)
		multi= multi * vectornum(i)
	Fin Para

	Escribir "Su suma es " suma "."
	Escribir "Su resta es " resta "."
	Escribir "Su multiplicacion es " multi "."

FinAlgoritmo
