package deqo.votre_quadrigramme;

public class Item {

    private int value;

    Item(int value){
        this.value = value;
    }
    Item(){

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
