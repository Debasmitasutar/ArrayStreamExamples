package CW;
import java.util.Arrays;

public class Stream {
    public void findSumElement(){
        int[] intArr = new int[] {1,3,8,9,-45};
        //Using sum function
        // int sum=Arrays.stream(intArr)
              //  .sum();
        //System.out.println("The sum of the element of the array is:"+sum);

        //Using Reduce() function -> first parameter = initial index, total= store the adition value
        // and element= each element of array
        int sum=Arrays.stream(intArr)
                .reduce(0,(total,element)->total+element);
        System.out.println("The sum of the element of the array is:"+sum);


    }

    public static void main(String[] args) {
        Stream streamobj=new Stream();
        streamobj.findSumElement();

    }
}
