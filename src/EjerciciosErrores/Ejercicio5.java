package EjerciciosErrores;

public class Ejercicio5 {


    public static void main(String[] args) throws MiExecpcion {

        a();

    }

    public static void a() throws MiExecpcion {

        System.out.println("LLamando al método B");
        try {
            b();
        } catch (MiExecpcion e) {
            System.out.println("Captando excepcion en A " + e.getMessage());
        }


    }

    public static void b() throws MiExecpcion {

        System.out.println("Se llamará al método C");
        try {
            c();
        } catch (MiExecpcion e) {
            System.out.println("Se captura excepcion en b " + e.getMessage());
            throw e;
        }
    }

    public static void c() throws MiExecpcion {
        System.out.println("Vamos a generar excepcion en C");

        throw new MiExecpcion("Excepcion personalizada en C");
    }
}
