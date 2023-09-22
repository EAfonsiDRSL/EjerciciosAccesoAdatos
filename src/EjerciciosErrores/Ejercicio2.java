package EjerciciosErrores;

public class Ejercicio2 {

    public static void main(String[] args) {


        int divisor, dividendo, resultado;
        divisor = 10;
        //usando try catch evitamos que la excepcion se propague

        try{
            //dividimos entre 0 para llamar a la excepcion

           dividendo = 0;
           resultado = divisor/dividendo;


        }catch (Exception e){


            System.out.println("Excepcion captada con nombre "+e);
            e.printStackTrace();
            System.out.println("La causa de la excepcion es "+e.getCause());


        }

        dividendo = 5;
        resultado = divisor / dividendo;
        System.out.println("El resultado de la segunda operacion es: "+resultado);
    }
}

