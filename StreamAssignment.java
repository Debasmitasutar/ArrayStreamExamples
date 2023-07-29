package CW;
import java.util.Arrays;


public class StreamDemo {
    public void forEachElement(){
        int[] intArr = {2,3,4,5,10 ,6};
        Arrays.stream(intArr)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        StreamDemo streamDemoObj = new StreamDemo();
        streamDemoObj.forEachElement();
    }
}
