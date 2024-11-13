/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoc.josueguerrero2020;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JosueGuerrero2020 {

    public static void main(String[] args) {
        //1. daros
        int[] puntuacionesDiarias = new int[7];
        double promedioPuntuaciones = 0;
        double puntuacionAlta = 0;
        Scanner sc = new Scanner(System.in);
        int dato = 0;
        int i = 0;
        do {
            System.out.println("Ingresar los valores de las puntuaciones");
            dato = sc.nextInt();
            if (dato > 0) {
                puntuacionesDiarias[i] = dato;
                i++;
            } else {
                System.out.println("El Valor es negativo");
            }

        } while (i < 7);
        int opcion;
        do {
            System.out.println("Acciones a realizar");
            System.out.println("1. Calcular el total de puntuaciones de la semana");
            System.out.println("2. Calcular el promedio de puntuaciones y mostrar los dias por encima y por debajo del promedio");
            System.out.println("3. Mostrar el dia con la puntuacion mas alta y el dia con la mas Baja");
            System.out.println("4. Calcular el total de puntuaciones acumuladas durante los primeros cuatro dias u los ultimos cuatro dias ");
            System.out.println("5. Salir");
            
            switch (opcion);
                    case 1://1. . Calcular el total de puntuaciones de la semana
                        double suma=0;
                        for(double nota:puntuacionesDiarias){suma+=nota}
                        System.out.println("El Total de puntuaciones de la semana es:"+nota);
                        break;
                    case 2://2. Calcular el promedio de puntuaciones y mostrar los dias por encima y por debajo del promedio"
                        if()
        }while(opcion !=4);
        
    }
}

//ingreso de puntuaciones
        
        
        /*if(puntuacionesDiarias<0) {System.out.println("Valor incorrecto ingrese un valor positivo");
            
        } else {for (int i=0; i<puntuacionesDiarias.length;i++){
            System.out.println("Ingrese la puntualcion de cada dia"+puntuacionesDiarias);}
        }
        
    }
 }
*/