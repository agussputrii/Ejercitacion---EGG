Algoritmo sin_titulo
//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta
//entre las letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a
//través del Código Ascii
	Definir entrada Como Caracter;
	Escribir "Ingrese una letra";
	leer entrada;
	entrada = Minusculas(entrada);
	dentro_de(entrada);
FinAlgoritmo

SubProceso dentro_de(entrada)
	
	Si entrada >= "m" y entrada <= "t" Entonces
			Escribir "La letra ingresada se encuentra entre M y T";
		SiNo
			Escribir "La letra ingresada NO se encuentra entre M y T";
	Fin Si

	

	
	FinSubProceso
	