void main() {
    //Introduccion
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa un número entero positivo: ");
    int numero = sc.nextInt();

    //Desarrollo
    if (numero <= 0){
        System.out.println("Número invalido, tiene que ser positivo. ");
        return;
    }

    int suma = 0;
    for (int i = 1; i <= numero; i++) {
        if(numero % i == 0){
            suma += i;
        }
    }
    //Desenlace
    if(suma == numero){
        System.out.println("El numero es perfecto: " + numero + ".");
    }else {
        System.out.println("El numero no es perfecto: " + numero + ".");
    }
}
