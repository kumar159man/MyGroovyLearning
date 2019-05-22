// Write a program that takes three numbers as input to calculate and print the average of the numbers.


Scanner scanner = new Scanner (System.in)
// println("Enter first number" )
// int a =scanner.nextInt()
// println("Enter second number" )
// int b =scanner.nextInt()
// println("Enter third number" )
// int c =scanner.nextInt()

// float avg = (a+b+c)/3

// println(avg)



// Alternative

int[] integers = new int[3]
def sum=0
println("Enter numbers")
for(int i = 0; i < 3; i++)
{
    integers[i] = scanner.nextInt()
    sum+=integers[i]
}
float avg = sum/3

println(avg)