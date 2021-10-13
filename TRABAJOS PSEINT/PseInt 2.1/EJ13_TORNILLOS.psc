Algoritmo EJ13_TORNILLOS
	//Producir menos de 200 tornillos defectuosos.
	//Producir más de 10000 tornillos sin defectos.
	//El grado de eficiencia se determina de la siguiente manera:
	//Si no cumple ninguna de las condiciones, grado 5.
	//Si sólo cumple la primera condición, grado 6.
	//Si sólo cumple la segunda condición, grado 7.
	//Si cumple las dos condiciones, grado 8
	Definir tornillodefect,tornilloperfect,grado como entero

	Escribir "Ingresa la cantidad de tornillos defectuosos"
	Leer tornillodefect
	
	Escribir "Ingresa la cantidad de tornillos sin defectos"
	Leer tornilloperfect
	
	grado = 0

		si tornillodefect<200 Entonces
		grado = 1
		FinSi
		
		si tornilloperfect>10000 Entonces
		grado = 2
		FinSi

		si tornillodefect<200 y tornillodefect>10000 Entonces
		grado= 3
		FinSi
		
	
	Segun grado hacer
		1:
			Escribir "La calidad de los tornillos es de Grado 6"
		2:
			Escribir "La calidad de los tornillos es de Grado 7"
		3:
			Escribir "La calidad de los tornillos es de Grado 8"
				de otro modo
				Escribir "La calidad de los tornillos es de Grado 5"
	FinSegun
FinAlgoritmo

