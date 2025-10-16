
//actividades del pdf estructuras parte 1


//esta es la clase principal (Main) donde se va a inicializar, es decir, dar uso, a todas las clases, metodos, etc
//que vayamos creando en el proyecto entero.
public class Principal{

    public static void main(){
        
        //llamamos a nuestra clase Ejercicios, donde ya estan definidos los metodos. cada metodo es un ejercicio 
        //distinto de la parte 1 de el pdf "estructuras".
        Ejercicios ej=new Ejercicios();
        
        ej.ejercicio1();//llamamos al primer metodo de la clase, es decir, el ejercicio 1.
        //ahora hacemos lo mismo con los demas ejercicios
        ej.ejercicio2();
        //ej.ejercicio3();
    
    }

}