Algoritmo eliminarvocaless
Definir str_msg Como Caracter;

Escribir "Ingrese una palabra o frase"; Leer str_msg;
EliminarVocales( str_msg );

FinAlgoritmo


SubProceso EliminarVocales( str_msg )
	
    Definir var_a,var_e,var_i,var_o,var_u,i,var_long Como Entero;
    
    Definir str_new, var_char Como Caracter;
	
    var_long = Longitud(str_msg);
    
    var_a = 0; var_e = 0; var_i = 0; var_o = 0; var_u = 0; str_new = "";
    
    Para i = 0 Hasta var_long
        
        var_char = Subcadena(str_msg,i,i);
        
        Segun var_char //Si el caracter se repitió, lo reemplazamos por uno vacío
            Opcion 'a','A': 
                Si var_a = 0 Entonces var_a = 1;
                Sino var_char = "";FinSi
            Opcion 'e','E':
                Si var_e = 0 Entonces var_e = 1;
                Sino var_char = "";FinSi                
            Opcion 'i','I':
                Si var_i = 0 Entonces var_i = 1;
                Sino var_char = "";FinSi                
            Opcion 'o','O':
                Si var_o = 0 Entonces var_o = 1;
                Sino var_char = "";FinSi                
            Opcion 'u','U':
                Si var_u = 0 Entonces var_u = 1;
                Sino var_char = "";FinSi            
        FinSegun
        
        str_new = str_new + var_char;
        
    FinPara
    
    Si var_a = 0 & var_e = 0 & var_i = 0 & var_o = 0 & var_u = 0
        Escribir "No se eliminó ninguna vocal repetida";
    SiNo
        Escribir "Se eliminaron vocales repetidas, la nueva cadena es:";
        Escribir str_new;
    FinSi
	
FinSubProceso