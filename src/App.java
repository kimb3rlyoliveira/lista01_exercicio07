import java.util.Scanner;

public class App {

    public static void main (String[] args) {

        double area;
        double lados;
        double dobroarea;
        
        Scanner teclado = new Scanner (System.in);

            System.out.println("Informe a medida dos lados do quadrado:");

            lados = teclado.nextDouble();

            area = Math.pow(lados, 2);

            System.out.println("O valor da área do quadrado é:" + area);

            dobroarea = area * 2;

            System.out.println("O dobro da área do quadrado é:" + dobroarea);
    }
}