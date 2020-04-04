package foodmanager;

import java.io.Serializable;

public class Food implements Serializable{

	private static final long serialVersionUID = -5123103900504088672L;
	
	public String name;
	int cnt;
	int expire;


	
	public Food() {
		
	}
	
	public Food(String name, int cnt, int expire) {
		this.name = name;
		this.cnt = cnt;
		this.expire = expire;
	}

}