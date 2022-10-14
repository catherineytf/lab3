import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTests {
    @Test
    public void testFilter(){
       StringChecker ls = new LongString();
       ArrayList<String> input = new ArrayList<>();
       input.add("apple");
       input.add("banana");
       input.add("pear");
       input.add("strawberry");
       input.add("blackberry");
       ArrayList<String> expected = new ArrayList<>();
       expected.add("banana");
       expected.add("strawberry");
       expected.add("blackberry");
       assertEquals(expected,ListExamples.filter(input, ls));
    }
    
}
