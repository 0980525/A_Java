package day10;

public class Class04 {

	public static void main(String[] args) {
		/* Card 클래스 생성
		 * 포커카드
		 * 
		 * */
		Card c = new Card();
		c.print();

	}

}
/* Card 클래스 구성 
 * 멤버변수 : 모양(4가지♥♣♠◆)
 * 숫자(1~10 J=11 Q=12 K=13)
 * 생성자 : 하트1(♥1) 
 * 
 * 모양과 숫자가 들어올수 없는 값이 들어오면 무조건 ♥1값 출력
 * */
 class Card {
	 private char shape; //모양
	 private int num; //숫자
	 
	 //생성자
	 public Card() {
		shape='♥';
		num = 1;		 
	 }
	 
	 public void print() { //(값은 숫자로 화면에 찍을때는 바꿔서 )
		 System.out.print(shape);
		 switch(num) {
		 case 11 : System.out.print("J ");
		 break;
		 case 12 : System.out.print("Q ");
		 break;
		 case 13 : System.out.print("K ");
		 break;
		 default : System.out.print(num+" ");
		 }
	 }

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥':case'♣':case'♠':case'◆':
		this.shape = shape;
		break;
		default : this.shape = '♥';
		}
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		
		if(num<1||num >13) {
			this.num = 1;
		}else {
			this.num = num;
		}

		}
		
	}
	 
	 
 