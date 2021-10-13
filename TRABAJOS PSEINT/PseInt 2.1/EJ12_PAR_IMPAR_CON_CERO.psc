Algoritmo EJ5_PAR_IMPAR
	//Realizar un programa que pida un numero y determine si ese numero es par o impar.
	//Mostrar en pantalla un mensaje que indique si el numero es par o impar. (para que un
	//número sea par, se debe dividir entre dos y su resto debe ser igual a 0).
	///Nota: investigar la función mod de Pseint.
	Definir  num Como Entero
    Escribir  "escriba un numero"
    leer num
	
	si num = 0 Entonces
		Escribir "El numero no es par ni impar"
	SiNo 
		si num MOD 2 = 0 Entonces
			Escribir "Tu numerito es par"
		SiNo
			Escribir "Tu numerito es impar"
		FinSi
	FinSi

	
FinAlgoritmo
