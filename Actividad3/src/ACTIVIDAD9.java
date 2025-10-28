    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("Calculadora Avanzada: ");
        System.out.println("----------------------------------------------------------");
        System.out.println("Operaciones: ");
        System.out.println("----------------------------------------------------------");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        System.out.println("5: Potencia");
        System.out.println("6: Raíz cuadrada");
        System.out.println("7: Factorial");
        System.out.println("----------------------------------------------------------");
        System.out.print("Selecciona una operación (1-7): ");
        int operacion = sc.nextInt();

        if (operacion < 1 || operacion > 7) {
            System.out.println("Operación inválida. ");
            return;
        }
        double num1 = 0, num2 = 0;

        if (operacion >= 1 && operacion <= 5) {
            System.out.print("Ingresa el primer número: ");
            num1 = sc.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            num2 = sc.nextDouble();
        } else {
            System.out.print("Ingresa el número: ");
            num1 = sc.nextDouble();
        }
        double resultado = 0;

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("Resultado: %.2f + %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("Resultado: %.2f - %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("Resultado: %.2f * %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: División por cero no permitida.");
                    return;
                }
                resultado = num1 / num2;
                System.out.printf("Resultado: %.2f / %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 5:
                resultado = Math.pow(num1, num2);
                System.out.printf("Resultado: %.2f ^ %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 6:
                if (num1 < 0) {
                    System.out.println("Error nose pueden utilizar numeros negativos.");
                    return;
                }
                resultado = Math.sqrt(num1);
                System.out.printf("Resultado: √%.2f = %.2f%n", num1, resultado);
                break;
            case 7:
                if (num1 < 0 || num1 != (int)num1) {
                    System.out.println("Error senecesita un numero entero.");
                    return;
                }
                long factorialResultado = factorial((int)num1);
                System.out.printf("Resultado: %d! = %d%n", (int)num1, factorialResultado);
                break;
        }
    }

