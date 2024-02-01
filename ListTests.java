import static org.junit.Assert.*;
import org.junit.*;
public class ListTests {
    @Test
    public void testfilter(){
        List<String> input1 = new ArrayList<>("1s","2s","5");
        StringChecker sc = s -> s.contains("s");
        assertArrayEquals(new ArrayList<>("1s","2s"), ListExamples.filter(input1, sc));
    }
    
}
