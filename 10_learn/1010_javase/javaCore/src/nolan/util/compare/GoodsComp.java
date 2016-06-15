package nolan.util.compare;

import java.util.Comparator;

public class GoodsComp implements Comparator<Goods> {
	//名称 升序，名称相同 按价格降序
	@Override
	public int compare(Goods o1, Goods o2) {
		int result =0;
		if(o1.getName().equals(o2.getName())){ //相等
			//升序
			result =o1.getPrice()>o2.getPrice()?1:(o1.getPrice()==o2.getPrice()?0:-1);
			//降序
			result =-result;
		}else{
			//名称 升序
			result =o1.getName().compareTo(o2.getName());
		}
		
		return result;
		
		
	} 

}
