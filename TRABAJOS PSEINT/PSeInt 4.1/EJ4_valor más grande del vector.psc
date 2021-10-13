Algoritmo sin_titulo
	//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
	//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el
	//valor más grande del vector.
	
	Definir x Como Entero
	Escribir "Ingresa el valor de la dimension"
    leer x
	
FinAlgoritmo

Funcion nummayor=calculo(x Por Referencia)
	Definir i,n,nummayor,valores,aux Como Entero
	aux=0
	i=0
	
	Dimension valores(x)
	para i<- 0 hasta x-1 Hacer
        Escribir (i+1)," - " Sin Saltar
        leer valores(i)
    FinPara
	
	Para i=0 hasta x-1 Hacer
        Si aux < valores(i)
            aux = valores(i)
            Escribir valores(i)
        FinSi
	FinPara
	
	Escribir "el numero mas alto es- :"  aux
	
FinFuncion
	