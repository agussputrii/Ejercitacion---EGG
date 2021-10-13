Algoritmo sin_titulo
	Definir n, x, j, j1 Como Entero
	
    Escribir "Ingresa un numero"
    Leer n
	
    j1= 1
    x = 1
    j = 0
	
    Escribir Sin Saltar "n = "
	
    Para x <- 1 Hasta n -1  Con Paso 1 Hacer
        Escribir Sin Saltar x "* "
        Si x = n -1 Entonces
            Escribir Sin Saltar n
        Fin Si
		
        j = x + 1
        j1 = j1 + j
    Fin Para
	
    Escribir Sin Saltar " = " j1
FinAlgoritmo
