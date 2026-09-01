package siga;

public class DescontoConvenio implements Desconto {

    @Override
    public double aplicar(double valor) {
        return valor * 0.8;
    }
}
