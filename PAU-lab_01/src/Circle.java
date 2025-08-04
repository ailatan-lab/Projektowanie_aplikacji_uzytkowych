public class Circle extends Figure implements Printable{
    private double r;
    private double pi = Math.PI;

    public void print(){
        System.out.println("Promień: " + r);
    }
    public Circle(double r2){
        if(r2<=0)
            throw new IllegalArgumentException("Promień musi być większy o 0");
        r = r2;
    }
    public double calculateArea(){
        double area;
        area = pi*r*r;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter;
        perimeter = 2*pi*r;
        return perimeter;
    }
}
