
Algoritmo EX3
		
		//3. Escriba un programa que solicite al usuario n�meros decimales mientras que el usuario
		//escriba n�meros mayores al primero que se ingres�. Por ejemplo: si el usuario ingresa
		//como primer n�mero un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
		//n�mero. El programa continuar� solicitando valores sucesivamente mientras los valores
		//ingresados sean mayores que 3.1, caso contrario, el programa finaliza
		
	
		Definir num_min, num_max,num_cache,contador Como real
		
		Escribir "Ingrese el valor minimo"
		leer num_min
		num_cache = 99999999999
		
		
		Mientras ((num_cache >= num_min)) Hacer
			Escribir "Ingrese un numero decimal"
			Leer num_cache
			
		Fin Mientras
		
		Escribir "Numero menor al valor, inicial, tarea de ejecucion finalizada"
		
FinAlgoritmo
