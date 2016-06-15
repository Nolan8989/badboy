<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/plain; charset=utf-8"%>
<%@taglib prefix="c" uri="sxtc" %>
<chart baseFont='宋体' baseFontSize='13' unescapeLinks='0' caption='${ caption}' subcaption='${subcaption}'  bgColor='FFFFFF' bgAlpha='9' formatNumberScale='0' enableSmartLabels='1' enableRotation='0' bgRatio='0,100' bgAngle='360' showBorder='0' startingAngle='300' legendBorderAlpha  ='0' legendShadow ='0'    >  
<c:forEach items="${dataSetList}" var="list">
<c:choose>
	<c:when test="${isLink}">
		<set label='${list[0] }' value='${list[1] }' link="JavaScript:myJS('${list[0] }','${list[1] }','${list[2] }');"   />
	</c:when>
	<c:otherwise>
		<set label='${list[0] }' value='${list[1] }'   />
	</c:otherwise>
</c:choose>
</c:forEach>
</chart>