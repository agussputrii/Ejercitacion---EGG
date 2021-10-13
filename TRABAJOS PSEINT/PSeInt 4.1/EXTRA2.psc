Algoritmo sin_titulo
	//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
	//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados. 

	
	Definir tamanoarreglo,arreglo1,i,suma,numarreglo Como Entero
	Escribir "ESCRIBIME EL TAMANO DE TU VECTOR, DALE PIBE"
	
	Leer tamanoarreglo
	Dimension arreglo1(tamanoarreglo)
	
	Escribir "Ahora ingresa los numeros que quieras sumar"
	
	suma=0
	i=0
	
	Para i=0 Hasta tamanoarreglo-1 Con Paso 1 Hacer
		Leer arreglo1(i)
		suma = suma + arreglo1(i)
	Fin Para	
	Escribir Sin Saltar " la suma de los numeros ingresados es [",suma "] "

	Escribir " "
FinAlgoritmo
