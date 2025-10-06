/*
    Exercise: FizzBuzz
    Write a program that uses console.log to print all the numbers from 1 to 100,
    with two exceptions.
    For numbers divisible by 3, print "Fizz" instead of the number,
    and for numbers divisible by 5 (and not 3), print "Buzz" instead.

    When you have that working, modify your program to print "FizzBuzz" for numbers that are divisible by both 3 and 5.
*/
public class Main {
    public static void main(String[] args){
        // Iterate from 1 to 100
        for(int i = 1; i < 101; i++){
            // If divisible by both 3 and 5, print FizzBuzz
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            // If divisble by 3, print Fizz
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            // If divisble by 5, print Buzz
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            // Else print i
            else{
                System.out.println(i);
            }
        }
    }
}
