Algoritmo sin_titulo
	Definir lab Como caracter
	Dimension lab(10,10)
	llenar(lab)
	Escribir lab(10,10)
FinAlgoritmo
//Llenado de laberinto

SubAlgoritmo llenar(lab)
	Definir i,j Como Entero;
	Para i = 0 hasta 9 Hacer
		para j = 0 hasta 9 Hacer
			lab(i,j)=" ";
		FinPara
	FinPara
	lab(0,9)="x";
	lab(1,1)="x";
	lab(1,2)="x";
	lab(3,4)="x";
	lab(3,5)="x";
	lab(3,8)="x";
	lab(4,8)="x";
	lab(5,0)="x";
	lab(5,1)="x";
	lab(5,2)="x";
	lab(5,6)="x";
	lab(6,6)="x";
	lab(7,6)="x";
	lab(8,8)="x";
	lab(9,0)="x";
	lab(9,8)="x";
FinSubAlgoritmo