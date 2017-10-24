package deqo.votre_quadrigramme;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MySimpleStackTest {
    MySimpleStack stack = new MySimpleStack();
    Item item = new Item(10);

    @Test
    public void push() throws Exception {
        assertEquals("La pile doit etre vide car 0 element a l'interieur",0,stack.getSize());
        stack.push(item);

        assertEquals("La pile doit contenir un element car un element est inseré",1,stack.getSize());
        assertEquals("L'element doit etre l'element rentré",item,stack.peek());

    }

    @Test
    public void peek() throws Exception {

        stack.push(item);

        assertEquals("Un element ",item,stack.peek());
        Item item2 = new Item(20);
        stack.push(item2);
        assertThat(stack.peek(),is(item2));
    }

    @Test(expected=EmptyStackException.class)
    public void testPeekException() throws Exception {
        stack.pop();
    }

    @Test
    public void pop() throws Exception {
        stack.push(new Item(20));
        stack.push(item);

        assertEquals("La pile doit contenir un element",2,stack.getSize());
        assertEquals("La methode pop doit retourner l'item",item,stack.pop());
        assertEquals("La methode pop doit remove l'element",1,stack.getSize());

    }

    @Test
    public void isEmpty() throws Exception {

        assertThat(stack.isEmpty(), is(true));

        stack.push(item);

        assertThat(stack.isEmpty(),is(false));
    }


    @Test
    public void getSize() throws Exception {
        assertEquals("La methode getSize doit retourner 0 si elle est vide",0,stack.getSize());
        stack.push(new Item(1));
        assertEquals("La methode doit retourner 1 car un element est dedans",1,stack.getSize());
        stack.push(new Item(1));
        assertEquals("La methode doit retourner 2 car un element est dedans",2,stack.getSize());
        stack.pop();
        assertEquals("La methode doit retourner 1 car un element est dedans",1,stack.getSize());
    }




}