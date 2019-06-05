package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public abstract class Demonio {

    private Alma alma;
    protected int nivelMaldad;
    public List<Alma>almasCazadas;
    public List<Alma>almaAtormentada;

    public Demonio(int nivelMaldad)
    {
        this.nivelMaldad=nivelMaldad;
        this.almasCazadas=new ArrayList<>();
    }

    public abstract void caza(Alma alma);
    public abstract void atormentar(Alma alma);

    public int getNivelMaldad(){return nivelMaldad;}

    public List<Alma>getAlmasCazadas(){return almasCazadas;}

    public List<Alma>getAlmaAtormentada(){return almaAtormentada;}

    public void irACazar(Lugar lugar)
    {
        lugar.getAlmas().forEach(alma1 -> this.cazarAlma(alma));
        almasCazadas.forEach(alma->alma.almaEsCazada(lugar));
    }


    public void cazarAlma(Alma alma){
        if(getNivelMaldad()>alma.getNivelBondad())
        {
             almasCazadas.add(alma);
        }
        else this.Atormentar(alma);
    }

    public void Atormentar(Alma alma)
    {
        almaAtormentada.add(alma);
        alma.setNivelBondad(alma.getNivelBondad()-5);


    }

    public int cantAtormentadas(Alma alma)
    {
       return this.almaAtormentada.size();
    }
    public int cantCazadas(Alma alma)
    {
        return this.almasCazadas.size();
    }

    public int aumentarMaldad()
    {
      return  nivelMaldad=nivelMaldad+this.cantAtormentadas(alma)+(this.cantCazadas(alma)*2);
    }



}
