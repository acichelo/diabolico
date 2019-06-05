package ar.edu.unahur.obj2;

import com.sun.org.apache.xpath.internal.operations.Equals;

public abstract class Alma {
    protected int nivelBondad;
    protected int nivelValor;
    protected boolean friolenta=false;
    protected boolean atormentada=false;

    public Alma(int nivelBondad, int nivelValor, boolean friolenta, boolean atormentada){
        this.nivelBondad=nivelBondad;
        this.nivelValor=nivelValor;
        this.friolenta=friolenta;
        this.atormentada=atormentada;
    }

    public int getNivelBondad(){return nivelBondad;}

    public  int getNivelValor(){return nivelValor;}

    public boolean getFriolenta(){return friolenta;}

    public boolean getAtormentada(){return atormentada;}

    public void setFriolenta(boolean friolenta){this.friolenta=friolenta;}
    public void setNivelBondad(int nivelBondad){this.nivelBondad=nivelBondad;}
    public void setnivelValor(int nivelValor){this.nivelValor=nivelValor;}
    public boolean esFriolenta(){return true;}



    public void esAtormentada(Demonio demonio){}
    public void almaEsCazada(Lugar lugar){}

    public int nivelValor(){return nivelValor;}








}
