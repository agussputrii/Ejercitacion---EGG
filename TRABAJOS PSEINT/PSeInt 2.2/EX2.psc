Algoritmo EX2
	Definir num_min, num_max, num, contador Como Entero
	
	Escribir "Ingrese el valor minimo"
	leer num_min
	
	Escribir "Ingrese el valor maximo"
	Leer  num_max
	
	contador = 0
	num = num_max - 1
	
	Mientras ((num >= num_min) y (num <= num_max)) Hacer
		Escribir "Ingrese un numero entre ",num_min, " y ", num_max
		Leer num
		
		Si ((num >= num_min) y (num <= num_max)) Entonces
			contador = contador + 1
		Fin Si
	Fin Mientras
	
	Escribir "La cant de numeros dentro del intervalo es: ",contador
FinAlgoritmo
