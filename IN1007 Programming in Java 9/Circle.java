public class Circle {
    public int radius;
    public static double PI = 3.14;
    private static int numberOfCircles = 0;
    private static double totalSurface = 0;

    //Constructors
    public Circle(int radius) {
        this.radius = radius;
        numberOfCircles++;
        totalSurface += (PI * (radius*radius));
    }

    public Circle(){
        radius = 1;
        totalSurface += (PI * (radius*radius));
    }

    // Getter and Setters
    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        if (radius > 0){
            this.radius = radius;
        } else {
            System.out.println("Not positive");
        }
    }

    public int getNumberOfCircles(){
        return numberOfCircles;
    }

    public void setNumberOfCircles(int numberOfCircles){
        this.numberOfCircles = numberOfCircles;
    }

    public double getTotalSurface(){
        return totalSurface;
    }

    public void setTotalSurface(double totalSurface){
        this.totalSurface = totalSurface;
    }


    private double getSurface(int radius){
        double surface = (PI*(radius*radius));
        return surface;
    }


}
