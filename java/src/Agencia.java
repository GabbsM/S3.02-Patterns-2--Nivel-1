package src;

public class Agencia implements Observador{
    Agencia(){

    }
    @Override
    public void update() {
        System.out.println();
        System.out.println("ATENCIÓN!! :: Se han detectado cambios en los valores de las Bolsa");
        System.out.println();

    }
}
