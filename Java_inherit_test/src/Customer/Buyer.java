package Customer;

import java.util.Date;

import Store.Fruit;

public class Buyer {
    private int money;   //<-private은 외부에서 사용불가
    private Fruit item;
    private Date buyDate;
    
    public Buyer (int money) { // Buyer객체생성시 동작 할 생성자메서드
    	this.money = money;
    }
    //set , get 메서드
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Fruit getItem() {
		return item;
	}

	public void setItem(Fruit item) {
		this.item = item;
	}
	@Override 
	public String toString() {
		return ("보유머니"+ money + "원" );
	}
	////////////////////////////////////////////////////////
	02.27
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
   
    
    
    
    
    // 구매한 음료 또는 컵과일 저장 변수
}
