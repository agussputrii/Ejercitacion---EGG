Algoritmo sin_titulo
	//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
	//y los muestre por pantalla.
	
	Definir tamanoarreglo,arreglo1,arreglo2,i Como Entero
	Escribir "ESCRIBIME EL TAMANO DE TU VECTOR, DALE PIBE"
	Leer tamanoarreglo
	
	i=0
	
	Dimension arreglo1(tamanoarreglo)
	Dimension arreglo2(tamanoarreglo)
	
	Para i=0 Hasta tamanoarreglo-1 Con Paso 1 Hacer
		arreglo1(i)=Aleatorio(-100,100)
		Escribir Sin Saltar " [",arreglo1(i) "] "
	Fin Para	
	
	Escribir " "
	
	Para i=0 Hasta tamanoarreglo-1 Con Paso 1 Hacer
		arreglo2(i)=Aleatorio(-100,100)
		Escribir Sin Saltar " [",arreglo2(i) "] "
	Fin Para
	
	Escribir " "
FinAlgoritmo
