Algoritmo REEMPLAZO
	//Realice un subprograma que reciba una secuencia de caracteres y retorne la
	//codificación correspondiente. Utilice la estructura "según" para la transformación.
	//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
	//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
	
	Definir ingreso_char,new_char,cambio_char Como Caracter;
	Definir long_char,i Como Entero;
	new_char = "";
	
	Escribir "Ingrese los caracteres que seran intercambiados";
	Leer ingreso_char;
	
	ingreso_char = Minusculas(ingreso_char);
	long_char = Longitud(ingreso_char);
	
	Para i = 0 hasta long_char
		set_vocal(SubCadena(ingreso_char,i,i),cambio_char);
		new_char = new_char + cambio_char;
	FinPara
	
	Escribir new_char;
FinAlgoritmo

SubProceso set_vocal(a,cambio_char Por Referencia)
	Segun a Hacer
		"a": cambio_char = "@";
		"e": cambio_char = "#";
		"i": cambio_char = "$";
		"o": cambio_char = "%";
		"u": cambio_char = "*";
		De Otro Modo:
			cambio_char = a;
	Fin Segun
	
FinSubProceso

