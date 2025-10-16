
import java.util.Scanner;

public class Ejercicios{
    private Scanner leer=new Scanner(System.in);
    public void ejercicio1(){
         int suma=0;
        for(int i=0;i<10;i++){
                System.out.print("introduzca " + (i+1) + " numero: ");
                suma=suma + leer.nextInt();
            
            
        }
        System.out.println("la suma total es: " + suma);
    }
    
}