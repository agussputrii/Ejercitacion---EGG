Algoritmo sin_titulo
	Definir  x,n Como Entero
	Definir sueldo,comision, a,b,c Como Real
	Escribir "Escribe el numero de trabajadores"
	leer n
	x = 1
	Mientras x <= n hacer
		Escribir "Escribe el sueldo base del trabajador"
		Leer sueldo
		Escribir "escribe las tres ventas del mes"
		Leer a,b,c
		comision = (a+b+c) * .10
		Escribir "El sueldo mensual es: $", sueldo
		Escribir "La comision del mes es: $",comision
		Escribir "El sueldo total ya la comision es: $",sueldo + comision
		x = x + 1
	FinMientras
FinAlgoritmo
