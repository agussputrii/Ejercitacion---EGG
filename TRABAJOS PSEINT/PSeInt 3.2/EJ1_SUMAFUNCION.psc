Algoritmo EJ1_SUMAFUNCION
	//realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
	//pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
	//calcular� la suma y lo devolver� para imprimirlo en el algoritmo.
	
	Definir num1,num2,r Como real;
	Escribir "Ingrese la dos numeros para sumar";
	leer num1,num2;
	
	suma_funcion(num1,num2,r);
	
FinAlgoritmo

Funcion suma_funcion ( num1, num2, r Por Referencia)
	r = num1 + num2;
	Escribir "El resultado es ",r;
	
Fin Funcion