void main() {
    //Introduccion
    double ingresos;
    int dependientes;
    double porcentajeBase;
    double porcentajeDescuento = 0;
    double porcentajeFinal;
    double impuestoTotal;

    Scanner sc = new Scanner(System.in);

    //Desarrollo
    System.out.println("Introduce tus ingresos: ");
    ingresos = sc.nextDouble();

    System.out.println("Introduce los dependientes: ");
    dependientes = sc.nextInt();

    if (ingresos < 20000){
        porcentajeBase = 0.05;
    } else if (ingresos < 40000 ) {
        porcentajeBase = 0.10;
    } else if (ingresos < 80000){
        porcentajeBase = 0.20;
    } else {
    porcentajeBase = 0.30;
    }

    if (dependientes > 3) {
    porcentajeDescuento = 0.05;
    System.out.println("Se aplica descuento por dependientes.");
    } else {
    System.out.println("No se aplica descuento por dependientes.");
    }

    porcentajeFinal = porcentajeBase - porcentajeDescuento;
        if (porcentajeFinal < 0) {
            porcentajeFinal = 0;
    }

    // Desarrollo
    impuestoTotal = ingresos * porcentajeFinal;

    System.out.println("Porcentaje final aplicado: " + (porcentajeFinal * 100) + "%");
    System.out.println("Los impuestos que debes pagar son: " + impuestoTotal);
}

