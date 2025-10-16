//clase en la que vamos a realizar los ejercicios

import java.util.Scanner; //necesitamos incluir la clase Scanner para poder leer datos del teclado

public class Ejercicios{
    private Scanner leer=new Scanner(System.in); //definimos nuestra variable Scanner que usaremos en toda la clase
    
    public void ejercicio1(){
         int suma=0;
        for(int i=0;i<10;i++){//leemos los 10 numeros con el for
                System.out.print("introduzca " + (i+1) + " numero: ");
                suma=suma + leer.nextInt();//hacemos que la suma sea igual a la suma + el numero ingresado
        }
        System.out.println("la suma total es: " + suma);
    }
    
    public void ejercicio2(){
        int suma=0;
        int contadorDe20s=0;
            System.out.print("introduzca un numero: ");
        int numero = leer.nextInt();
        while(numero!=0){
            suma=suma + numero;
            if (numero==20){contadorDe20s ++;}//si el numero es igual a 20 icrementamos en 1 el contador de 20s
            System.out.print("introduzca un numero: ");
            numero = leer.nextInt();//volvemos a leer para que se repita el ciclo
         
        };
        
        System.out.println("la suma total es: " + suma);
        System.out.println("El numero 20 se ingreso un total de : " + contadorDe20s + " veces");
        
        if(suma>100){
            System.out.println("SUPERA LOS $100");
        }
        
    }
    
}