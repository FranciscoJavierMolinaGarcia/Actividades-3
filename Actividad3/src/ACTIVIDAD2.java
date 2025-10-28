    void main() {
         //Introduccion

         String cliente;
         double producto;
         double descuento =0;
         double precioFinal;

         Scanner sc = new Scanner(System.in);

         //Desarrollo

         System.out.println("Introduce el precio del producto: ");
         producto = sc.nextDouble();
         sc.nextLine();

         System.out.println("Tipo de cliente: ");
         cliente = sc.nextLine();

         if (cliente.equals("regular")) {
             descuento = 0.05;
         }
         else if (cliente.equals("premium")) {
             descuento = 0.10;
         }
         else if (cliente.equals("VIP")) {
             descuento = 0.20;
         }
         if (producto > 500) {
            descuento += 0.05;
         }
         else {
             System.out.println("Cliente no reconocido. ");
         }

         precioFinal = producto *(1 - descuento);

         //Desenlace

        System.out.printf("Precio: %.2f €%n", precioFinal);

     }