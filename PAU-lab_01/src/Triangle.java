public class Triangle extends Figure implements Printable{
    private double a;
    private double b;
    private double c;
    private double h;
    public void print(){
        System.out.println("Boki: " + a + ", " + b + ", " + c + " Wysokosc: " + h);
    }
    public Triangle(double a2, double b2, double c2, double h2){
       if(a2<=0 || b2<=0 || c2<=0)
       {
           throw new IllegalArgumentException("Liczba musi być większa od 0");
       }

       if(a2+b2<=c2 || a2+c2<=b2 || b2+c2<=a2)
       {
           throw new IllegalArgumentException("Suma dwóch boków musi być większa od trzeciego boku");
       }
        a = a2;
        b = b2;
        c = c2;
        h = h2;
    }
    public double calculateArea(){
        double area;
        area = a*h/2;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter;
        perimeter = a + b + c;
        return  perimeter;
    }
}
