package miPrincipal;
import java.util.Scanner;
public class AppNaturales{
    public static void menu(){
       
        System.out.println("***********************");
        System.out.println("   NUMEROS NATURALES   ");
        System.out.println("***********************");
        Scanner scaner= new Scanner(System.in);
        System.out.print("Proporciona Número: ");
        int n = scaner.nextInt();
        System.out.println("Versión Iterativa");
        muestraNaturalesIte(n);
        System.out.println("Versión Recursiva");
        muestraNaturalesRec(n);
        
    }
    public static void muestraNaturalesIte(int n){
        System.out.println("");
        for(int i=0;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println("");

    }
    public static void muestraNaturalesRec(int n){
        //System.out.print(n+" "); //Se imprimen en orden descendente
        if (n>0)
           muestraNaturalesRec(n-1);
        System.out.print(n+" "); //Se imprimen en orden ascentente
        //System.out.println();
    }
}