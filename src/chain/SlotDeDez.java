package chain;

public class SlotDeDez implements SlotChain {

	private SlotChain proximo;

	@Override
	public double insereNoSlot(double moeda) {
		if (moeda == 0.10){
			return 0.10;
		}else
			return proximo.insereNoSlot(moeda);
	}

	@Override
	public void setProximo(SlotChain proximo) {
		this.proximo = proximo;

	}

}
