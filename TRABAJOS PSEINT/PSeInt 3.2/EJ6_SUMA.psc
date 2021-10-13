Algoritmo EJ6_SUMA
	
	Definir var_1, result Como Entero
	Escribir "Ingrese un número entero: "
	Leer var_1
	result=suma(var_1)
	Escribir "La suma de los primeros " ,var_1, " enteros es: " result
FinAlgoritmo


Funcion res=suma(var_1)
	Definir res Como Entero
	Si var_1 <> 0
	res=var_1+suma(var_1-1)
	FinSi

	
FinFuncion
	