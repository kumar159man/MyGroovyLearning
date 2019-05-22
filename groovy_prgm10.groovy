/*
Write a program to print the area and perimeter of a rectangle. Go to the editor
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20

*/
Scanner scanner= new Scanner(System.in)
float[] rect = new float[2]
println("Enter Length and width of rectangle")
for (int i=0 ; i<2; i++)
{
  rect[i] = scanner.nextFloat()
}
float area= rect[0]*rect[1]
float perimeter= 2*(rect[0]+rect[1])
println("Area of Rectangle : " + area)
println("Perimeter of Rectangle : " + perimeter)