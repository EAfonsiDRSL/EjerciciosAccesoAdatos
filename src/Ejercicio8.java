import java.util.ArrayList;

public class Ejercicio8 {

    public static void main(String[] args) {


        ArrayList<String>Marcas= new ArrayList<>();
        Marcas.add("Volvo");
        Marcas.add("Porche");
        Marcas.add("Ferrari");
        Marcas.add("Nissan");
        Marcas.add("BMW");
        Marcas.add("Chevrolet");
        Marcas.add("Buggati");
        Marcas.add("Citroen");
        Marcas.add("Peugeot");
        Marcas.add("Masserati");
        Marcas.add("Ford");
        Marcas.add("Alpha Romeo");
        Marcas.add("Renault");
        Marcas.add("Seat");

        Pares(Marcas);
    }

    public static void Pares (ArrayList<String>Marcas){

        for (int i =0; i<Marcas.size();i++){
            if (i % 2 == 0){
                System.out.println("Posicion "+i+" : "+ Marcas.get(i));
            }

        }
    }
}
