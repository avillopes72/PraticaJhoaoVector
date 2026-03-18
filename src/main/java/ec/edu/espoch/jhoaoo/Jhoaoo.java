package ec.edu.espoch.jhoaoo;

import java.util.Scanner;

public class Jhoaoo {

    public static void main(String[] args) {
        // hola mundo
        Scanner leer = new Scanner(System.in);
        int semana[]=new int[7];
        int dias=0;
        int ventatotal=0;
        int ventaprom=0;
        int ventamayor=0;
        int indic[]=new int[7];
        int n=0;
        int ventassuper=0;
        do{
            System.out.println(" Ingrese venta dia "+(dias+1)+" :");
            semana[dias]=leer.nextInt();
            if(semana[dias]>ventamayor){
                ventamayor=semana[dias];
                indic[dias]=dias;
                n=indic[dias];
            }
            
            dias++;
            
        }while(dias<semana.length);
        
        for(int i=0;i<semana.length;i++){
            System.out.println(" venta dia "+(i+1)+" = "+semana[i]);
            ventatotal=ventatotal+semana[i];             
            
        }
        System.out.println("venta total= "+ventatotal);
        ventaprom=ventatotal/dias;
        System.out.println(" promedio de total= "+ventaprom);
        System.out.println(" ventar mayor = "+ventamayor+" posicion "+(n+1));
        for(int j=0;j<semana.length;j++){
            if(semana[j]>ventaprom){
                ventassuper++;
            }
        }
        System.out.println("dias de venta superior es "+ventassuper);
       
        
    }
}
