package ar.edu.unahur.obj2;

public class LuchaMarcial extends Alma {

    public LuchaMarcial(int nivelBondad, int nivelValor, boolean friolenta, boolean atormentada)
    {
        super(nivelBondad,nivelValor,friolenta,atormentada);
    }

    @Override
    public int nivelValor() {
        return super.nivelValor()*2;
    }
}
