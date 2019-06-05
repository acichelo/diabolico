package ar.edu.unahur.obj2;
import java.awt.*;
import java.util.List;

public class Lugar {
    protected String nombre;
    private List<Alma>almas;

    public Lugar(String nombre, List<Alma>almas){
        this.nombre=nombre;
        this.almas=almas;
    }
    public String getNombre(){return nombre;}
    public List<Alma>getAlmas(){return almas;}







}
