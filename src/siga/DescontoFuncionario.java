package siga;

public class DescontoFuncionario implements Desconto {

    @Override
    public double aplicar(double valor) {
        return valor * 0.7;
    }
}
