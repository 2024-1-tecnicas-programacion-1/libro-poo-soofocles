package com.mycompany.libropoo;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el año de publicación del libro: ");
        int annioPublicacion = sc.nextInt();
        System.out.println("Escriba el titulo del libro: ");
        sc.nextLine();
        String titulo = sc.nextLine();
        System.out.println("Escriba el nombre del autor del libro: ");
        String autor = sc.nextLine();
        System.out.println("Indique el genero del libro: ");
        String genero = sc.nextLine();
        boolean leido = false;
        Libro libro1 = new Libro(annioPublicacion,titulo,autor,genero,leido);
        libro1.marcarLeido();
        System.out.println(libro1.mostrarInformación() + "\n" + (libro1.getLeido()==true?"El libro ya fue leido":"El libro no ha sido leido") + "\n" + (libro1.esAntiguo()==true?"Este libro es antiguo":"Este libro es de un año reciente"));
    }
}