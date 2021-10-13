Algoritmo EXTRA10_FRUTERIA
	//Una fruteria ofrece las manzanas con descuento según la siguiente tabla:
	
	//De 0 a 2 kilos se aplica un 0% de descuento
	//De 2.01 a 5 kilos se aplica un 10% de descuento
	//De 5.01 a 10 kilos se aplica un 15% de descuento
	//De 10.01 en adelante se aplica un 20% de descuento.
	
	definir precio,descuento,total Como Real;
	definir kg Como Entero;
	precio = 100;
	
	Escribir "Ingresa cuantos kg de manzana vas a comprar";
	Leer kg;
	
	total= kg * precio;
	
	si kg >= 0 y kg <= 2
		descuento= total * 1;
		Escribir "No se aplico descuento";
	SiNo
		si kg >= 2.01 y kg <= 5
			descuento= total * 0.90;
			Escribir "Se aplico un 10% de descuento";
		FinSi
		si kg >= 5.01 y kg <= 10
			descuento = total * 0.85;
			Escribir "Se aplico un 15% de descuento";
		SiNo
			si kg >=10.01
				descuento = total * 0.80;
				Escribir "Se aplico un 15% de descuento";
			FinSi
		FinSi
	FinSi
	Escribir "El precio total es de $",total " y con su descuento queda en $",descuento;
FinAlgoritmo
