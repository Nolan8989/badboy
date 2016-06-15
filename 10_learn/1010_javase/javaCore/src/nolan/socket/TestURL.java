package nolan.socket;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL:ָ���˻������ϵ�һ����Դ�������������Դ�ĵ�ַ�� URL�����װ��һ�������ַ���Լ�����������ַ��صĲ�����
 * 
 */
public class TestURL {
	public static void main(String[] args) throws MalformedURLException {
		// URL u = new URL("http://www.baidu.com:80/index.html?cansu=bjsxt");
		// System.out.println("��ȡ���url������Э���Ĭ�϶˿ڣ�"+u.getDefaultPort());
		// System.out.println("getFile:"+u.getFile()); //�˿ںź��������
		// System.out.println("��������"+u.getHost()); //www.google.cn
		// System.out.println("·����"+u.getPath()); //�˿ںź󣬲���ǰ������
		// System.out.println("�˿ڣ�"+u.getPort()); //���ڷ���80.���򷵻�-1
		// System.out.println("Э�飺"+u.getProtocol());
		// System.out.println("�������֣�"+u.getQuery());

		URL u = new URL("http://www.abc.com/aa/");
		URL u2 = new URL(u, "2.html"); // ���·������url����
		System.out.println(u2.toString()); // http://www.abc.com/aa/2.html
		basicSpider();
	}

	/**
	 * һ���򵥵������������
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	static void basicSpider(){
		URL url = null;
		InputStream is = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		String temp = "";
		try {			
			url = new URL("http://www.baidu.com");
			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is));
			while ((temp = br.readLine()) != null) {
				// �������������ص����ء�Ȼ��������ݷ�������������,��Ҳ����������ĵ�һ����
				sb.append(temp);
			}
			System.out.println(sb);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(is!=null){
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
