Algoritmo sin_titulo
	//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
	//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a
	//buscar tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n
	//donde se encuentra el valor. En caso que el n�mero se encuentre repetido dentro del
	//arreglo se deben imprimir todas las posiciones donde se encuentra ese valor.
	///Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un mensaje.
	Definir vectorN,long_vector,i,aux_vector Como Entero
	Escribir "Ingrese de que tamano desea el vector"
	Leer long_vector
	
	dimension vectorN(long_vector)
	
	Escribir "Ahora ingresa los numeros que quieras almacenar en el vector"
	
	Para i=0 hasta long_vector-1 Hacer
		Leer vectorN(i)
	FinPara
	
	escribir "Ahora decime que posicion del vector queres saber"
	Leer aux_vector
	
	Para i=0 hasta long_vector-1 Hacer
		Escribir "vueltas al vector: ",i
		Escribir ""
		si aux_vector = vectorN(i) Entonces
			Escribir "El numero se encuentra en la posicion ",i
		FinSi
		si aux_vector <> vectorN(i) Entonces
			Escribir "El numero no se encuentra almacenado"
		FinSi
	FinPara	
FinAlgoritmo
