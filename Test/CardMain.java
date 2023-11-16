package Test;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardPack2 cp = new CardPack2();
		int index = 0;
		cp.shuffle();
		for(int i=0; i<cp.getPack().length; i++) {
			cp.getPack()[i].toString();
			index++;
			if(index % 13==0) {
				System.out.println();
			}
		}
	}
}
	


