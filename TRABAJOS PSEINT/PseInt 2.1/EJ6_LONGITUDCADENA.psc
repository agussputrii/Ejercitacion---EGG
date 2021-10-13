Algoritmo EJ6_LONGITUDCADENA
//Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
//usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje
//por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
//"INCORRECTO". Nota: investigar la función Longitud() de Pseint.
	Definir cadena1 Como Caracter
	Escribir "Ingresa una palabra/frase de 6 caracteres:"
	leer cadena1
	
	si Longitud(cadena1) = 6 Entonces
		Escribir "CORRECTO, tu palabra/frase tiene " Longitud(cadena1) "."
	SiNo
		Escribir "INCORRECTO, no se cumple con los caracteres requeridos mi rey"
	FinSi
	
FinAlgoritmo
