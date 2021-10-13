Algoritmo vector_5
	definir seleccion,seleccion2 Como caracter
	Definir i,opcion1,opcion2,opcion3,opcion4,opcion5,opcion6,n,num1,num2,num3 Como Entero
	
	Escribir "Opcion A: llenar un vector de tamaño N con numeros aleatorio con minimo -100 y maxima 100"
	Escribir "Opcion B: llenar un vector de tamaño N con numeros aleatorios"
	Escribir "Opcion C: llenar un vector con la suma de los vectores A y B"
	Escribir "Opcion D: llenar un vector con la resta de los vectores A y B"
	Escribir "Opcion E: mostrar el índice de un vector"
	Escribir "Opcion F: salir del programa"
	Leer seleccion
	si seleccion="f" o seleccion="F" Entonces
		Escribir "Usted decidió salir del programa"
	SiNo
		Escribir "Ingrese el tamaño del vector"
		leer n
		Dimension num1(n)
		Dimension num2(n)
		Dimension num3(n)
		Segun seleccion Hacer
			"A","a":
				Para i=0 Hasta N-1 Hacer
					num1(i)=Aleatorio(-100,100)
				FinPara
				para i=0 Hasta n-1 Hacer
					Escribir Sin Saltar num1(i) "  "
				FinPara
			"B","b":
				Para i=0 Hasta n-1 Hacer
					num2(i)=Aleatorio(-1000,1000)
				FinPara
				para i=0 Hasta N-1 Hacer
					Escribir Sin Saltar num2(i) "  "
				FinPara
			"C","c":
				Para i=0 Hasta N-1 Hacer
					num1(i)=Aleatorio(-100,100)
					num2(i)=Aleatorio(-1000,1000)
					num3(i)=num1(i)+num2(i)
				FinPara
				para i=0 Hasta N-1 Hacer
					Escribir Sin Saltar num3(i) "  "
				FinPara
			"D","d":
				Para i=0 Hasta N-1 Hacer
					num1(i)=Aleatorio(-100,100)
					num2(i)=Aleatorio(-1000,1000)
					num3(i)=num1(i)-num2(i)
				FinPara
				para i=0 Hasta N-1 Hacer
					Escribir Sin Saltar num3(i) "  "
				FinPara
			"E","e":
				Escribir "Seleccione A,B o C"
				leer seleccion2
				Segun seleccion2 Hacer
					"A","a":
						Para i=0 Hasta N-1 Hacer
							num1(i)=Aleatorio(-100,100)
						FinPara
						para i=0 Hasta n-1 Hacer
							Escribir Sin Saltar num1(i) "  "
						FinPara
					"B","b":
						Para i=0 Hasta n-1 Hacer
							num2(i)=Aleatorio(-1000,1000)
						FinPara
						para i=0 Hasta N-1 Hacer
							Escribir Sin Saltar num2(i) "  "
						FinPara
					"C","c":
						Para i=0 Hasta N-1 Hacer
							num1(i)=Aleatorio(-100,100)
							num2(i)=Aleatorio(-1000,1000)
							num3(i)=num1(i)+num2(i)
						FinPara
						para i=0 Hasta N-1 Hacer
							Escribir Sin Saltar num3(i) "  "
						FinPara
						Para i=0 Hasta N-1 Hacer
							num1(i)=Aleatorio(-100,100)
							num2(i)=Aleatorio(-1000,1000)
							num3(i)=num1(i)-num2(i)
						FinPara
						para i=0 Hasta N-1 Hacer
							Escribir Sin Saltar num3(i) "  "
						FinPara
				FinSegun
		FinSegun
	FinSi
	
FinAlgoritmo