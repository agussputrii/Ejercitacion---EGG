Algoritmo sin_titulo
	//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios.
	
	Definir tamanoarreglo,arreglo1,arreglo2,i Como Entero
	Escribir "ESCRIBIME EL TAMANO DE TU VECTOR, DALE PIBE"
	Leer tamanoarreglo
	
	i=0
	
	Dimension arreglo1(tamanoarreglo)
	Dimension arreglo2(tamanoarreglo)
	
	Para i=0 Hasta tamanoarreglo-1 Con Paso 1 Hacer
		arreglo1(i)=Aleatorio(1,3)
		Escribir Sin Saltar " [",arreglo1(i) "] "
	Fin Para	
	
	Escribir " "
	
	Para i=0 Hasta tamanoarreglo-1 Con Paso 1 Hacer
		arreglo2(i)=Aleatorio(1,3)
		Escribir Sin Saltar " [",arreglo2(i) "] "
	Fin Para
	
	Escribir " "
	
	Escribir comparacion(arreglo1,arreglo2,tamanoarreglo)
FinAlgoritmo
//Después, hacer una función que reciba los dos arreglos y diga si todos sus valores son
//iguales o no. La función debe devolver el resultado de está validación, para mostrar el
//mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo lógico.
Funcion resultado = comparacion(arreglo1 Por Referencia,arreglo2 Por Referencia,tamanoarreglo)
	
	Definir i,long1,long2,valor1arreglo,valor2arreglo,contador Como Entero
	Definir  resultado,aux Como Logico
	
	contador=0
	aux	= Falso
	//Para i=0 Hasta tamanoarreglo-1 Hacer
//		arreglo1(i)=arreglo2(i)
//	Fin Para
	
	Para i=0 Hasta tamanoarreglo-1 Hacer
		si arreglo1(i)=arreglo2(i)
			contador = contador + 1
			
		FinSi
		si contador = tamanoarreglo entonces
			resultado = Verdadero
		Finsi
	FinPara
	
	
	Escribir "Los numeros se repiten ",contador " veces"

Fin Funcion


