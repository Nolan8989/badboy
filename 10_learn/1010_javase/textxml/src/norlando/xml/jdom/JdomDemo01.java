package norlando.xml.jdom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.jdom.xpath.XPath;


public class JdomDemo01 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		new JdomDemo01().createXML();

	}
	/**
	 * jdom创建xml;
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void createXML() throws FileNotFoundException, IOException{
		//创建节点
		Element root = new Element("resume");//这个是根节点;resumen 简历 括号里面的是元素名字。
		Element name = new Element("name");
		Element preName = new Element("prename");
		Element occupation = new Element("occupation");//occupatio 职业
		
		Attribute occtime = new Attribute("occtime","18");//标签设置属性。
		occupation.setAttribute(occtime);//把属性附加到标签上。
		
		
		//给属性添加值,两种方式。
		name.setText("nolando"); //setText只用于给元素增加文本。
		preName.addContent("imagine");//addContent：不光可以给元素增加文本，也可以增加元素，注释等等。
		occupation.setText("student");
		
		//为根节点添加元素。
		root.addContent(name);
		root.addContent(preName);
		root.addContent(occupation);
		
		//把root设置为根节点。
		Document doc = new Document(root);
		
		Format f = Format.getPrettyFormat();//得到漂亮样式。
		//Format f = Format.getCompactFormat(); // 紧凑型。
		f.setEncoding("gbk"); //设置编码。
		
		XMLOutputter xmlOut = new XMLOutputter(f);
		xmlOut.output(doc, new FileOutputStream("d:/2.xml"));
	}
	
	public  void textXPath(String filePath){
		try {
			SAXBuilder saxb = new SAXBuilder();
			Document doc =saxb.build(new FileInputStream(filePath)); //将某一个xml文件读入到doc中。
			Element root = doc.getRootElement();
			
			
			XPath xpath = XPath.newInstance("/resume/*"); //返回resume节点下面所有的子节点。
//			XPath xpath = XPath.newInstance("//preOccupation"); //返回文档中所有preOccupation节点。
//			XPath xpath = XPath.newInstance("/resume/wife//preOccupation"); //返回/resume/wife所有preOccupation节点。
//			XPath xpath = XPath.newInstance("/resume/wife/preOccupation");   //返回/resume/wife/preOccupation这个节点。
//			XPath xpath = XPath.newInstance("/resume/wife/preOccupation[@period]");  //返回名字为preOccupation有属性peroid的节点。

//			XPath xpath = XPath.newInstance("//preOccupation[@period]");  //返回文档中所有preOccupation节点，并且有属性period
//			XPath xpath = XPath.newInstance("/resume/wife/preOccupation[@period='5-18']");  //返回名字为preOccupation属性peroid='5-18'的节点。
//			XPath xpath = XPath.newInstance("//preOccupation[text()='皇子']");  //返回文档中所有preOccupation节点，并且文本内容为皇子。
			
			List list = xpath.selectNodes(root);
			for (int i = 0; i < list.size(); i++) {
				Element e = (Element)list.get(i);
				System.out.println(e.getText());
			}
			
//			Element e2 =(Element) xpath.selectSingleNode(root);
//			System.out.println(e2.getText());

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
