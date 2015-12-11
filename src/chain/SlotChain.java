package chain;

public abstract class SlotChain {

	protected SlotChain proximo;
	protected IdentificadorSlot identificadorSlot;

	public SlotChain(IdentificadorSlot id) {
		proximo = null;
		identificadorSlot = id;
	}

	public void setProximo(SlotChain proximo) {
		if (proximo == null)
			this.proximo = proximo;
		else
			proximo.setProximo(proximo);
	}

	public void escolherSlot(IdentificadorSlot slot) {
		if (slotCorreto(slot))
			aceitaMoedaNesteSlot();
	}

	private boolean slotCorreto(IdentificadorSlot slot) {
		if (identificadorSlot == slot)
			return true;

		return false;
	}

	protected abstract void aceitaMoedaNesteSlot();

}
