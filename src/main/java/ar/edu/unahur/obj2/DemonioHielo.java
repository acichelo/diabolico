package ar.edu.unahur.obj2;
import java.util.List;

public class DemonioHielo extends Demonio{



    public DemonioHielo(int nivelMaldad){super(nivelMaldad);}


    @Override
    public List<Alma>getAlmasCazadas(){return this.almasCazadas;}

    @Override
    public List<Alma>getAlmaAtormentada(){return this.almasCazadas;}

    @Override
    public void caza(Alma alma)
    {
        if(getNivelMaldad()>alma.getNivelBondad() && alma.esFriolenta())
        {
             almasCazadas.add(alma);
        }else
        {
             this.atormentar(alma);
        }
    }

    @Override
    public void atormentar(Alma alma){
        alma.nivelBondad-=5;
        alma.friolenta=true;
    }

}
