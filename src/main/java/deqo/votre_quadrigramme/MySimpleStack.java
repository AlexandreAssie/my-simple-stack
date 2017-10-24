package deqo.votre_quadrigramme;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack implements SimpleStack{

    public ArrayList<Item> stack = new ArrayList<Item>();

    public boolean isEmpty() {
        if(this.stack.size() == 0) return true;
        return false;
    }

    public int getSize() {
        return this.stack.size();
    }

    public void push(Item item) {
        this.stack.add(item);
    }

    public Item peek() throws EmptyStackException {
        int taille = this.stack.size()-1;
        if(taille < 0 ){
            throw new EmptyStackException();
        }
        return this.stack.get(taille);
    }

    public Item pop() throws EmptyStackException {
        Item item = this.peek();
        this.stack.remove(item);
        return item;
    }
}

