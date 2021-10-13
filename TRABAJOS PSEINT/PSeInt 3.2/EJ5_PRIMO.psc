Algoritmo EJ5_PRIMO
	Definir i,n1,contador Como Entero;
	
	i = 1;
	contador = 0;
	
	Escribir "Ingrese un numero para verificar si es primo";
	leer n1;
	
	primo(i,n1,contador);
	
FinAlgoritmo

Funcion primo(i,n1,contador)
	
	Mientras  i <= n1 Hacer
		si n1 mod i = 0 Entonces
			contador = contador + 1;
		FinSi
		i = i + 1;
	FinMientras
	
	si contador = 2 Entonces
		Escribir "El número ",n1," es primo";
	SiNo
		Escribir "El número ",n1," no es primo";
	FinSi
FinFuncion
	