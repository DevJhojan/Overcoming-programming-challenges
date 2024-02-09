import java.util.Scanner;

public class AreaPolygon {
    public static float triangle(int base, int height){
        return (float) (base*height) /2;
    }
    public static int square(int base, int height){
        return base * height;
    }
    public static int rectangle(int base, int height){
        return base * height;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("choose and write: s = square, r = rectangle and t = triangle ");
        String write = scanner.nextLine();

        switch (write){
            case "s":
                System.out.print("write base: ");
                int base = scanner.nextInt();
                System.out.print("write height: ");
                int height = scanner.nextInt();
                int areaSquare = square(base, height);
                System.out.println("the square are is: " + areaSquare);
                break;

            case "r":
                System.out.print("write base: ");
                int baseRectangle = scanner.nextInt();
                System.out.print("write height: ");
                int heightRectangle = scanner.nextInt();
                int areaRectangle = rectangle(baseRectangle, heightRectangle);
                System.out.println("the rectangle area is: " + areaRectangle);
                break;

            case "t":
                System.out.print("write base: ");
                int baseTriangle= scanner.nextInt();
                System.out.print("write height: ");
                int heightTriangle = scanner.nextInt();
                float areaTriangle = triangle(baseTriangle,heightTriangle);
                System.out.println("the rectangle area is: " + areaTriangle);
                break;
        }
    }
}
