package nolan.usuallyclass.string;

public class MyStringDispose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringDispose msd = new MyStringDispose();
		String str = "  sadjfaoisfj'sdfjoiasfj'saodfoiasj'  ";
		System.out.println(str);
		System.out.println(msd.handleQuote(str));
	}
	
	/**
	* �����ַ����ĵ�����
	*���ַ����еĵ�����(')�������������('')����ȥ��ǰ�����Ŀհ��ַ�
	*����Ϊ�˹���Ϸ���sql���
	*@param str String Ҫ������ַ���
	*@throws PortletException
	*@throws IOException
	*/
	private String handleQuote(String str){
		if(str==null){
			str="";
		}else{
			char c;
			StringBuffer strb=new StringBuffer("");
			for(int i=0; i<str.length();i++) {
				c=str.charAt(i);
				strb.append(c);
				if(c=='\'')
				strb.append("'");
			}
			str=strb.toString();
		}
		return str.trim();
	}


}
