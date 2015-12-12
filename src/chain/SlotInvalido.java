package chain;

public class SlotInvalido implements SlotChain {

	@Override
	public double insereNoSlot(double moeda) {
		System.out.println("valor invalido");
		return 0;
	}

	@Override
	public void setProximo(SlotChain proximo) {
		// TODO Auto-generated method stub
		
	}
	
	

}
