void main() {
    Scanner sc = new Scanner(System.in);

    double calif1, calif2, calif3, calif4, calif5, calif6;
    double peso1, peso2, peso3, peso4, peso5, peso6;
    double sumaPesos;
    double promedioPonderado;

    System.out.println("Sistema de Gestión de Calificaciones: ");
    System.out.println("Ingresa las calificaciones y pesos de 6 materias");

    System.out.print("Calificación, materia 1 del 0 al 100): ");
    calif1 = sc.nextDouble();
    System.out.print("Peso, materia 1: ");
    peso1 = sc.nextDouble();
    System.out.println();

    System.out.print("Calificación, materia 2 del 0 al 100: ");
    calif2 = sc.nextDouble();
    System.out.print("Peso materia 2: ");
    peso2 = sc.nextDouble();
    System.out.println();

    System.out.print("Calificación, materia 3 del 0 al 100: ");
    calif3 = sc.nextDouble();
    System.out.print("Peso materia 3: ");
    peso3 = sc.nextDouble();
    System.out.println();

    System.out.print("Calificación, materia del 0 al 100): ");
    calif4 = sc.nextDouble();
    System.out.print("Peso materia 4: ");
    peso4 = sc.nextDouble();
    System.out.println();

    System.out.print("Calificación, materia 5  del 0 al 100: ");
    calif5 = sc.nextDouble();
    System.out.print("Peso materia 5: ");
    peso5 = sc.nextDouble();
    System.out.println();

    System.out.print("Calificación, materia 6 del 0 al 100: ");
    calif6 = sc.nextDouble();
    System.out.print("Peso materia 6: ");
    peso6 = sc.nextDouble();
    System.out.println();

    sumaPesos = peso1 + peso2 + peso3 + peso4 + peso5 + peso6;

    if (Math.abs(sumaPesos - 100) > 0.01) {
        System.out.printf("Error: La suma de los pesos es %.2f%%. Debe ser 100%%.%n", sumaPesos);
        return;
    }

    promedioPonderado =(calif1 * peso1 / 100) +
            (calif2 * peso2 / 100) +
            (calif3 * peso3 / 100) +
            (calif4 * peso4 / 100) +
            (calif5 * peso5 / 100) +
            (calif6 * peso6 / 100);

    System.out.println("Resumen de Materias");
    System.out.printf("Materia 1: Calificación %.2f, Peso %.2f%%%n", calif1, peso1);
    System.out.printf("Materia 2: Calificación %.2f, Peso %.2f%%%n", calif2, peso2);
    System.out.printf("Materia 3: Calificación %.2f, Peso %.2f%%%n", calif3, peso3);
    System.out.printf("Materia 4: Calificación %.2f, Peso %.2f%%%n", calif4, peso4);
    System.out.printf("Materia 5: Calificación %.2f, Peso %.2f%%%n", calif5, peso5);
    System.out.printf("Materia 6: Calificación %.2f, Peso %.2f%%%n", calif6, peso6);
    System.out.printf("Suma de pesos: %.2f%%%n", sumaPesos);

    System.out.println("Resultado Final");
    if (promedioPonderado < 60) {
        System.out.printf("Promedio ponderado: %.2f%%. Has suspendiodo.%n", promedioPonderado);
    } else {
        System.out.printf("Promedio ponderado: %.2f%%. ¡Has aprobado!%n", promedioPonderado);
    }
}
