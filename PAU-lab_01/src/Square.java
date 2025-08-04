public class Square extends Figure implements Printable {
    private double a;
    public void print() {
        System.out.println("Bok: " + a);
    }
    public Square(double a2){
        if(a2<=0)
            throw new IllegalArgumentException("Bok musi być większy od 0");
        a = a2;
    }
    public double calculateArea() {
        double area;
        area = a*a;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter;
        perimeter = 4*a;
        return perimeter;
    }
}