Algoritmo sin_titulo
	Definir practica, problemas, teoria, promedio Como real
	Definir nombre Como Caracter
	
	nombre = " "
	
	Mientras nombre <> "" Hacer
		Escribir "Ingrese el nombre del alumno"
		Leer nombre
		
		Si (nombre <> "") Entonces
			Escribir "Ingrese el valor de la nota de practica"
			Leer practica
			
			Escribir "Ingrese el valor de la nota de problemas"
			Leer problemas
			
			Escribir "Ingrese el valor de la nota de teoria"
			Leer teoria
			
			promedio = (practica * 0.1) + (problemas * 0.5) + (teoria * 0.4)
			Escribir "El promedio del alumno ",nombre, " es  de ",promedio
		Fin Si
		
	Fin Mientras
	Escribir "";
FinAlgoritmo
