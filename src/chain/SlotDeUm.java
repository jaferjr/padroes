package chain;

public class SlotDeUm implements SlotChain {
	private SlotChain proximo;

	@Override
	public double insereNoSlot(double moeda) {

		if (moeda == 0.01) {
			return 0.01;
		} else {
			return proximo.insereNoSlot(moeda);
		}
	}

	@Override
	public void setProximo(SlotChain proximo) {

		this.proximo = proximo;
	}

}
