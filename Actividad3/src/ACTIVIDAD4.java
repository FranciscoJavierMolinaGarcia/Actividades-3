void main() {
    //Introduccion
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el día: ");
    int dia = sc.nextInt();
    System.out.print("Introduce el mes: ");
    int mes = sc.nextInt();
    System.out.print("Introduce el año: ");
    int ano = sc.nextInt();

    boolean bisiesto;

    //Desarrollo
    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
        bisiesto = true;
    } else {
        bisiesto = false;
    }

    boolean fechaValida;

    switch (mes) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            fechaValida = (dia >= 1 && dia <= 31);
            break;
        case 4: case 6: case 9: case 11:
            fechaValida = (dia >= 1 && dia <= 30);
            break;
        case 2:
            if (bisiesto) {
                fechaValida = (dia >= 1 && dia <= 29);
            } else {
                fechaValida = (dia >= 1 && dia <= 28);
            }
            break;
        default:
            fechaValida = false;
    }

    //Desenlace
    if (fechaValida) {
        System.out.println("Es bisiesto.");
    } else {
        System.out.println("No es bisiesto.");
    }
}

