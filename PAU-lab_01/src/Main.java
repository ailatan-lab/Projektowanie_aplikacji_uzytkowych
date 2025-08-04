import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Wybierz figurę");
            System.out.println("1. Trójkąt");
            System.out.println("2. Kwadrat");
            System.out.println("3. Kółko");
            System.out.println("4. Graniastosłupy");
            System.out.println("5. Wyjście");
            int wybor;
            Scanner scanner = new Scanner(System.in);
            wybor = scanner.nextInt();
            switch (wybor) {
                case 1: {
                    System.out.println("Podaj długości boków a, b, c i wysokości h");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    double h = scanner.nextDouble();
                    try {
                        Triangle trojkat = new Triangle(a, b, c, h);
                        trojkat.print();
                        System.out.println("Pole: " + trojkat.calculateArea());
                        System.out.println("Obwód: " + trojkat.calculatePerimeter());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;


                case 2: {
                    System.out.println("Podaj długość boku a");
                    double a = scanner.nextDouble();
                    try {
                        Square kwadrat = new Square(a);
                        kwadrat.print();
                        System.out.println("Pole: " + kwadrat.calculateArea());
                        System.out.println("Obwód: " + kwadrat.calculatePerimeter());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }


                case 3: {
                    System.out.println("Podaj długość promienia");
                    double r = scanner.nextDouble();
                    try {
                        Circle kolko = new Circle(r);
                        kolko.print();
                        System.out.println("Pole: " + kolko.calculateArea());
                        System.out.println("Obwód: " + kolko.calculatePerimeter());
                    } catch (IllegalArgumentException e) {
                        System.out.println((e.getMessage()));
                    }
                    break;
                }


                case 4: {
                    System.out.println("Wybierz podstawę");
                    System.out.println("1. Trójkąt");
                    System.out.println("2. Kwadrat");
                    System.out.println("3. Kółko");
                    System.out.println("4. Wyjście");
                    int wybor2;
                    wybor2 = scanner.nextInt();
                    switch (wybor2) {

                        case 1: {
                            System.out.println("Podaj długości boków a, b, c i wysokości h");
                            double a = scanner.nextDouble();
                            double b = scanner.nextDouble();
                            double c = scanner.nextDouble();
                            double h = scanner.nextDouble();
                            try {
                                Triangle trojkat = new Triangle(a, b, c, h);
                                System.out.println("Podaj wysokość graniastosłupa H");
                                double H = scanner.nextDouble();
                                Prism graniastoslop = new Prism(H, trojkat);
                                System.out.println("Pole: " + graniastoslop.calculateArea());
                                System.out.println("Objętość: " + graniastoslop.calculateVolume());
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        }


                        case 2: {
                            System.out.println("Podaj długośC boku a");
                            double a = scanner.nextDouble();
                            try {
                                Square kwadrat = new Square(a);
                                System.out.println("Podaj wysokość graniastosłupa H");
                                double H = scanner.nextDouble();
                                Prism graniastoslop = new Prism(H, kwadrat);
                                System.out.println("Pole: " + graniastoslop.calculateArea());
                                System.out.println("Objętość: " + graniastoslop.calculateVolume());
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        }

                        case 3: {
                            System.out.println("Podaj długość promienia r");
                            double r = scanner.nextDouble();
                            try {
                                Circle kolko = new Circle(r);
                                System.out.println("Podaj wysokość graniastosłupa H");
                                double H = scanner.nextDouble();
                                Prism graniastoslop = new Prism(H, kolko);
                                System.out.println("Pole: " + graniastoslop.calculateArea());
                                System.out.println("Objętość: " + graniastoslop.calculateVolume());
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        }

                        case 4:
                            return;

                    }

                }

                case 5:
                    return;
            }
        }
    }
}