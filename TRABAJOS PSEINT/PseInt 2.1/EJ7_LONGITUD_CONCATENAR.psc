Algoritmo EJ7_LONGITUD_CONCATENAR
	//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
	//caracteres de largo, el programa le concatenara un signo de exclamaci�n al final, y si no
	//es de 4 caracteres el programa le concatenara un signo de interrogaci�n al final. El
	//programa mostrar� despu�s la frase final. 
	///Nota: investigar la funci�n Longitud() y Concatenar() de Pseint.
	
	Definir cadena1,cadenav,cadenaf Como Caracter
	
	Escribir "Escribime una frase/palabra que sea de 4 caracteres de largo"
	Escribir "Si lo haces bien te escribo un ! si no te escribo ? "
	Leer cadena1
	
	cadenav = '!'
	cadenaf = '?'
	
	si Longitud(cadena1) = 4 Entonces
		Escribir Concatenar(cadena1,cadenav)
	SiNo
		Escribir Concatenar(cadena1,cadenaf)
	FinSi
FinAlgoritmo
