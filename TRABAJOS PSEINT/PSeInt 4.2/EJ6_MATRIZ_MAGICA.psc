Algoritmo sin_titulo
	Definir matrizmagica,n,analizador Como Entero
	Escribir "Ingresa el tamano de la matriz";
	Hacer
		Leer n
	Mientras Que n<=0 y n>=10
	 
	Dimension matrizmagica(n,n)
	Dimension analizador(n*2+2)
	llenarmatriz(matrizmagica,n)
	esmagica(matrizmagica,analizador,n)
FinAlgoritmo

SubProceso llenarmatriz(matrizmagica,n)
		Definir i,j Como Entero
		Para i<-0 Hasta n-1 Con Paso 1 Hacer
			Para j<-0 Hasta n-1 Con Paso 1 Hacer
				Escribir Sin Saltar "Ingrese celda [",i,",",j,"]";
				Leer matrizmagica(i,j);
			FinPara
		FinPara
FinSubProceso
SubProceso esmagica(matrizmagica,analizador,n)
	Definir i,j,k Como Entero
	definir bandera Como Logico
	bandera=Verdadero
	
	Para i=0 Hasta (n*2)+1 Con Paso 1 Hacer
		analizador(i) = 0;
	Fin para
	
	k<-0;
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 hasta n-1 con paso 1 Hacer
			analizador(k)=analizador(k)+matrizmagica(i,j);
			analizador(k+(n))=analizador(k+(n))+matrizmagica(j,i)
		FinPara
		k=k+1;
		analizador(n*2)= analizador(n*2)+matrizmagica(i,i);
		analizador(n*2+1)=analizador(n*2+1)+matrizmagica(i,n-1-i)
	FinPara
	
	i<-0;
	Mientras bandera y i<n*2+1 Hacer
		Si analizador(i)<>analizador(i+1) Entonces
			bandera = Falso
		FinSi
		i<-i+1;	
	Fin mientras
	
	Si bandera Entonces
		Escribir "La matriz es Mágica";
	SiNo
		Escribir "La matriz no es mágica";
	FinSi
	
FinSubProceso

