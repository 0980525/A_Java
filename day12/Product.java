package day12;

public class Product {
	/* product class 생성 
	 * 메뉴이름, 가격
	 * -메뉴추가 메서드
	 * menu : 39490원 출력
	 * -메인 별도 product main class 생성
	 * 배열을 이용하여 10개의 배열을 생성
	 * 
	 * 상품 등록후 상품리스트 출력
	 * "상품을 등록하시겠습니까?"
	 * Y-등록 / N-취소
	 * 상품이름과 가격을 등록받아 배열에 등록
	 * N=>등록된 제품 리스트 출력
	 * -출력메서드
	 * 
	 */
	private String product;
	private int price;
	
	public Product() {}
	public Product(String product,int price) { //생성자
		this.product=product;
		this.price=price;
	}
	
	
	
	
	
}
