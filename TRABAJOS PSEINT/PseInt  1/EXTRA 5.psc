Algoritmo Aumento_o_disminucion_de_un_producto
	Definir v1, v2 Como Entero
	definir res Como Real
	definir dism,aum Como Logico
	
	
	Escribir "Ingrese el precio del primer producto"
	leer v1
	
	Escribir "Ingrese el precio del segundo producto"
	leer v2
	
	res =  ((v2 - v1) / v1) * 100
	
	dism = res<0
	aum = res>0
	
	si dism Entonces
		Escribir "La disminucion del precio del producto fue un total de ",res "%"
	FinSi
	
	si aum Entonces
		Escribir "El incremento del precio del producto fue un total de ",res "%"
	FinSi
FinAlgoritmo
