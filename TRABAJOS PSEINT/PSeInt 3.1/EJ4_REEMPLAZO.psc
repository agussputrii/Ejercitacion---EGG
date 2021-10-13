Algoritmo we
		
		Definir str_msg Como Caracter;
		Definir var_long, i Como Entero;
		Definir str_new Como Caracter;
		Definir str_caracter Como Caracter;
		
		str_new = "";
		
		Escribir "[ * ] Escriba una palabra"; Leer str_msg;
		str_msg = Minusculas( str_msg );
		var_long = Longitud( str_msg );
		
		Para i = 0 Hasta var_long
			
			set_vocal( Subcadena( str_msg, i, i ), str_caracter);
			
			str_new = str_new + str_caracter;
			
		FinPara
		
		
		Escribir "[ ------ INTERCAMBIO DE VOCALES ------ ]";
		Escribir str_new;
		
FinAlgoritmo

SubProceso set_vocal( a, str_caracter Por Referencia )
    Segun a
        Opcion 'a': str_caracter = "@";
        Opcion 'e': str_caracter = "#";
        Opcion 'i': str_caracter = "$";
        Opcion 'o': str_caracter = "%";
        Opcion 'u': str_caracter = "*";
        De Otro Modo: str_caracter = a;
            
    FinSegun
FinSubProceso
