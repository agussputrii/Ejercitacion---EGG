Algoritmo EJ2_SueldoEmpleado
	//Un hombre desea saber si su sueldo es mayor al sueldo m�nimo, el programa le pedir�
	//al usuario su sueldo actual y el sueldo m�nimo. Si el sueldo es mayor al m�nimo se debe
	//mostrar un mensaje por pantalla indic�ndolo.
	Definir sueldoempleado,sueldominimo Como Entero
	Escribir "Escribi tu sueldo para ver si llegas a fin de mes"
	leer sueldoempleado
	sueldominimo = 25000
	si sueldoempleado > sueldominimo Entonces
		Escribir "Felicidades, superas el salario minimo, extendiste tu cuota de supervivencia un mes m�s"
	SiNo
		Escribir "No cumplis con el salario minimo, a comer polenta 1 a�o m�s"
	FinSi

FinAlgoritmo
