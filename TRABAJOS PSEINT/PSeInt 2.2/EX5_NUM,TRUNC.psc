Algoritmo sin_titulo
//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//investigar la función trunc().
	Definir  num,contador como entero
	
	Hacer
		Escribir "Escribe un numero entero POSITIVO";
		leer num
	Mientras Que num<0
	
	contador = 0
	
	Mientras num<>0 Hacer
		num = trunc(num/10)
		contador = contador + 1
	Fin Mientras
	
	Escribir "El numero tiene ",contador " cifras."
	
	
FinAlgoritmo
