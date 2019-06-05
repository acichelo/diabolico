package ar.edu.unahur.obj2;

public class Supervivencia extends Alma {
    public Supervivencia(int nivelBondad, int nivelValor, boolean friolenta, boolean atormentada)
    {
        super(nivelBondad,nivelValor,friolenta,atormentada);
    }

    @Override
    public boolean esFriolenta() {
        return false;
    }
}
