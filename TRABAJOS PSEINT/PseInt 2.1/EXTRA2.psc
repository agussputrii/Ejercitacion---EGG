Algoritmo EXTRA2
	//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
	//10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
	//mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
	//debe cobrar al cliente e imprimirlo por pantalla. 
	definir mes Como Caracter
	mes=""
	definir compra,compradesc como real
	
	Escribir "Ingrese el precio de su producto:"
	leer compra
	
	Escribir "Ingrese el mes en el que se realiza la compra:"
	leer mes
	mes=Minusculas(mes)
	
	compradesc = compra*0.90
	
	segun mes Hacer
		"enero":
			Imprimir "El monto total de su producto es $",compra "."
		"febrero":
			Imprimir "El monto total de su producto es $",compra "."
		"marzo":
			Imprimir "El monto total de su producto es $",compra "."
		"abril":
			Imprimir "El monto total de su producto es $",compra "."
		"mayo":
			Imprimir "El monto total de su producto es $",compra "."
		"junio":
			Imprimir "El monto total de su producto es $",compra "."
		"julio":
			Imprimir "El monto total de su producto es $",compra "."
		"agosto":
			Imprimir "El monto total de su producto es $",compra "."
		"diciembre":
			Imprimir "El monto total de su producto es $",compra "."
		"septiembre":
			Imprimir "Aplicando un 10% de descuento, el monto total de su producto es $",compradesc "."
		"octubre":
			Imprimir "Aplicando un 10% de descuento, el monto total de su producto es $",compradesc "."
		"noviembre":
			Imprimir "Aplicando un 10% de descuento, el monto total de su producto es $",compradesc "."

	FinSegun
	
FinAlgoritmo
