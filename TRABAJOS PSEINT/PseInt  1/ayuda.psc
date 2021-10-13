Proceso Bruxproc
	Imprimir "Elegi el algor que queres:"
	Definir eleccion Como Entero
	leer eleccion
	Segun eleccion Hacer
		opcion 1:
			Imprimir "Vos que podes ver, ¿Como anda el dia de hoy?"
			Definir diahoy como cadena
			leer diahoy
			imprimir "Asi que el dia de hoy esta " diahoy ", ¿eh? Gracias, che."
		opcion 2:
			Definir radio Como Entero
			Imprimir "Tirate un radio para una circunferencia, vite."
			Leer radio
			perimetro<-2*radio*PI
			area<-PI*radio*radio
			Imprimir "El perimetro y area son " perimetro " y " area ", respectivamente."
		opcion 3:
			Imprimir "Ahora necesito 3 precios del carton de leche"
			Definir leche1,leche2,leche3 Como Entero
			definir promedio Como Real
			leer leche1,leche2,leche3
			promedio<-(leche1+leche2+leche3)/3
			Imprimir "El precio promedio es de " promedio " pesos."
		opcion 4:
			Imprimir "Tirate unos metros para unas conversiones locas."
			Definir metrosconv Como Entero
			Definir cmconv,mmconv, inconv Como Real
			Leer metrosconv
			cmconv<-metrosconv*100
			mmconv<-metrosconv*1000
			inconv<-cmconv*2.54
			Imprimir "En centis seria " cmconv ", en milis seria " mmconv ", y en pulgadas seria " inconv "."
		Opcion 5:
			Imprimir "¿Cuantos litros le cargaste al autito?"
			Definir litrosauto Como Entero
			Leer litrosauto
			Imprimir "Y, ¿Cuanto anduviste en km?"
			Definir andarauto Como Entero
			Definir kmporlt Como Real
			Leer andarauto
			kmporlt<-andarauto/litrosauto
			Imprimir "O sea que tiene un gasto de " kmporlt "km/l."
		Opcion 6:
			Imprimir "Ahora pone 2 numeros cualquiera, a ver si te los devuelvo al reves."
			Definir num1, num2, numguarda Como Entero
			Leer num1, num2
			numguarda = num1
			num1 = num2
			num2 = numguarda
			Imprimir num1 "-" num2 " ¿Le di?"
		opcion 7:
			Imprimir "Ahora dame 2 numeros cualquiera (enteros, como siempre), asi les aplico unas opereichons."
			Definir numop1,numop2 como entero
			Leer numop1,numop2
			sumanumop<-numop1+numop2
			restanumop<-numop1-numop2
			multinumop<-numop1*numop2
			divinumop<-numop1/numop2
			Imprimir "A ver. Su suma daria " sumanumop ". Su resta daria " restanumop ". Su multiplicacion daria " multinumop "."
			Imprimir "Por ultimo, su division daria " divinumop "."
		// ACA EMPIEZAN LOS EXTRAS
		Opcion 8:
			Imprimir "Mira, necesito saber 3 cosas: cuantos nenes hay en total, cuantas nenas, y cuantos nenos."
			Definir nenes,nenas,nenos Como Entero
			Leer nenes,nenas,nenos
			porcennenos<-(nenos*100)/nenes
			porcennenas<-(nenas*100)/nenes
			Imprimir "Ajam. Entonces habria un " porcennenos "% de nenos, y un " porcennenas "% de nenas. Piola."
		Opcion 9:
			Imprimir "Pasame base y altura para un rectanguliño."
			Definir base,altura Como Entero
			leer base,altura
			perimetrorectangulo<-(base*2)+(altura*2)
			arearectangulo<-base*altura
			Imprimir "Ajam. Entonces el perimetro es " perimetrorectangulo " y el area es " arearectangulo ". Piola."
		opcion 10:
			Imprimir "Ahora pasame el radio y altura de un cilindro, asi te hago magia."
			Definir radiocilindro,alturacilindro Como Entero
			leer radiocilindro,alturacilindro
			volumencilindro<- PI*radiocilindro*radiocilindro*alturacilindro
			Imprimir "El volumen va a ser de " volumencilindro ". Piola."
		opcion 11:
			Imprimir "Mira, si me tiras un numero de dias, te lo mando a horas, minutos y segundos."
			Definir diascambio Como Entero
			definir horascambio, minutoscambio, segundoscambio Como Entero			
			leer diascambio
			horascambio<- diascambio*24
			minutoscambio<-horascambio*60
			segundoscambio<-minutoscambio*60
			Imprimir diascambio " serían " horascambio " horas, o " minutoscambio " minutos, o " segundoscambio " segundos."
		Opcion 12:
			Imprimir "Tirame el precio del carton de leche a principios de año, y luego a finales de año."
			Definir precioleche1,precioleche2 Como Entero
			Definir porcenleche Como Real
			Leer precioleche1,precioleche2
			porcenleche<-((precioleche2*100)/precioleche1)-100
			Imprimir "Uh, aumento en un " porcenleche "%. Que cagaa."
	fin segun
	
	
	
FinProceso
// MESA 80