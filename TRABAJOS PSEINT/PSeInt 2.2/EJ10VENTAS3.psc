Algoritmo sin_titulo
	Definir vendedores,ventasrealizadas,preciodeventa,preciototaldeventa,sueldo,i,ii Como Entero
    Definir sueldototal,comisiones Como Real
    i=0
    ii=0
    preciototaldeventa=0
    sueldototal=0
    Escribir "ingrese la cantidad de vendedores que tiene"
    leer vendedores
    para i=0 Hasta vendedores-1 Hacer
        Escribir "ingrese su sueldo"
        leer sueldo
        Escribir "ingrese las ventas realizadas"
        leer ventasrealizadas
        para ii=0 hasta ventasrealizadas-1 Hacer
            Escribir " Ingrese el precio de todas las ventas que realizo"
            leer preciodeventa
            preciototaldeventa=preciototaldeventa+preciodeventa
        FinPara
        comisiones=(preciototaldeventa*10)/100
        sueldototal=sueldo+comisiones
        Escribir "tendra que pagar " comisiones " $ en comisiones"
        Escribir "tendra que pagar un sueldo total de " sueldototal " $"
    FinPara
FinAlgoritmo
