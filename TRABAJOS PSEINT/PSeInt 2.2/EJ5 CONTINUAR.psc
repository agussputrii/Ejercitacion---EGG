Algoritmo EJ5_
	//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
	//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
	//todos ellos.
	
	//pregunto afuera del bucle por la variable num
	//para poder inicializar el minimo y el maximo
	//tbm lo igualo a la suma pq hay que hacer el promedio
	//agregando los datos fuera del bucle
	Definir num,minimo,maximo,suma,contador,promedio como Real;
	
	Escribir "ingrese un numero";
	Leer num;
	
	suma = num;
	contador = 0;
	
	minimo = num;
	maximo = num;
	
	Hacer 
		Escribir "ingrese un numero";
		Leer num;
		si num > maximo Entonces
			maximo = num;
		FinSi
		si num <  minimo y num <> 0 Entonces
			minimo=num;
		FinSi
		
		suma = suma + num;
		contador = contador + 1;
		
	Mientras que num<>0
	
	promedio=suma/contador;
	
	Escribir "El numero minimo es ",minimo;
	Escribir "El numero maximo es ",maximo;
	Escribir "El promedio es ",promedio;
	
FinAlgoritmo
