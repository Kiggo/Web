package class_ex.third;

public class ShopService {
	//μμ±μμΉ
	public static ShopService shopService = new ShopService();
	
	public ShopService() {}
	
	static ShopService getInstance() {
		return shopService;
	}
}
