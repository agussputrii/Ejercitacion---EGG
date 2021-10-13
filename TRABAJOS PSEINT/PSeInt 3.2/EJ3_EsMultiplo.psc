Algoritmo EJ3_EsMultiplo
	//Crea una función EsMultiplo que reciba los dos números pasados por el usuario,
	//validando que el primer numero múltiplo del segundo y devuelva verdadero si el
	//primer numero es múltiplo del segundo, sino es múltiplo que devuelva falso.
	Definir n1,n2,res Como Entero;
	escribir "Ingresa el primer numero";
	leer n1;
	escribir "Ingresa el segundo numero";
	leer n2;
	si Esmultiplo( n1,n2) Entonces
		Escribir ,n1 " es multiplo de ",n2;
	SiNo
		Escribir ,n1 "NO es multiplo de ",n2;
	FinSi
	
FinAlgoritmo

Funcion valido=Esmultiplo( n1,n2)
	Definir valido Como Logico;
	Si n1 MOD n2 = 0 Entonces
		valido = Verdadero;
	SiNo
		valido = Falso;
	Fin Si
	
Fin Funcion
