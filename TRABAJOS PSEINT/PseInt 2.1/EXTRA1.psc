Algoritmo EXTRA1
	Definir nota1,nota2,nota3,res Como Real
	definir a,b,c Como Logico
	
	Escribir "Tirame 3 notas que te sacaste"
	Leer nota1,nota2,nota3
	
	res= (nota1 + nota2 + nota3) / 3
	
	si res>=70 Entonces
		Escribir "APROBADO, SU PROMEDIO ES ",res "%."
	SiNo
		Escribir "DESAPROBADO, SU PROMEDIO ES ",res "%."
	FinSi

FinAlgoritmo