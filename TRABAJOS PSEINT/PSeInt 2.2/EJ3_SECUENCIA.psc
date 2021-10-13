Algoritmo EJ3_SECUENCIA
	//Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
	//ejemplo: 5,3,0,2,4,4,0,0,2,3,6, 0...-1; realizar un programa que calcule el promedio de los
	//números ingresados. Suponemos que el usuario no insertará número negativos.
	
	
	Definir num,suma,contador Como Real;
	
	suma = 0;
	contador = 1;
	
	Escribir "Ingrese una secuencia de numeros de la cual quieras saber el promedio";
	Escribir "La secuencia finalizará al ingresar -1";
	
	Leer num;
	
	Mientras (num <> -1) Hacer
		suma = suma + num;
		contador = contador + 1;
		Leer num;
	FinMientras
	
	Escribir suma / (contador - 1);
	Escribir "La cantidad de numeros ingresados fue de ",contador;
FinAlgoritmo
