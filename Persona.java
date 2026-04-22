package ImplementarPilares.gesstionLaboratorioMaker;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Persona {
    //Atributos
    private int dni;
    private String nombre;
    private String correo;
    private String rol;
    public boolean isDocente;
    public static double tiempoEstimado;
    public static int alturaCapa, totalCapas;



    //Constructor

    public Persona(){}

    //Metodos
    public static String solicitudImpresion(){
        System.out.println("-----Solicitud de impresion-----");
        System.out.println("Ingresar nombre del archivo: ");
        Scanner teclado = new Scanner(System.in);
        String archivoNombre = teclado.nextLine();
        switch(archivoNombre) {
            case ("Puente"):
                alturaCapa = 2;
                totalCapas = 20;
                System.out.println(alturaCapa);
                System.out.println(totalCapas);
                break;
            case ("casa"):
                alturaCapa = 4;
                totalCapas = 40;
                System.out.println(alturaCapa);
                System.out.println(totalCapas);
                break;
            case ("pelota"):
                alturaCapa = 6;
                totalCapas = 1;
                System.out.println(alturaCapa);
                System.out.println(totalCapas);
                break;
        }
        //tiempoEstimado =
        System.out.println("Solicitando impresion...");
        return archivoNombre;
    }

    //atributos booleanos para establecer (setter) los datos

    public boolean setDni(int dni){
        if (dni > 0) {
            this.dni = dni;
            return true;
            } else {
            System.out.println("Ingresar un dni valido. Sin puntos");
            return false;
            }
        }

    public boolean setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else {
        return false;}
    }

    public boolean setCorreo(String correo) {
        if (correo != null && correo.contains("@")){
            this.correo = correo;
            return true;
        } else {
            System.out.println("Ingresar un correo valido. Debe incluir '@'");
            return false;
        }
    }

    public boolean setRol(String rol) {
        if (rol.equals("docente") ){
            this.rol = rol;
            isDocente = true;
            return true;

        } else if (rol.equals("estudiante")){
            this.rol = rol;
            isDocente = false;
            return true;
        }
        else{
            return false;
        }
    }

    //Getters: mostramos los valores que establecimos previamente

    public int getDni(){
        return dni;}

    public String getRol() {
        return rol;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

}