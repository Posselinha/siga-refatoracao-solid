package siga;

public class DescontoBolsista implements Desconto {

    @Override
    public double aplicar(double valor) {
        return valor * 0.5;
    }
}
