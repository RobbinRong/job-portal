<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/29
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <script type="text/javascript" src="../js/fusioncharts.js"></script>
  <script type="text/javascript" src="../js/themes/fusioncharts.theme.fint.js"></script>
  <script type="text/javascript">
    var request = new XMLHttpRequest();
    function post(postid) {
      var url="http://localhost:8080/job-portal/jobs/chart/citycountline?postids=21,22,23,33,44";
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
         var fusioncharts = new FusionCharts({
                  type: 'msline',
                  renderAt: 'chart-container',
                  width: '1000',
                  height: '300',
                  dataFormat: 'json',
                  dataSource:{
                      "chart": {
                          "caption": "岗位数量地域分析",
                          "subCaption": "by 荣先生",
                          "captionFontSize": "14",
                          "subcaptionFontSize": "14",
                          "subcaptionFontBold": "0",
                          "paletteColors": "#0075c2,#1aaf5d,#FF1493,#8B0000,#EE0000,#EEC900",
                          "bgcolor": "#ffffff",
                          "showBorder": "0",
                          "showShadow": "1",
                          "showCanvasBorder": "0",
                          "usePlotGradientColor": "0",
                          "legendBorderAlpha": "0",
                          "legendShadow": "0",
                          "showAxisLines": "0",
                          "showAlternateHGridColor": "0",
                          "divlineThickness": "1",
                          "divLineIsDashed": "1",
                          "divLineDashLen": "1",
                          "divLineGapLen": "1",
                          "xAxisName": "城市",
                          "showValues": "0"
                      },
                      "categories": [{
                          "category": [{
                              "label": "北京"
                          }, {
                              "label": "上海"
                          }, {
                              "label": "广州"
                          },  {
                              "label": "深圳"
                          }, {
                              "label": "杭州"
                          }, {
                              "label": "厦门"
                          }, {
                              "label": "成都"
                          }, {
                              "label": "南京"
                          }, {
                              "label": "武汉"
                          }, {
                              "label": "西安"
                          }, {
                              "label": "长沙"
                          }, {
                              "label": "苏州"
                          }]
                      }],
                      "dataset":data.dataset
                  }
              }
      );
      fusioncharts.render();
    };
  </script>
</head>
<body>
<input type="button" onclick="post('0')" value="所有" >
<div id="chart-container">FusionCharts XT will load here!</div>
</body>
</html>
