Algoritmo EJ4_CONTRASENA
	//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
	//una clave. S�lo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deber�
	//mostrar un mensaje indic�ndonos que hemos agotado esos 3 intentos. Si acertamos la
	//clave se deber� mostrar un mensaje que indique que se ha ingresado al sistema correctamente
	
	Definir password,correctpass Como Caracter;
	Definir  intentos Como Entero;
	intentos = 3;
	correctpass = "eureka";
	
	Escribir	"Ingrese la contrase�a, 3 intentos restantes";
	leer password;
	intentos = intentos - 1;
	
	Hacer
		si password <> correctpass
			Escribir "Error, al ingresar la contrase�a, quedan ",intentos " intentos.";
			Leer password;
			intentos = intentos - 1;
			si intentos < 1  Entonces
				Escribir "TE QUEDASTE SIN INTENTOS, TE FUISTE BANEADO";
				
			FinSi
		FinSi
	Mientras Que password <> correctpass y  intentos > 0
	
	Escribir "Entraste capo";
	
FinAlgoritmo
