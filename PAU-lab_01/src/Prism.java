public class Prism implements Printable{
    private double H;
    private Figure podstawa;
    public void print(){
        System.out.println("Wysokość: " + H);
        podstawa.print();
    }
    public Prism(double H2, Figure podstawa2){
        if(H2<=0)
            throw new IllegalArgumentException("Wysokość musi być większa od 0");
        H = H2;
        podstawa = podstawa2;
    }
    public double calculateArea(){
        double area;
        area = 2*podstawa.calculateArea() + podstawa.calculatePerimeter()*H;
        return area;
    }
    public double calculateVolume(){
        double volume;
        volume = podstawa.calculateArea()*H;
        return volume;
    }
}
