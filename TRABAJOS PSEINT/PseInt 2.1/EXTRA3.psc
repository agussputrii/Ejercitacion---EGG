Algoritmo EXTRA3
	//Solicitar al usuario que ingrese dos n�meros enteros y determinar si ambos son pares o
	//impares. 
	///Mostrar en pantalla un mensaje que indique "Ambos n�meros son pares" siempre y cuando cumplan con la condici�n. 
	///En caso contrario se deber� imprimir elsiguiente mensaje "Los n�meros no son pares, o uno de ellos no es par".
	///Nota: investigar la funci�n mod de Pseint. 
	Definir  num1,num2 Como Entero
    Escribir  "escriba el primer numero"
    leer num1
	Escribir  "escriba el primer numero"
	leer num2
	
    Si num1 MOD 2 = 0 y num2 MOD 2 = 0 Entonces
        Escribir "Tu numeritos son par"
    SiNo
        Escribir "Los n�meros no son pares, o uno de ellos no es par"
    Fin Si
FinAlgoritmo
