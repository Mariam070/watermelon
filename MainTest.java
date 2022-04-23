import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void divisible(){
        Main test1 = new Main(); //boys can divide the watermelon into two parts
        assertEquals("Yes",test1.main(6));
    }
    @Test
    public void divisible1(){
        Main test1 = new Main(); //boys can't divide the watermelon into two parts
        assertEquals("No",test1.main(3));
    }
    @Test
    public void divisible2(){
        Main test1 = new Main(); //boys can't divide the watermelon into two parts
        assertEquals("No",test1.main(3.5));
    }
    @Test
    public void divisible3(){
        Main test1 = new Main(); // contains integer number w (within 1 and 100)
        assertEquals("No",test1.main(101));
    }
    @Test
    public void divisible4(){
        Main test1 = new Main(); // contains integer number w (within 1 and 100)
        assertEquals("No",test1.main(0));
    }
    @Test
    public void divisible5(){
        Main test1 = new Main(); // contains integer number w (within 1 and 100)
        assertEquals("No",test1.main(-1));
    }
    @Test
    public void divisible6(){
        Main test1 = new Main(); // contains integer number w (within 1 and 100)
        assertEquals("Yes",test1.main(100));
    }
}
