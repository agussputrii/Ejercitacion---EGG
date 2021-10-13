Algoritmo EJ2_SueldoEmpleado
	//Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá
	//al usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
	//mostrar un mensaje por pantalla indicándolo.
	Definir sueldoempleado,sueldominimo Como Entero
	Escribir "Escribi tu sueldo para ver si llegas a fin de mes"
	leer sueldoempleado
	sueldominimo = 25000
	si sueldoempleado > sueldominimo Entonces
		Escribir "Felicidades, superas el salario minimo, extendiste tu cuota de supervivencia un mes más"
	SiNo
		Escribir "No cumplis con el salario minimo, a comer polenta 1 año más"
	FinSi

FinAlgoritmo
