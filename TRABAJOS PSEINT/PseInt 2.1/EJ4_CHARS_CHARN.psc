Algoritmo EJ4_CHARS_CHARN
	//Realiza un programa que s�lo permita introducir los caracteres 'S' y 'N'. Si el usuario
	//ingresa alguno de esos dos caracteres se deber� de imprimir un mensaje por pantalla
	//que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO".
	Definir l1,l2,letra Como Caracter
    Escribir "Escribir la letra S o N para ver su resultado"
    leer letra

	
    Si Mayusculas(letra) = 'S' o Mayusculas(letra) = 'N' Entonces
        Escribir "Es correcto"
    SiNo
        Escribir "Es incorrecto"
    Fin Si
FinAlgoritmo
