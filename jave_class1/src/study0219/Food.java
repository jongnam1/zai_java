package study0219;

public class Food {
     String foodName; //음식이름
     int cost; //가격
     int kal; //칼로리
     
     Food(){} //<- 이거 작성해야 Food f2 = new Food(); 이게 작동됨, 객체를 2가지 방식으로 만들려면 작성해야딤
     Food(String foodName, int cost){
    	 this.foodName = foodName;
    	 this.cost = cost;
    	 
     }
     
}







