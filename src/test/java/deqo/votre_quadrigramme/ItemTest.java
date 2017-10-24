package deqo.votre_quadrigramme;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    Item item = new Item();
    @Test
    public void getValue() throws Exception {

        item.setValue(10);
        assertEquals("Doit retrouner la valeur de l'element",10,item.getValue());
    }

    @Test
    public void setValue() throws Exception {
        item.setValue(10);
        assertEquals("Retourne la valeur rentrée dans le setter",10,item.getValue());
    }

}