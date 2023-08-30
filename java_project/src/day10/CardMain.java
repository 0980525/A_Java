package day10;

public class CardMain {

	public static void main(String[] args) {
		CardPack cp = new CardPack();
		int index = 0;
		cp.shuffle();
		cp.init();
		for(int i=0;i<cp.getPack().length;i++) {
			cp.getPack()[i].print();
			index++;
			if(index%13==0) {
				System.out.println();
			}
		}
		System.out.println("------");
		Card tmp = cp.pick();
		tmp.print();
		System.out.println();
		System.out.println("------");
		cp.pick().print();
		
	
	}

}
