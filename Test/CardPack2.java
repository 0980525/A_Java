package Test;

public class CardPack2 {
		
	
	
		private Card2[] pack = new Card2[52];
		private int cnt = 0;  
		
		
		public CardPack2() {
			
			char shape='♥';
			for(int i=1; i<=4; i++) {
				switch(i) {
				case 1: shape='♥'; break;
				case 2: shape='♣'; break;
				case 3: shape='♠'; break;
				case 4: shape='◆'; break;
				}
				for(int j=1; j<=13; j++) { 
					Card2 c = new Card2(); 
					c.setShape(shape);
					c.setNum(j);
					pack[cnt] = c;
					cnt++;
				}
			}
			
		}

		public void shuffle() {
			for(int i=0; i<pack.length;i++) {
				int index = (int)(Math.random()*52)+0;
				Card2 tmp = pack[i]; 
				pack[i] = pack[index];
				pack[index] = tmp;
			}
		}
		
		public Card2 pick() {
			if(cnt==0) {
				return null;
			}
			cnt--;
			return pack[cnt]; //52
		}
		
		
		public void init() {
			cnt = 52;
		}
		
		
		public Card2[] getPack() {
			return pack;
		}

		public void setPack(Card2[] pack) {
			this.pack = pack;
		}

		public int getCnt() {
			return cnt;
		}

		public void setCnt(int cnt) {
			this.cnt = cnt;
		}
	}


	

