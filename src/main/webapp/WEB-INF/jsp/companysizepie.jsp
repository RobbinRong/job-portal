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
            var url="http://localhost:8080/job-portal/jobs/chart/companysizepie?postId=python";
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
                "type": "pie3d",
                "renderAt": "chartContainer",
                "width": "500",
                "height": "500",
                "dataFormat": "json",
                "dataSource":{
                    "chart": {
                        "caption": "公司规模分析饼图",
                        "subCaption": "by荣先生",
                        "paletteColors": "#0075c2,#1aaf5d,#f2c500,#f45b00,#8e0000",
                        "bgColor": "#ffffff",
                        "showBorder": "0",
                        "use3DLighting": "0",
                        "showShadow": "0",
                        "enableSmartLabels": "0",
                        "startingAngle": "0",
                        "showPercentValues": "1",
                        "showPercentInTooltip": "0",
                        "decimals": "1",
                        "captionFontSize": "14",
                        "subcaptionFontSize": "14",
                        "subcaptionFontBold": "0",
                        "toolTipColor": "#ffffff",
                        "toolTipBorderThickness": "0",
                        "toolTipBgColor": "#000000",
                        "toolTipBgAlpha": "80",
                        "toolTipBorderRadius": "2",
                        "toolTipPadding": "5",
                        "showHoverEffect": "1",
                        "showLegend": "1",
                        "legendBgColor": "#ffffff",
                        "legendBorderAlpha": "0",
                        "legendShadow": "0",
                        "legendItemFontSize": "10",
                        "legendItemFontColor": "#666666",
                        "useDataPlotColorForLabels": "1"
                    },
                    "data":data
                }
            });
                revenueChart.addEventListener("Exported", function (evt, args) {
                    alert(args.DOMId + (args.statusCode ? " 图表已经导出" : "图表不能够被导出"));
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
