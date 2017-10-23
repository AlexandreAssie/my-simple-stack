package deqo.votre_quadrigramme;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void getValue() throws Exception {
        Item item = new Item();
        item.setValue(10);
        assertEquals("",10,item.getValue());
    }

    @Test
    public void setValue() throws Exception {
        Item item = new Item();
        item.setValue(10);
        assertEquals("",10,item.getValue());
    }

}