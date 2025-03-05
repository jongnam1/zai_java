package generic2;

public class Makgeolli extends Alcohol{

	public Makgeolli(String name, String cmp, int abv) {
		super(name,cmp,abv);
	
	}
	@Override
	public String toString() {
		return "소주 :"+cmp + ", "+name
				+", 도수 : "+abv + "%";
	}
}
