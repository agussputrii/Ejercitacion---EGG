Algoritmo EJ2_SUMA2VAL
	//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
	//solicite números al usuario hasta que la suma de los números introducidos supere el
	//límite inicial.
	definir num,numcache,numlim,res Como Entero;
	
	escribir "Ingresa un numero";
	
	Leer numlim;
	
	Mientras numlim < 0 Hacer
		Escribir "Ingresa un valor positivo";
		leer numlim;
	FinMientras
	
	Escribir "Ahora ingresa un numero menor al anterior, y otro que sumados supere al anterior";
	leer num;
	leer numcache;
	res = num + numcache;
	
	Mientras res <= numlim Hacer
		escribir "Error, vuelva a ingresar dos numeros";
		leer num;
		leer numcache;
		res = num + numcache;
		res = num + numbcache;
		si res < numlim Entonces
		FinSi
	Fin Mientras
	
	Escribir "Bien ahi, la suma de los anteriores numeros (",res ") es mayor a ",numlim;
FinAlgoritmo
