void main() {
    //Introduccion
    Scanner sc = new Scanner(System.in);

    System.out.println("Escoge entre: Piedra, Papel, Tijera, Lagarto, Spock ");
    System.out.println("Jugador 1 elige entre: 1-Piedra, 2-Papel, 3-Tijeras, 4-Lagarto, 5-Spock");

    int jugador1 = sc.nextInt();

    System.out.println("Jugador 2, elige: 1-Piedra, 2-Papel, 3-Tijeras, 4-Lagarto, 5-Spock");
    int jugador2 = sc.nextInt();

    // Desarrollo
    if (jugador1 < 1 || jugador1 > 5 || jugador2 < 1 || jugador2 > 5) {
        System.out.println("Elección inválida. Debe ser entre 1 y 5.");
        return;
    }
    if (jugador1 == jugador2) {
        System.out.println("Empate");
        return;
    }

    switch (jugador1) {
        case 1:
            switch (jugador2) {
                case 3:
                    System.out.println("Piedra aplasta Tijeras: EL JUGADOR 1 ES EL GANADOR!");
                    break;
                case 4:
                    System.out.println("Piedra aplasta Lagarto: EL JUGADOR 1 ES EL GANADOR");
                    break;
                default:
                    if (jugador2 == 2) {
                        System.out.println("Papel cubre Piedra: EL JUGADOR 2 ES EL GANADOR");
                    } else {
                        System.out.println("Spock vaporiza Piedra: EL JUGADOR 2 ES EL GANADOR");
                    }
                    break;
            }
        break;
        case 2:
            switch (jugador2) {
                case 1:
                    System.out.println("Papel cubre Piedra: EL JUGADOR 1 ES EL GANADOR");
                    break;
                case 5:
                    System.out.println("Papel desautoriza Spock: EL JUGADOR 1 ES EL GANADOR");
                    break;
                default:
                    if (jugador2 == 3) {
                        System.out.println("Tijeras cortan Papel: EL JUGADOR 2 ES EL GANADOR");
                    } else {
                        System.out.println("Lagarto come Papel: EL JUGADOR 2 ES EL GANADOR");
                    }
                    break;
            }
        break;
        case 3:
            switch (jugador2) {
                case 2:
                    System.out.println("Tijeras cortan Papel: EL JUGADOR 1 ES EL GANADOR");
                    break;
                case 4:
                    System.out.println("Tijeras decapitan Lagarto: EL JUGADOR 1 ES EL GANADOR");
                    break;
                default:
                    if (jugador2 == 1) {
                        System.out.println("Piedra aplasta Tijeras: EL JUGADOR 2 ES EL GANADOR");
                    } else {
                        System.out.println("Spock rompe Tijeras: EL JUGADOR 2 ES EL GANADOR");
                    }
                    break;
            }
        break;
        case 4:
            switch (jugador2) {
                case 5:
                    System.out.println("Lagarto envenena Spock: EL JUGADOR 1 ES EL GANADOR");
                    break;
                case 2:
                    System.out.println("Lagarto come Papel: EL JUGADOR 1 ES EL GANADOR");
                    break;
                default:
                    if (jugador2 == 1) {
                        System.out.println("Piedra aplasta Lagarto: EL JUGADOR 2 ES EL GANADOR");
                    } else {
                        System.out.println("Tijeras decapitan Lagarto: EL JUGADOR 2 ES EL GANADOR");
                    }
                    break;
            }
        break;
        case 5:
            switch (jugador2) {
                case 3:
                    System.out.println("Spock rompe Tijeras: EL JUGADOR 1 ES EL GANADOR");
                    break;
                case 1:
                    System.out.println("Spock vaporiza Piedra: EL JUGADOR 1 ES EL GANADOR");
                    break;
                default:
                    if (jugador2 == 2) {
                        System.out.println("Papel desautoriza Spock: EL JUGADOR 2 ES EL GANADOR");
                    } else {
                        System.out.println("Lagarto envenena Spock: EL JUGADOR 2 ES EL GANADOR");
                    }
                    break;
            }
        break;
    }
}
