Algoritmo EXTRA4_AlquilerDeAutos
	//La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema
	//regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
	//cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
	//40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
	//de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y
	//el total a pagar por el cliente.
	Definir tiempohs,tiempomin,preciolt,cantlt,preciomindeuso,total Como Real;
	tiempomin = 60;
	preciolt = 40;
	preciomindeuso = 5.2;
	
	Escribir	"Ingrese cuantos litros de nafta gasto";
	leer cantlt;
	
	Escribir "Ingrese la cantidad de horas que estuvo manejando";
	Leer tiempohs;
	
	si tiempohs>=2 Entonces
		tiempohs = tiempohs/tiempomin;
		total=preciomindeuso*tiempomin;
		Escribir "El precio total de haber conducido por mas de 2hs es de $",total ".";
	SiNo
		
		total=(cantlt*preciolt)/tiempohs;
		Escribir "El precio por haber manejado menos de 2hs es de $",total ".";
	FinSi
FinAlgoritmo
