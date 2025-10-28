void main() {
    //Introduccion

    double nota1, nota2, nota3, nota4, nota5;
    double promedio;
    Scanner sc = new Scanner(System.in);

    //Desarrollo

    System.out.println("Introduce la nota de la primera asignatura: ");
    nota1 = sc.nextDouble();
    System.out.println("Introduce la nota de la segunda asignatura: ");
    nota2 = sc.nextDouble();
    System.out.println("Introduce la nota de la tercera asignatura: ");
    nota3 = sc.nextDouble();
    System.out.println("Introduce la nota de la quarta asignatura: ");
    nota4 = sc.nextDouble();
    System.out.println("Introduce la nota de la quinta asignatura: ");
    nota5 = sc.nextDouble();

    if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 ||
        nota3 < 0 || nota3 > 100 || nota4 < 0 || nota4 > 100 ||
        nota5 < 0 || nota5 > 100) {

    System.out.println("Las notas tienen que ser entre 0 a 100. ");
    }

    promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

    //Desenlace

    System.out.printf("Tu promedio es: %.2f%n", promedio);

    if (promedio >= 90 && promedio <= 100) {
        System.out.println("Calificación: A");
    }
    else if (promedio >= 80) {
        System.out.println("Calificación: B");
    }
    else if (promedio >= 70) {
        System.out.println("Calificación: C");
    }
    else if (promedio >= 60) {
        System.out.println("Calificación: D");
    }
    else {
        System.out.println("Calificación: F");
    }
}

