Algoritmo EXTRA7_NUM3DIGITOS
	//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.
	Definir num Como Entero;
	Escribir "Ingrese un numero de 3 digitos";
	leer num;
	
	si num < 0 Entonces
		Escribir "El numero que ingreso es negativo y fue convertido a positivo";
		num = num * (-1);
		SiNo
			si num < 100 o num > 1000
				Repetir
					Escribir "El numero ingresado no posee 3 digitos";
					Leer num;
				Mientras Que num < 100 o num > 999
			FinSi	
		FinSi
	Escribir "Su numero ingresado es de 3 digitos: ",num;

FinAlgoritmo
