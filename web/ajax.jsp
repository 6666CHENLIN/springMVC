<%--
  Created by IntelliJ IDEA.
  User: ASA
  Date: 2020/4/7
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--  发起ajax请求 --%>
    <%--<script type="text/javascript" src="jquery-1.8.3.js"></script>--%>
    <script src="http://code.jquery.com/jquery-2.1.4.min.js" ></script>

    <script type="text/javascript">
        function f1(){
            // type :请求方式  dataType: 参数类型
            //contextType: 请求正文类型 application/json;charset=utf-8
            $.ajax({
                url:'${pageContext.request.contextPath}/studentControllerPage2/getData2',
                type:'POST',
                contextType:'applicationl/json;charset=utf-8',
                success:function (a) {
                    // alert("成功！ 得到的参数为:"+a)

                    //  1 响应对象  直接对象，属性
                    // alert("响应对象"+a+"------"+a.id+a.username)

                    //2 响应集合  需要遍历
                    // $(a).each(function (index,element) {
                    //     alert("遍历："+element+"-----"+element.id,element.username);
                    //
                    // })

                    // 3 响应json
                    var json=$.parseJSON(a);
                    alert("json"+json+"---------"+json.id+json.username);
                },
                error:function (a) {
                    alert("失败！"+a)

                }
            })
        }
    </script>


</head>
<body>


<p onclick="f1();">点我响应数据</p>


</body>
</html>
