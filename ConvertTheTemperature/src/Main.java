public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        // Convert Temperature - Check Your Solution

        // In this example we are returning an array
        // therefore we will print out the values here
        // NOTE: but there's no need to print it out in LeetCode
        System.out.println();
        System.out.println("Convert Temperatures");

        for(double temp: ConvertTemperature.convertTemperature(100)){
            System.out.println(temp);
        }
    }
}