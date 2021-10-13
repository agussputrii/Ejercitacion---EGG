Algoritmo sin_titulo
	//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
	//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector
	//se debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la
	//función Longitud() de PseInt). 
	///Mostrar por pantalla cada uno de los nombres junto con su longitud.
	
	Definir tamanoarreglo,arreglonum,i,longtexto Como Entero
	Definir nombresvector Como Caracter
	Escribir "ESCRIBIME EL TAMANO DE TU VECTOR, DALE PIBE"
	Leer tamanoarreglo
	
	Dimension arreglonum(tamanoarreglo)
	Dimension nombresvector(tamanoarreglo)
	Escribir "Ingresa los nombres de acuerdo al vector seleccionado [",tamanoarreglo "]"
	Para i=0 Hasta tamanoarreglo-1 Con Paso 1 Hacer
		leer nombresvector(i)
	FinPara
	
	Para i=0 Hasta tamanoarreglo-1 Hacer
		escribir "La longitud de la palabra [",nombresvector(i) "] es de [",longitud(nombresvector(i)) "] caracteres"
		Escribir " "
	FinPara

FinAlgoritmo
