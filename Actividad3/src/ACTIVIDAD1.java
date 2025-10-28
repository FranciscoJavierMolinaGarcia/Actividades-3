
void main() {
   //Introduccion

    String user;
    String contrasena;

    Scanner sc = new Scanner(System.in);
    sc.nextLine();

    //Desarrollo

    System.out.println("Introduce tu usuario: ");
    user = sc.nextLine();
    System.out.println("Introduce tu contraseña: ");
    contrasena = sc.nextLine();

    //Desenlace

    if (user.equals("admin") && contrasena.equals("1234")) {
        System.out.println("Eres administrador: ");
    }
    else if (user.equals("user") && contrasena.equals("abcd")) {
        System.out.println("Eres usuario: ");
    }
    else if (user.equals("invitado") && contrasena.equals("xyz")) {

    }
    else {
        System.out.println("Acceso denegado: ");
    }


}