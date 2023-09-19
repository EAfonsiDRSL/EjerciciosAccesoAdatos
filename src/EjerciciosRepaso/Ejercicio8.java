package EjerciciosRepaso;

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
        Marcas.add("Abarth");
        Marcas.add("Aiways");
        Marcas.add("Alpine");
        Marcas.add("Aston Martin");
        Marcas.add("Audi");
        Marcas.add("Bentley");
        Marcas.add("BYD");
        Marcas.add("CUPRA");
        Marcas.add("Dacia");
        Marcas.add("DFSK");
        Marcas.add("EVO");
        Marcas.add("Fiat");
        Marcas.add("Hyundai");
        Marcas.add("Jeep");
        Marcas.add("Kia");
        Marcas.add("Mazda");
        Marcas.add("Mercedes");
        Marcas.add("MINI");
        Marcas.add("Opel");
        Marcas.add("Skoda");
        Marcas.add("Suzuki");
        Marcas.add("Tesla");
        Marcas.add("Toyota");
        Marcas.add("Cadillac");
        Marcas.add("Lancia");
        Marcas.add("Invicta");
        Marcas.add("Izusu");
        Marcas.add("Lada");
        Marcas.add("Volkswagen");
        Marcas.add("Mitsubishi");
        Marcas.add("Maserati");


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
