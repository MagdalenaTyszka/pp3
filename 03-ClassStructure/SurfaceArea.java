
public class SurfaceArea
{
    static double pi = 3.14;

    public static double circleArea(double r)
    {
        return pi * r * r;
    }
    
    public static double rectangleArea(double a, double b)
    {
        return a * b;
    }
    
    public static double triangleArea(double d, double h)
    {
        return h * d / 2;
    }
        
    public static void main(double [] args) {
        double poleKola = circleArea(3);
        double poleProstokata = rectangleArea(4,5);
        double poleTrojkata = triangleArea(3,4);
        System.out.println("Pole powierzchni koła wynosi:" + poleKola);
        System.out.println("Pole powierzchni prostokąta wynosi:" + poleProstokata);
        System.out.println("Pole powierzchni trójkąta wynosi:" + poleTrojkata);
    }
    
}
