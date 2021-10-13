Algoritmo sin_titulo
	
	Imprimir "Tirate unos metros para unas conversiones locas."
	
	Definir metrosconv Como Entero
	Definir inconv,mmconv,cmconv Como Real
	
	Leer metrosconv
	cmconv<-metrosconv*100
	mmconv<-metrosconv*1000
	inconv<-cmconv*2.54
	Imprimir "En centis seria " cmconv "cm, en milis seria " mmconv "mm, y en pulgadas seria ",inconv "."
FinAlgoritmo
