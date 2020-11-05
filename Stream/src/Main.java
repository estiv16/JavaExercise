import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main extends Campeones{

    public static void main(String[] args){

        Metodos metodo = new Metodos();
        Scanner sc = new Scanner(System.in);

        Campeones[] camp = {new Campeones(sc.nextInt(), sc.next(), sc.nextInt(), sc.next()),
                new Campeones(sc.nextInt(), sc.next(), sc.nextInt(), sc.next()),
                new Campeones(sc.nextInt(), sc.next(), sc.nextInt(), sc.next())};

        metodo.transformar(camp);
        System.out.println("////////////////////////");
        metodo.contar(camp);
        System.out.println("////////////////////////");
        metodo.limitar(camp);
    }
}
