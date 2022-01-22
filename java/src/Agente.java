package src;

import java.util.ArrayList;

public class Agente implements SujetoObservable{

    private ArrayList<Observador> observadores;

    public Agente(){
        observadores = new ArrayList<>();
    }

    public void anunciarCambio(){
        notificar();
    }

    public  void enlazarObservadores(Observador o){
        observadores.add(o);
    }

    @Override
    public void notificar() {
        for (Observador o: observadores){
            o.update();
        }

    }
}
