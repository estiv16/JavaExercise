import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class Stand {

    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        Stack<Productos> pila = new Stack<Productos>();
        System.out.println("Ingrese la cantidad de productos");
        int cant = sc.nextInt();

        for(int i=0; i<cant; i++){
            System.out.println("ingrese el id, nombre, cantidad en orden:");
            Productos pro = new Productos( sc.nextInt(), sc.next(),sc.nextInt()) ;
            pila.push(pro);
        }

        while (!pila.isEmpty()){
            System.out.println("////////////////////////");
            Productos pro = pila.pop();
            pro.mostrar();
        }

    }
}
