
	Algoritmo extra_7
		
		Escribir"[Estadística de ventas]"
		Definir matriz Como Entero
		Dimension matriz(7,6)
		
		llenar_valores(matriz)
		mostrar_valores(matriz)
		mas_vendido(matriz)
		
FinAlgoritmo

SubProceso llenar_valores(matriz)
    Definir i,j,total_producto,total_semana,max Como Entero
    Dimension total_producto(5), total_semana(5), max(5)
    //Inicializar vectores
    Para i = 0 Hasta 4 Hacer
        total_producto(i) = 0
        total_semana(i) = 0
        max(i) = 0
    FinPara
    
    Para i = 0 Hasta 6 Hacer
        Si i <= 4 Entonces
            Escribir "Ingrese el total de ventas del Producto ",i+1 
            Para j = 0 Hasta 5 Hacer
                Si j <> 5 Entonces
                    leer matriz(i,j)
                    // Guardar el total de ventas de cada producto a lo largo de la semana
                    total_producto(i) = total_producto(i) + matriz(i,j)
                    // Guardar el total de ventas de cada día
                    total_semana(j) = total_semana(j) + matriz(i,j)
                    // Guardar el producto más vendido del día
                    max(j) = matriz(i,j) //inicializamos el max primero para luego compararlo.
                    Si matriz(i,j) > max(j) Entonces
                        max(j) = matriz(i,j)
                    FinSi
                SiNo
                    // Asignar el total de ventas del producto en la matriz
                    matriz(i,j) = total_producto(i)
                FinSi
            FinPara
        FinSi
        Si i = 5 Entonces
            //Asignar el total de ventas de la semana en la matriz
            Para j = 0 Hasta 4 Hacer
                matriz(i,j) = total_semana(j)
            FinPara
            matriz(i,5) = 0
        FinSi
        Si i = 6 Entonces
            //Asignar el valor máximo del día en la matriz
            Para j = 0 Hasta 4 Hacer
                matriz(i,j) = max(j)
            FinPara
            matriz(i,5) = 0
        FinSi
    FinPara
FinSubProceso

SubProceso mostrar_valores(matriz)
    Definir i,j Como Entero
    Para i = 0 Hasta 6 Hacer
        Para j = 0 Hasta 5 Hacer
            Escribir Sin Saltar matriz(i,j) "  "
        FinPara
        Escribir ""
    FinPara
FinSubProceso

SubProceso mas_vendido(matriz)
    Definir i,j,max,dia,producto Como Entero
    Definir dia2 Como Caracter
    max = 0
    Para i = 0 Hasta 4 Hacer
        Para j = 0 Hasta 4 Hacer
            Si matriz(i,j) > max Entonces
                max = matriz(i,j)
                dia = i
                producto = j+1
            FinSi
        FinPara
    FinPara
    Segun dia Hacer
        0:
            dia2 = "lunes"
        1: 
            dia2 = "martes"
        2:
            dia2 = "miércoles"
        3: 
            dia2 = "jueves"
        4: 
            dia2 = "viernes"
    FinSegun
    Escribir "El producto más vendido de la semana es el producto ",producto
    Escribir "Se vendió el día ", dia2 " una cantidad de ",max " unidades."
FinSubProceso