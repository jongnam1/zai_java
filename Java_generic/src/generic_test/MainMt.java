package generic_test;

public class MainMt {

	public static void main(String[] args) {
			
		
        SnackBox<포스틱> 박스1 = new SnackBox<>();
        박스1.makeBox(new 포스틱("포스틱",1500));
        
        Snack 포스틱2 = new 포스틱("포스틱", 1700);
        
        SnackBox<Snack> 박스2 = new SnackBox<>();
        박스2.makeBox((포스틱)포스틱2);
        
        Snack[] 과자배열 = new Snack[] {
        		new 예감("예감", 1300), new 매운새우깡("매운새우깡",1400),
        		new 매운새우깡("매운새우깡", 1500)
        };
        
        
        SnackBox<Snack> 박스3 = new SnackBox<>();
        박스3.makeBox(과자배열[0]);
        
        SnackBox<Snack> 박스4 = new SnackBox<>();
        박스4.makeBox(과자배열[1]);
        
        SnackBox<Snack> 박스5 = new SnackBox<>();
        박스5.makeBox(과자배열[2]);
        
        
//        SnackBox<Snack>[] a = new SnackBox[3];
//        a[0] = new SnackBox<Snack>();
        
        
        
        
        //제네릭 사용하는 곳에서 배열사용불가
	}
	
}
