package day10;

public class Class03 {

	public static void main(String[] args) {
		/* TV 
		 * 전원 하나로 켜지면 꺼지고, 꺼져있으면 켜지게
		 * 채널 돌리기 - 100에서 다시 1로 
		 * 볼륨 올리기 - 
		 * 
		 * */
		TV tv=new TV();
		tv.power();
		tv.power();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.volUp();
		tv.volUp();
		tv.volUp();
		tv.volUp();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		

	}

}
class TV {
	/* 멤버변수 : 
	 * 메서드 : 
	 * */
	private String name; //기본값 null
	private boolean power; //false
	private int channel; //0
	private int volume; //0
	
	//생성자
	public TV() {}
	public TV(String name) {
		this.name = name;
	}
	
	//메서드
	public void /*isPower*/power() {
		
		if(power){
			power=false;
			System.out.println("전원이 꺼졌습니다.");
			
		}else if(!power){
			power=true;
			System.out.println("전원이 켜졌습니다.");
		
		}
		
	}
	public void channelUp() {
		if(channel==100) {
			channel=0;
		}else {
		channel++;}
		System.out.println("현재채널 : "+channel);
	}
	public void channelDown() {
		if(channel==0) {
			channel=100;
		}else {channel--;}
		System.out.println("현재채널 : "+channel);
		}
	
	public void volUp() {
		if(volume==10) {
			System.out.println("더이상 볼륨을 올릴수 없습니다.");
		}else {
		volume++;
		System.out.println("현재볼륨 : "+volume);
		}
	}
	public void volDown() {
		if(volume==0) {
			System.out.println("음소거");
		}else {volume--;
		System.out.println("현재볼륨 : "+volume);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
//	public void channelUp() {
//		
//		int i = channel;
//			if(i<100) {
//				i=i+1;
//			}
//		System.out.println(i);
//	}
//	
//	public void vol() {
//
//		int v=volume+10;
//		System.out.println(v);
//	}
	
	
	
	
}