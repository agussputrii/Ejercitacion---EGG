Algoritmo sin_titulo
	Definir a,b,c,d,i,vectornotas Como Entero
	Dimension vectornotas(i)
	Para i=0 hasta 99 Hacer
		vectornotas(i)=Aleatorio(0,20)
	FinPara
	a=0
	b=0
	c=0
	d=0
	para i=0 hasta 99 Hacer
		si vectornotas(i) >= 0 y vectornotas(i) <= 5
			a=a+1
		FinSi
		si vectornotas(i) >= 6 y vectornotas(i) <= 10
			b=b+1
		FinSi
		si vectornotas(i) >= 11 y vectornotas(i) <= 15
			c=c+1
		FinSi
		si vectornotas(i) >= 16 y vectornotas(i) <= 20
			d=d+1
		FinSi
	FinPara
	Escribir "Estudiantes DEFICIENTES: [",a "]"
	Escribir "Estudiantes REGULARES: [",b "]"
	Escribir "Estudiantes BUENOS: [",c "]"
	Escribir "Estudiantes EXCELENTES: [",d "]"

FinAlgoritmo
