package norlando.usually.string;

public class MyStringDispose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringDispose msd = new MyStringDispose();
		String str = "  sadjfaoisfj'sdfjoiasfj'saodfoiasj'  ";
		System.out.println(str);
		System.out.println(msd.handleQuote(str));
	}
	
	/**
	* 处理字符串的单引号
	*把字符串中的单引号(')变成两个单引号('')，并去掉前后多余的空白字符
	*这是为了构造合法的sql语句
	*@param str String 要处理的字符串
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
