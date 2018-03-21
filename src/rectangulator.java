public class Rectangulator {
  public static void main(String[] args) {
    int length = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);


    rectangle myrectangle = new rectangle(length, width);
     

    string output = String.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myrectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter()); 
  system.out.println(output);
}
}
