package nolan.socket;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL:指向了互联网上的一个资源！包含了这个资源的地址！ URL对象封装了一个网络地址，以及跟这个网络地址相关的操作！
 * 
 */
public class TestURL {
	public static void main(String[] args) throws MalformedURLException {
		// URL u = new URL("http://www.baidu.com:80/index.html?cansu=bjsxt");
		// System.out.println("获取与此url关联的协议的默认端口："+u.getDefaultPort());
		// System.out.println("getFile:"+u.getFile()); //端口号后面的内容
		// System.out.println("主机名："+u.getHost()); //www.google.cn
		// System.out.println("路径："+u.getPath()); //端口号后，参数前的内容
		// System.out.println("端口："+u.getPort()); //存在返回80.否则返回-1
		// System.out.println("协议："+u.getProtocol());
		// System.out.println("参数部分："+u.getQuery());

		URL u = new URL("http://www.abc.com/aa/");
		URL u2 = new URL(u, "2.html"); // 相对路径构建url对象
		System.out.println(u2.toString()); // http://www.abc.com/aa/2.html
		basicSpider();
	}

	/**
	 * 一个简单的网络爬虫程序
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
				// 将网络内容下载到本地。然后进行数据分析，建立索引,这也是搜索引擎的第一步。
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
