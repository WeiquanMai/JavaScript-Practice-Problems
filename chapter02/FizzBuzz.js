/*
    Exercise: FizzBuzz
    Write a program that uses console.log to print all the numbers from 1 to 100,
    with two exceptions.
    For numbers divisible by 3, print "Fizz" instead of the number,
    and for numbers divisible by 5 (and not 3), print "Buzz" instead.

    When you have that working, modify your program to print "FizzBuzz" for numbers that are divisible by both 3 and 5.
*/

// Iterate from 1 to 100
for(let number = 1; number < 101; number++){
    // If number is divisble by both 3 and 5, print "FizzBuzz"
    if(number % 3 == 0 && number % 5 == 0){
        console.log("FizzBuzz");
    }
    // If number is divisble by 3, print Fizz
    else if(number % 3 == 0){
        console.log("Fizz");
    }
    // If number is divisible by 5, print Buzz
    else if(number % 5 == 0){
        console.log("Buzz");
    }
    // Else, print the number
    else{
        console.log(number);
    }
}
