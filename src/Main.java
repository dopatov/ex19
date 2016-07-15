import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Hello World!");
        System.out.println("introduce el numero de sueldos que quieras analizar:");
        int numero=sc.nextInt();
        int sueldomax=0;

        for (int i=0; i<numero; i++)
        {
            System.out.println("introduce el valor del sueldo " +(i+1) +": ");

            int sueldo=sc.nextInt();
            if (sueldomax < sueldo)
                sueldomax=sueldo;
        }
        System.out.println("el sueldo maximo es el sueldo: " +sueldomax);
    }
}
