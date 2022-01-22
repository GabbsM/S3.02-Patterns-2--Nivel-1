package src;

public class App {
    public static void main(String[] args) {

        //Objeto Agente: Sujeto Observable
        //Objeto Agencia: Observador

        Agente agente = new Agente();
        Agencia agencia = new Agencia();

        agente.enlazarObservadores(agencia);
        agente.anunciarCambio();
    }
}
