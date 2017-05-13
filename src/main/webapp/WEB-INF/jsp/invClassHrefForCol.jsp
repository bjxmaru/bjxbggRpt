<%--
  Created by IntelliJ IDEA.
  User: bjx
  Date: 2017/4/17
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
    .datagrid-query-cond div{
        margin-right: 30px;
        margin-top:10px;
        float:left ;
    }
</style>

<div id="tr${funcTreeObj.id}">

    <a href="${pageContext.request.contextPath}${funcTreeObj.fnMapperDataUrl}Excel.do?funcTreeId=${funcTreeObj.id}" class="easyui-linkbutton"
       iconCls="icon-excel" plain="true" onclick="javascript();">导出到excel</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="console.debug($('#invClassCodePara${funcTreeObj.id}'));">测试用按钮</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>

     <div class="datagrid-query-cond">
        <form id="formPara_${funcTreeObj.id}" method="post" >
            <div >
                <label for="invClassCodePara${funcTreeObj.id}">存货类别编码:</label>
                <input id="invClassCodePara${funcTreeObj.id}" class="easyui-validatebox" type="text" name="invclasscode" data-options="required:true"
                       value="*"/>
            </div>

            <div >
                <label for="invClassNamePara${funcTreeObj.id}">存货类别名称:</label>
                <input id="invClassNamePara${funcTreeObj.id}" class="easyui-validatebox" type="text" name="invclassname" data-options="required:true"
                       value="*"/>
            </div>

            <div >
                <label for="datePara${funcTreeObj.id}">日期:</label>
                <input id="datePara${funcTreeObj.id}" class="easyui-datebox" type="text" name="datePara" data-options="required:true"/>
            </div>

            <div style="margin-top:8px" >
                <a id="btnParaQuery${funcTreeObj.id}" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'"  onclick=" var  paramObj = {'invclasscode' : $('#invClassCodePara${funcTreeObj.id}').val() ,'invclassname' :  $('#invClassNamePara${funcTreeObj.id}').val()}    ;  refleshDataGrid('formPara_${funcTreeObj.id}' , '${pageContext.request.contextPath}${funcTreeObj.fnMapperDataUrl}.do' , paramObj );">查询</a>
            </div>

        </form>
     </div>

</div>

<div style="clear:both;height:10px"></div>
<div style="">
    <table id="tbl${funcTreeObj.id}" class="easyui-datagrid"
           url="${pageContext.request.contextPath}${funcTreeObj.fnMapperDataUrl}.do?funcTreeId=${funcTreeObj.id}"
           rownumbers="true" fitColumns="true" singleSelect="true"
           pagination="true" pagePosition="bottom" pageNumber=1
           pageSize=10 pageList=[10,20,30] striped="true"
           border="true">
        <thead>
        <tr>
            <th field="pkInvcl">存货类别主键</th>
            <th field="invclasscode">存货类别编码</th>
            <th field="invclassname">存货类别名称</th>
        </tr>
        </thead>
    </table>

</div>






