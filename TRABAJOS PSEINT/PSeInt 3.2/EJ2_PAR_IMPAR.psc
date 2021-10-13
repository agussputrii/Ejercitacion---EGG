//Realizar una función que valide si un numero es impar o no. Si es impar la función debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe
//tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
Algoritmo EJ2_PAR_IMPAR
		Definir var_1 Como Real;
		Escribir "ingrese un numero";
		Leer var_1;
		par_impar(var_1);
FinAlgoritmo


Funcion par_impar(var_1 Por Referencia)
	Si var_1 MOD 2 = 0 Entonces
		Escribir "Es multiplo";
	SiNo
		Escribir "No es multiplo";
	Fin Si
FinFuncion

