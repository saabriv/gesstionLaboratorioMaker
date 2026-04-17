import java.util.Scanner;

public class Main{
    static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        //variables para validar los datos
        boolean nombreValido = false;
        boolean correoValido = false;
        boolean dniValido = false;
        boolean rolValido = false;

        //objeto Persona creada.

        Persona Persona1 = new Persona();

        while (!nombreValido){

            System.out.println("Ingrese su nombre: ");
            String nombre = teclado.nextLine();
            nombreValido = Persona1.setNombre(nombre);
        }

        while (!correoValido) {
            System.out.println("Ingrese su correo: ");
            String correo = teclado.nextLine();
            correoValido = Persona1.setCorreo(correo);
        }

        while (!rolValido){
            System.out.println("Ingrese su rol: (estudiante o docente) ");
            String rol = teclado.nextLine();
            rolValido = Persona1.setRol(rol);
        }

        while (!dniValido){
            System.out.println("Ingrese su dni: ");
            int dni = teclado.nextInt();
            dniValido = Persona1.setDni(dni);
        }

        System.out.println("----------------------------datos registrados----------------------------\n" +
                "nombre "+Persona1.getNombre() +"\nDNI: "+ Persona1.getDni()+ "\nCorreo: "+Persona1.getCorreo()+"\nRol: "+ Persona1.getRol());

            String impresion1 = Persona.solicitudImpresion();
    }
}