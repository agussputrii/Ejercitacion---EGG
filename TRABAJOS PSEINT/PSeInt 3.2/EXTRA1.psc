Algoritmo sin_titulo
	Definir var_num1 Como Entero
	
	Escribir "[ * ] Ingrese un n�mero:"; Leer var_num1
	
	Escribir "[ ! ] El n�mero: ", var_num1, " tiene: ", ReturnDivisores( var_num1 ), " divisores"
	
FinAlgoritmo

Funcion divisores <- ReturnDivisores( num )
	
	Definir divisores, i Como Entero
	divisores = 0
	
	Para i = 1 Hasta  num
		Si num mod i = 0 Entonces divisores = divisores + 1 ; FinSi
	FinPara
FinFuncion

