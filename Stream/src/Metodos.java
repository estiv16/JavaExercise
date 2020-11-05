import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class Metodos {

    public void ordenar(Campeones[] camp){
        List<Campeones> listCampeones = Arrays.asList(camp);
        listCampeones.stream()
                .sorted(Comparator.comparing(Campeones::getNombre))
                .forEach(x->System.out.println(    " Id:"    + x.getId()+
                                                "\n Nombre:" + x.getNombre() +
                                                "\n Vida:"   + x.getVida() +
                                                "\n Genero:" + x.getGenero()));
    }
    public void transformar(Campeones[] camp){
        List<Campeones> listCampeones = Arrays.asList(camp);
        listCampeones.stream()
                .filter(x-> x.getGenero()!="FEMALE")
                .sorted(Comparator.comparing(Campeones::getId))
                .map(x-> x.getId()+1)
                .forEach(System.out::println);
    }
    public void limitar(Campeones[] camp){
        List<Campeones> listCampeones = Arrays.asList(camp);
        listCampeones.stream()
                .filter(x-> x.getId()%2==0)
                .sorted(Comparator.comparing(Campeones::getId))
                .map(x-> x.getCampeon()).limit(2)
                .forEach(System.out::println);
    }
    public void contar(Campeones[] camp){
        List<Campeones> listCampeones = Arrays.asList(camp);
       System.out.println(listCampeones.stream()
               .filter(x-> x.getId()%2==0)
               .count());
    }

}
