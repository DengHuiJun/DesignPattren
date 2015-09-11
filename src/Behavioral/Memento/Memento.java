package Behavioral.Memento;

/**
 * Created by zero on 15-9-11.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
