/*
Write a program to print the area and perimeter of a circle. Go to the editor
Test Data:
Radius = 7.5 
Expected Output
Perimeter is = 47.12388980384689 
Area is = 176.71458676442586
*/
Scanner scanner =new Scanner(System.in)
println ("Enter Radius of the circle")
float radius = scanner.nextFloat()
def area = Math.PI * radius **2
def perimeter = 2 * Math.PI * radius
println("Area of the circle is :" + area)
println("Perimeter of the circle is :" + perimeter)