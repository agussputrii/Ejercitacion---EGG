
Algoritmo g4ex_5
		
		Definir v,pal como caracter;
		Definir i,pos,izq,der Como Entero;
		Dimension v(20);
		Escribir "Ingrese una frase";
		Leer pal;
		para i=0 hasta 19 Hacer
			v(i)=" ";
		FinPara
		para i=0 hasta 19 Hacer
			v(i)=Subcadena(pal,i,i);
		FinPara
		
		Escribir "¿Qué caracter desea ingresar?";
		Leer pal;
		Escribir "¿En qué posición?";
		Leer pos;
		Si (v(pos)==" ") Entonces
			v(pos)=pal;
			mos(v);
		SiNo
			izq = buscar(v,pos,-1);
			der = buscar(v,pos,1);
			Si (der < izq) Entonces
				insertar(v,pal,pos,der,1);
				mos(v);
			SiNo
				insertar(v,pal,pos,-izq,-1);
				mos(v);
			FinSi
		FinSi
FinAlgoritmo

Funcion n = buscar(v,pos,walk)
	Definir n,i Como Entero;
	i = pos;
	n = 0;
	Repetir
		i = i + walk;
		n = n + 1;
	Mientras Que ((v(i)<>" ") y ((i>0)y(i<19)))
FinFuncion

SubAlgoritmo insertar(v,pal,pos,dir,walk)
	Definir aux Como caracter;
	Definir i Como Entero;
	i = pos+dir;
	Repetir
		v(i)=v(i-walk);
		i = i - walk;
	Mientras Que (i<>pos)
	v(i)=pal;
FinSubAlgoritmo

SubAlgoritmo mos(v)
	Definir i Como Entero;
	para i=0 hasta 19 Hacer
		Escribir Sin Saltar v(i);
	FinPara
FinSubAlgoritmo

