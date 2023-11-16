package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Word.Word;

public class StreamEx01 {

	
	public static void main(String[] args) {
		/* 여행상품이 있습니다.
		 * 여행비용은 15세 이상은 100만원 , 15세 미만은 50만원
		 * 고객 3명이 패키지여행을 떠나려고할때 
		 * 1.여행 비용계산
		 * 2.고객 명단 출력
		 * 
		 * 고객은 class 생성, ArrayList로 고객 3명 추가
		 * 고객 정보 
		 * 이름 : 이순신 , 나이 : 40 , 비용 : 100만원
		 * 이름 : 김순이 , 나이 : 35 , 비용 : 100만원
		 * 이름 : 이아들 , 나이 : 10 , 비용 : 50만원
		 * 총 여행 경비 250만원
		 */
		ArrayList<Customer> cus = new ArrayList<>();
		cus.add(new Customer("이순신", 40));
		cus.add(new Customer("김순이", 35));
		cus.add(new Customer("이아들", 10)); //여ㅓ기서 비용 입력받는게 아니라 밑에 생성자에서 변경해서 나이에따라 값이 나올수있게 해주기
		cus.add(new Customer("박서진", 20));
		cus.add(new Customer("나유진", 9));
		int moneySum = cus.stream()
				.mapToInt(t->t.getMoney()) //점수의 자료형 변환
				.sum();
		
		cus.stream().forEach(System.out::println); //고객 명단 출력 //toString사용
	
		cus.stream().forEach(n->{
			String name = n.getName();
			int age = n.getAge();
			int money = n.getMoney();
			int cnt = n.getcnt();
			System.out.print(cnt+". 이름 : "+name+", 나이 : "+age+", 경비 : "+money+" 만원");
			System.out.println();
			
		});
		System.out.println("총 여행 경비 : "+moneySum+" 만원"); //여행비용계산
		
		//20세 이상 성인만 이름을 정렬하여 출력
		
		cus.stream()
			.filter(n->n.getAge()>=20)
			.sorted() //정렬
			.forEach(n->{
				String name = n.getName();
				int age = n.getAge();
				int money = n.getMoney();
//				int cnt = n.getcnt(); 이걸 쓰면 4.5.로 나옴
				System.out.println("이름 : "+name+", 나이 : "+age+", 경비 : "+money+" 만원");
			});
		
	}

}//stream 은 안에있는것만 쓸수있다 밖에 새로 변수만들어도 쓸수없음
/* 정렬 .sorted 을 하기위해 클래스에 implements Comparable<Customer>를 넣어주고 이걸 add해준 다음에 나오는 
 * compareTo(Customer o) {return this.name.compareTo(o.name);}이렇게 리턴값을 변경해줘야함
 */
class Customer implements Comparable<Customer>{ 
	private String name;
	private int age;
	private int money;
	private static int cnt=1;
	
	public Customer() {}
	public Customer(String name,int age/*,int money필요없움 밑에 this로 나이 구분해서 출력해줌 */) {
		this.name=name;
		this.age =age;
		this.money=(age<=15)?50:100;
	}
	
	public int getcnt() {
		return cnt++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 비용 : " + money+" 만원 ";
	}
	@Override
	public int compareTo(Customer o) {
		
		return this.name.compareTo(o.name);
	}
	
	for(/*배열의 타입*/ String /*임시변수*/a:b/*배열*/) {
		/*실행문*/String a=
		/*조건*/if(a==)
	}
}