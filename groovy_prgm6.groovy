/*
Write a program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
Scanner scanner = new Scanner(System.in)
println ("Enter the number for the table")
int n =scanner.nextInt()
for (i in 1..10) {
    println("$n X $i = " + n*i)   
}