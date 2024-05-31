import javax.sound.midi.Sequence;

public class ContaConrrente extends Conta {

    public ContaConrrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("++++++Extrato Conta Corrente+++++++");
        super.imprimirInfComuns();
    }


}

