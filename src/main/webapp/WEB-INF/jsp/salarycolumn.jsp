<%--
  Created by IntelliJ IDEA.
  User: robbin
  Date: 2016/11/24
  Time: 上午9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../js/fusioncharts.js"></script>
    <script type="text/javascript" src="../js/themes/fusioncharts.theme.fint.js"></script>
    <script type="text/javascript">
        var request = new XMLHttpRequest();
        function post(postid) {
            var url="http://localhost:8080/job-portal/jobs/chart/salarycolumn?postcatid="+postid;
            request.open("GET", url);
            request.send();
            request.onreadystatechange = function () {
                if (request.readyState == 4) {
                    if (request.status == 200) {
                        var ajdate = JSON.parse(request.responseText);
                        drawchart(ajdate.data);
                    }
                }
            }
        }

            function drawchart(data){
            var revenueChart = new FusionCharts({
                "type": "column3d",
                "renderAt": "chartContainer",
                "width": "3000",
                "height": "800",
                "dataFormat": "json",
                "dataSource":{
                     "chart":{
                    "caption": "岗位薪资统计",
                            "subCaption": "by荣先生",
                            "xAxisName": "岗位",
                            "yAxisName": "薪资",
                            "theme": "fint"
                },
                "data":data
                }
            });
            revenueChart.render();
        }
    </script>
</head>
<body>
<input type="button" onclick="post('0')" value="所有" >
<input type="button" onclick="post('1')" value="技术">
<input type="button" onclick="post('2')" value="产品">
<input type="button" onclick="post('3')" value="设计">
<div id="chartContainer">FusionCharts XT will load here!</div>

</body>
</html>
