public class MyMathtest {
    public static void main(String[] args) {
        int num = 12345;
        
        int reverse = Day6.reverseNumber(num);        
        System.out.println(reverse);
        
        int sum = Day6.sumOfDigits(num);
        System.out.println(sum);
        
        int count = Day6.noOfDigits(num);
        System.out.println(count);        
    }
}