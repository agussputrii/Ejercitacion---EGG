Algoritmo EXTRA8_LLANTAS
//Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
//entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000. Obtene
//la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que
//compra, y el monto total que tiene que pagar por el total de la compra.
	definir cant, llantas,total Como Real;
	Escribir "Digite el numero de llantas que quiere comprar:";
	Leer cant;
	
	Si cant < 5 Entonces
		llantas = 3000;
	SiNo
		si cant >= 5 y cant < 10 Entonces
			llantas = 2500;
		SiNo
			llantas = 2000;
		FinSi
	FinSi
	total = llantas * cant;
	
	Escribir "El total a pagar es de $",total, "Y el costo de la unidad es de $",llantas;
FinAlgoritmo
