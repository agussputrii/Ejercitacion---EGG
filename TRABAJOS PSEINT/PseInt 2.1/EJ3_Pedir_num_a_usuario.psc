Algoritmo EJ3_Pedir_num_a_usuario
	//Realizar un programa que pida un número al usuario. Si el número es mayor que 100 se
	//deberá de imprimir en pantalla "Es Mayor", y en caso contrario se deberá imprimir "Es Menor".
	Definir numuser Como Entero
	Escribir "Ahora tirame un número"
	leer numuser
	
	Si numuser >= 100 Entonces
		Escribir "Es mayor"
	SiNo
		Escribir "Es menor"
	FinSi
FinAlgoritmo
