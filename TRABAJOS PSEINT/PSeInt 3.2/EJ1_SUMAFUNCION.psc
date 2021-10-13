Algoritmo EJ1_SUMAFUNCION
	//realizar una función que calcule la suma de dos números. En el algoritmo principal le
	//pediremos al usuario los dos números para pasárselos a la función. Después la función
	//calculará la suma y lo devolverá para imprimirlo en el algoritmo.
	
	Definir num1,num2,r Como real;
	Escribir "Ingrese la dos numeros para sumar";
	leer num1,num2;
	
	suma_funcion(num1,num2,r);
	
FinAlgoritmo

Funcion suma_funcion ( num1, num2, r Por Referencia)
	r = num1 + num2;
	Escribir "El resultado es ",r;
	
Fin Funcion