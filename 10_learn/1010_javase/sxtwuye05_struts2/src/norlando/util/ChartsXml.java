package norlando.util;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class ChartsXml {
	
	/**
	 * 
	 * @todo 构建pie图 适用于 Pie3D.swf, Pie2D.swf
	 * @param dataSetList  List 里面放List get(0) label  get(1)  value get(2) id
	 *            第一列对应label 第二列取值
	 * @param caption
	 *            标题
	 * @param subcaption
	 *            副标题
	 * @param isLink
	 *            是否增加链接 是则调用外部JavaScript:myJS(a,b,c). a:category; b:seriesName;
	 *            c:datavalue; myJS('','1级','400')
	 * @return
	 */
	
/*	<chart palette='4' decimals='0' enableSmartLabels='1' enableRotation='0' bgColor='99CCFF,FFFFFF' bgAlpha='40,100' bgRatio='0,100' bgAngle='360' showBorder='1' startingAngle='70' >
    <set label='France' value='17'  />
    <set label='India' value='12' link=\"JavaScript:myJS(1,2,3)\" />
    <set label='Brazil' value='18' />
    <set label='USA' value='8' isSliced='1'/>
    <set label='Australia' value='10' isSliced='1'/>
    <set label='Japan' value='16' isSliced='1'/>
    <set label='England' value='11' />
    <set label='Nigeria' value='12' />
		 <set label='Italy' value='8' />
    <set label='China' value='10' />
    <set label='Canada' value='19'/>
    <set label='Germany' value='15'/>
</chart>*/
//	dataSetList 里面放了list(0) list(1)
//	dataSetList  里面list->>>xml---set
	public static String buildPieXml(List dataSetList, String caption,String subcaption, boolean isLink) {
		StringBuffer xmlData = new StringBuffer();
//		数据头
		xmlData.append("<chart baseFont='宋体' baseFontSize='13' unescapeLinks='0' caption='"
						+ caption+"' subcaption='"+subcaption
						+ "'  bgColor='FFFFFF' bgAlpha='9' formatNumberScale='0' enableSmartLabels='1' enableRotation='0' bgRatio='0,100' bgAngle='360' showBorder='0' startingAngle='300' legendBorderAlpha  ='0' legendShadow ='0'    >");

		for (int i = 0; i < dataSetList.size(); i++) {
			List list = (List) dataSetList.get(i);//放了三个数据

			String link = "";
			if (isLink){
//				link 是否加上点击触发js函数
				link = " link=\\\"JavaScript:myJS('" + list.get(0) + "','" + list.get(1) + "',  '"
						+ list.get(2) + "');\\\" ";
			}
			
			
//			把小的list数据拿出来拼成set元素
			xmlData.append("<set    label='" + list.get(0)
					+ "' value='" + list.get(1) + "'  " + link + "/>");
		}
		
		
		xmlData.append("<styles><definition><style name='CaptionFont' type='font' size='12'/></definition><application><apply toObject='CAPTION' styles='CaptionFont' /></application></styles>");
		xmlData.append("</chart>");

		return xmlData.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String buildXml(List dataSetList, String caption,
		String subcaption,String xAxisName,String yAxisName, boolean isLink) {
		StringBuffer xmlData = new StringBuffer();
		xmlData.append("<chart  baseFont='宋体'  showValues='0'   baseFontSize='13' unescapeLinks='0' caption='"
				+ caption+"' subcaption='"+subcaption
				+ "' xAxisName='"
				+ xAxisName
				+ "' yAxisName= '"
				+ yAxisName
				+ "'  bgColor='FFFFFF' bgAlpha='9' formatNumberScale='0' enableSmartLabels='1' enableRotation='0' bgRatio='0,100' bgAngle='360' showBorder='0' startingAngle='300' legendBorderAlpha  ='0' legendShadow ='0'    >");
		
		for (int i = 0; i < dataSetList.size(); i++) {
			List list = (List) dataSetList.get(i);
			
			String link = "";
			if (isLink){
					link = " link=\\\"JavaScript:myJS('" + list.get(0) + "','" + list.get(2) + "',  '"
					+ list.get(1) + "');\\\" ";
			}
				xmlData.append("<set   label='" + list.get(0)
				+ "' value='" + list.get(1) + "'  " + link + "/>");
		}
		xmlData.append("<styles><definition><style name='CaptionFont' type='font' size='12'/></definition><application><apply toObject='CAPTION' styles='CaptionFont' /></application></styles>");
//		xmlData.append("<styles><definition><style name='CaptionFont' type='font' size='12'/><style name='dataLableFont' type='font' size='9' /></definition><application><apply toObject='CAPTION' styles='CaptionFont' /><apply toObject='DataLabels' styles='dataLableFont' /><apply toObject='Legend' styles='dataLableFont' /></application></styles>");
		xmlData.append("</chart>");
		
		return xmlData.toString();
	}


}

