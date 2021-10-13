//Crear una funci�n llamada ?Login?, que recibe un nombre de usuario y una contrase�a 
//y que devuelve Verdadero si el nombre de usuario es ?usuario1? y si la contrase�a es 
//	Adem�s  la  funci�n  calculara  el  n�mero  de  intentos  que  se  ha  usado  para 
//loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la funci�n devolver� Falso.



Algoritmo ejercicio3
	
	Definir str_user,str_password Como Caracter
	Definir var_login Como Logico
	Definir var_trys Como Entero
	
	var_trys = 3
	var_login = Falso;
	
	
	Mientras var_login = Falso
		
		Escribir "[ * ] Quedan ", var_trys, " intentos"
		Escribir "[ * ] Ingrese un nombre de usuario:"; Leer str_user
		Escribir "[ * ] Ingrese una contrase�a:"; Leer str_password	
		
		var_login = CheckUser( str_user, str_password, var_trys );
		
		Si  var_login = Verdadero 
			Escribir "[ Login Correcto ]";
			var_login = Verdadero
			
		SiNo // Se acabaron los intentos
			Escribir "[ ! ] ERROR: Usuario y contrase�a incorrectos"
			Si var_trys = 0
				Escribir "[ ! ] Se acabaron los intentos"
				var_login = Verdadero
			FinSi
			
		FinSi
	FinMientras
	
FinAlgoritmo


//Funcion para verificar el usuario y pw

Funcion login <- CheckUser( user, pw, trys Por Referencia )
	
	Definir login Como Logico
	
	Si user = "usuario1" & pw = "asdasd" entonces login = Verdadero
	SiNo trys = trys - 1; login = Falso ; FinSi
	
FinFuncion