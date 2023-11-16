package Test;

public class Card2 {

	class Card{
		private char shape; 
		private int num; 
		
		
		
		
		public Card() {
			shape = '♥';
			num = 1;
		}
		
		
		public void print() {
			System.out.print(shape);
			switch(num) {
			case 11: System.out.print("J ");
				break;
			case 12: System.out.print("Q ");
				break;
			case 13: System.out.print("K ");
				break;
				default:
					System.out.print(num+" ");
			}
		}

		public char getShape() {
			return shape;
		}

		public void setShape(char shape) {
			switch(shape) {
			case '♥': case '♣': case '♠': case '◆':
				this.shape = shape;
			break;
			default:
				this.shape='♥';
			}
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			if(num < 1 || num > 13) {
				this.num = 1;
			}else {
				this.num = num;			
			}
		}
	}
}
