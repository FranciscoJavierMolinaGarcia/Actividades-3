void main() {
    //Introduccion
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa el lado A: ");
    double a = sc.nextDouble();
    System.out.println("Ingresa el lado B: ");
    double b = sc.nextDouble();
    System.out.println("Ingresa el lado C: ");
    double c = sc.nextDouble();


    //Desarrollo

    if ((a+b<=c) && (a+c <=b) && (b+c<=a)) {
        System.out.println("Los lados no forman un triangulo.");
        return;
    }

    //Desenlace

    if (a == b && b == c) {
        System.out.println("Triangulo equilatero: ");
    } else if (a == b || a == c || b == c) {
        System.out.println("El triangulo isosceles ");
    } else{
        System.out.println("El triangulo es escaleno ");
    }
}