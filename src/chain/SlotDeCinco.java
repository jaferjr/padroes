package chain;


public class SlotDeCinco implements SlotChain {

	SlotChain proximo = null;
	
	@Override
	public double insereNoSlot(double moeda) {
		if(moeda== 0.05){
			return 0.05;
		}else return proximo.insereNoSlot(moeda);
		
	}

	@Override
	public void setProximo(SlotChain proximo) {
		this.proximo = proximo;
	}
	

}
