import static org.junit.Assert.*;
import org.junit.*;

public class DummyTest{
    @Test
    public void shouldDoMath(){
        int a = 1;
        int b = 1;
        int c = a+b;
        assertEquals(3, c);
    }
}