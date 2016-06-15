package com.bjsxt.util;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class ChartsXml {
	
	/**
	 * 
	 * @todo ����pieͼ ������ Pie3D.swf, Pie2D.swf
	 * @param dataSetList  List �����List get(0) label  get(1)  value get(2) id
	 *            ��һ�ж�Ӧlabel �ڶ���ȡֵ
	 * @param caption
	 *            ����
	 * @param subcaption
	 *            ������
	 * @param isLink
	 *            �Ƿ��������� ��������ⲿJavaScript:myJS(a,b,c). a:category; b:seriesName;
	 *            c:datavalue; myJS('','1��','400')
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
//	dataSetList �������list(0) list(1)
//	dataSetList  ����list->>>xml---set
	public static String buildPieXml(List dataSetList, String caption,
		String subcaption, boolean isLink) {
		StringBuffer xmlData = new StringBuffer();
//		����ͷ
		xmlData.append("<chart baseFont='����' baseFontSize='13' unescapeLinks='0' caption='"
						+ caption+"' subcaption='"+subcaption
						+ "'  bgColor='FFFFFF' bgAlpha='9' formatNumberScale='0' enableSmartLabels='1' enableRotation='0' bgRatio='0,100' bgAngle='360' showBorder='0' startingAngle='300' legendBorderAlpha  ='0' legendShadow ='0'    >");

		for (int i = 0; i < dataSetList.size(); i++) {
			List list = (List) dataSetList.get(i);//������������

			String link = "";
			if (isLink){
//				link �Ƿ���ϵ������js����
				link = " link=\\\"JavaScript:myJS('" + list.get(0) + "','" + list.get(1) + "',  '"
						+ list.get(2) + "');\\\" ";
			}
			
			
//			��С��list�����ó���ƴ��setԪ��
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
		xmlData.append("<chart  baseFont='����'  showValues='0'   baseFontSize='13' unescapeLinks='0' caption='"
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

