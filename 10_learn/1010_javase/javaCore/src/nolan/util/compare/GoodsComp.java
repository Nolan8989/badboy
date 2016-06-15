package nolan.util.compare;

import java.util.Comparator;

public class GoodsComp implements Comparator<Goods> {
	//���� ����������ͬ ���۸���
	@Override
	public int compare(Goods o1, Goods o2) {
		int result =0;
		if(o1.getName().equals(o2.getName())){ //���
			//����
			result =o1.getPrice()>o2.getPrice()?1:(o1.getPrice()==o2.getPrice()?0:-1);
			//����
			result =-result;
		}else{
			//���� ����
			result =o1.getName().compareTo(o2.getName());
		}
		
		return result;
		
		
	} 

}
