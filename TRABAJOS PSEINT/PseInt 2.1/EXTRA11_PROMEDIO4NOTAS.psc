Algoritmo EXTRA11_PROMEDIO4NOTAS
	Definir n1,n2,n3,n4,promedio Como real;
	Definir nELIM Como Entero;
	Escribir "Escriba sus 4 notas";
	leer n1,n2,n3,n4;

	si (n1<n2) y (n1<n3) y (n1<n4)
		nELIM = n1;
		SiNo
		si (n2<n1) y (n2<n3) y (n2<n4)
			nELIM = n2;
			SiNo
			si	(n3<n1) y (n3<n2) y (n3<n4)
			nELIM = n3;
				SiNo
				nELIM = n4;
				FinSi
		FinSi
	FinSi
	
	Promedio = (n1 + n2 + n3 + n4 - nELIM) / 3;
	Escribir "El promedio de notas es de ",Promedio " y la nota eliminada fue ",nELIM;
FinAlgoritmo
