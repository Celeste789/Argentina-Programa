package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.management.ConstructorParameters;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

@Getter
@Setter
@ToString
public class Persona {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    public static void personas(){
        int seguirAgregando = 1;
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (seguirAgregando != -1) {
            Persona persona = new Persona();
            System.out.println("Igrese nombre");
            String nombre = scanner.next();
            System.out.println("Ingrese apellido");
            String apellido = scanner.next();
            System.out.println("Ingrese fecha de nacimiento");
            String fechaDeNacimiento = scanner.next();
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setFechaNacimiento(fechaDeNacimiento);
            personas.add(persona);
            System.out.println("Si no quiere seguir ingresando, marque -1, si no, siga agregando");
            seguirAgregando = scanner.nextInt();
        }
        System.out.println("Quiere ver la lista de personas?");
        boolean mostrar = scanner.hasNext();
        if (mostrar) {
            for (Persona persona : personas){
                System.out.println(persona.toString());
            }
        }
    }
}
