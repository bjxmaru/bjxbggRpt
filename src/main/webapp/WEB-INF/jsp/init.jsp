<%--
  Created by IntelliJ IDEA.
  User: bjx
  Date: 2017/4/17
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html  lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <title>报表附注</title>
    <script src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
    <script src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon"/>

    <script>

        function refleshDataGrid(formQueryParamId , formUrl , paramObj ) {

            //console.debug(paramObj);

            var funcTreeId = formQueryParamId.split("_")[1];

          /*  $("#" + formQueryParamId).form(
                 'submit'  ,
                 {
                         url: formUrl,
                         success:function (data) {

                                     alert("a");

                         }
                 }
             );*/

           // $("#tbl" + funcTreeId).datagrid({queryParams: paramObj}) ;

            $("#tbl" + funcTreeId).datagrid("load",paramObj);

        }
    </script>
</head>
<body class="easyui-layout">
<div data-options="region:'north',title:'集团报表附注系统',split:true ,collapsible:false,minHeight:'60px',maxHeight:'60px' " >
    <div style="margin-bottom: 0;">
        <a id="btnExcel" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-excel'" style="float:right;margin-right:10px">导出到EXCEL</a>
        <a id="btnSearch" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="float:right;margin-right:10px">搜索</a>
    </div>

</div>
<div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>
<div data-options="region:'east',title:'East',split:true" style="width:100px;"></div>
<div data-options="region:'west',title:'功能菜单',split:true" style="width:200px;">
    <ul id="func_tree"></ul>
</div>
<div data-options="region:'center',title:'报表功能面板'" style="padding:0px;background:#eee;">
    <div id="central_panel" class="easyui-tabs" data-options="fit:true" ></div>
</div>

<script>

    var currFuncTreeNode  = null;

    var contextPath = "${pageContext.request.contextPath}";

    var loadTabHrefJspDisp = contextPath + "/initRptCtr/tabHrefJspDisp.do?funcTreeId=" ;

    $(function () {
            initTree();
        }
    )


    //定义加载功能树的函数
    function initTree() {
        $('#func_tree').tree({
            url: contextPath + "/initRptCtr/loadFuncTreeData.do?timer=" + new Date().getTime(),
            formatter: function (node) {
                return node.text;
            },
            onClick: treeOnClick

        });
    }

    //定义树的叶子节点被被点击时候的，触发的处理程序
    function treeOnClick(node) {


        if (node.state == "closed") {

            return;
        }

        if (node.state == "open" && node.children != null  && node.children.length > 0) {

            return;
        }

        var tmpTab = $("#central_panel").tabs("getTab", node.text);

        if (tmpTab !== null) {

            $("#central_panel").tabs("select", node.text);

        } else {

            loadGrid(node) ;

        }


    }


    //定义加载 datagrid的函数
    function loadGrid(funcTreeNode) {

        currFuncTreeNode = funcTreeNode ;

        $("#central_panel").tabs(
            "add" , {
                "id": funcTreeNode.id + "tab",
                "title": funcTreeNode.text,
                "href": loadTabHrefJspDisp + funcTreeNode.id + "&timer=" + new Date().getTime(),
                "closable": true
            }

        ) ;

    }


    function  exportToExcel(urlAddress) {

    }


</script>


</body>




</html>
