package com.mycompany.libropoo;

public class Libro {
 private int annioPublicacion;
    private String titulo;
    private String autor;
    private String genero;
    private boolean leido;
    
    public Libro(int annioPublicacion, String titulo,String autor, String genero, boolean leido){
        this.annioPublicacion = annioPublicacion;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.leido = leido;
    }
    public String mostrarInformación(){
        return ("Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + annioPublicacion + ", Género: " + genero);
    }
    public void marcarLeido(){
        leido = true;
    }
    public boolean esAntiguo(){
        return (2024 - annioPublicacion>50?true:false);
    }
    public boolean getLeido(){
        return this.leido;
    }
}
