
public class Flujo {

	public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin de main");
    }

    private static void metodo1() {
        System.out.println("Inicio de metodo1");
        try {
            metodo2();
        } catch(MiException e) {
            String msg = e.getMessage();
            System.out.println("Exception " + msg);
            e.printStackTrace();
        }
        System.out.println("Fin de metodo1");
    }

    private static void metodo2() throws MiException {
        System.out.println("Inicio de metodo2");
        throw new ArithmeticException("Mi excepcion fue lanzada");
        // System.out.println("Fin de metodo2");
    }

	
}
