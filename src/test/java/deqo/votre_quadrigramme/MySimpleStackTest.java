package deqo.votre_quadrigramme;

import org.junit.Test;

import static org.junit.Assert.*;

public class MySimpleStackTest {
    @Test
    public void push() throws Exception {
        MySimpleStack stack = new MySimpleStack();
        Item myItem = new Item(10);
        assertEquals("",0,stack.getSize());
        stack.push(myItem);

        assertEquals("",1,stack.getSize());
        assertEquals("",myItem,stack.peek());

    }

    @Test
    public void peek() throws Exception {
        MySimpleStack stack = new MySimpleStack();
        Item myItem = new Item(10);
        stack.push(myItem);

        assertEquals("",myItem,stack.peek());
    }

    @Test
    public void pop() throws Exception {
        MySimpleStack stack = new MySimpleStack();
        Item myItem = new Item(10);
        stack.push(myItem);

        assertEquals("",1,stack.getSize());
        assertEquals("",myItem,stack.pop());
        assertEquals("",0,stack.getSize());
    }

    @Test
    public void isEmpty() throws Exception {
        MySimpleStack stack = new MySimpleStack();

        // Assertions (oracle)
        assertTrue("A new stack should be empty", stack.isEmpty());
        assertEquals("A new stack has no element", 0, stack.getSize());

    }


    @Test
    public void getSize() throws Exception {
        MySimpleStack stack = new MySimpleStack();
        assertEquals("",0,stack.getSize());

        stack.push(new Item(1));
        assertEquals("",1,stack.getSize());
        stack.push(new Item(1));

        assertEquals("",2,stack.getSize());
        stack.pop();

        assertEquals("",1,stack.getSize());
    }




}