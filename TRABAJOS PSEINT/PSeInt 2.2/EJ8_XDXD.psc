Algoritmo EJ8_XDXD
	
	Definir nota1,nota2,nota3,n1,n2,n3,cantidad,i,tn,prodes,cdes,c1,pron2,me,cn3 Como Real;
    Escribir "Ingrese la cantidad de alumnos";
    Leer cantidad;
    me = 0;
    c1 = 0;
    pron2 = 0;
    cn3 = 0;
    prodes = 0;
    cdes = 0;
    Para i = 1 Hasta cantidad Hacer
        Escribir "Ingrese su primera nota del " i "° alumno";
        Leer nota1;
        Escribir "Ingrese su segunda nota del " i "° alumno";
        Leer nota2;
        Escribir "Ingrese su tercera nota del " i "° alumno";
        Leer nota3;
		
        n1 = (nota1/100)  *  35;
        n2 = (nota2/100)  *  25;
        n3 = (nota3/100)  *  40;
        tn = n1+n2+n3;
        Escribir "el promedio del " i "° alumno es: " tn;
        Escribir "";
        si tn < 6.5 Entonces //promedio final de desaprobados
            cdes = cdes + 1;
            prodes = (prodes + tn)/cdes;
        FinSi
        si nota1 > 7.5 Entonces //porcentaje de integrador mayor a 7.5
            c1 = c1 + 1;
            pron2 = (c1/i)*100;
        FinSi
        si me < nota2 Entonces //obtenemos la mayor nota en exposiciones
            me = nota2;
        FinSi
        si nota3 > 4 y nota3 < 7.5 Entonces //Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.
            cn3 = (cn3 + 1);
        FinSi
    FinPara
	
    Escribir "El promedio de desaprobados es: ", prodes;
    Escribir "Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 es: ", pron2, "%";
    Escribir "La mayor nota obtenida en las exposiciones es: ", me;
    Escribir "Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 son: ", cn3;
	
FinAlgoritmo
