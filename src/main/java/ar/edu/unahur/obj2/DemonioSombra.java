package ar.edu.unahur.obj2;
import java.util.List;

public class DemonioSombra extends Demonio{

    public DemonioSombra(int nivelMaldad){super(nivelMaldad);}

    @Override
    public List<Alma>getAlmasCazadas(){return this.almasCazadas;}

    @Override
    public List<Alma>getAlmaAtormentada(){return this.almasCazadas;}

    @Override
    public void caza(Alma alma)
    {
        if(getNivelMaldad()>alma.getNivelBondad() && alma.getNivelValor()<50)
        {
             this.almasCazadas.add(alma);

        }
        else
        {
             this.atormentar(alma);
        }
    }

    @Override
    public void atormentar(Alma alma){
        alma.setnivelValor(alma.getNivelValor()/2);
    }





}
