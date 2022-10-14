import java.util.ArrayList;
import java.util.List;

public class ListTests {
    public void testFilter(){
       StringChecker ls = new LongString();
       List<String> input = new ArrayList<>();
       input.add("apple");
       input.add("banana");
       input.add("strawberry");
       List<String> expected = new ArrayList<>();
       String[] e = new String[]{"banana","strawberry"};
       expected.add("banana");
       expected.add("strawberry");
       List<String> result = ListExamples.filter(input, ls);
       assertArrayEquals(e,ListExamples.toArray(result));


    }
    
}
