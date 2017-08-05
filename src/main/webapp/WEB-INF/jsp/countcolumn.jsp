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
    <script src="../js/jquery-2.1.0.min.js"></script>
    <script src="../js/jBox.min.js"></script>
    <script src="../js/echart.js"></script>
    <link href="../css/jBox.css" rel="stylesheet">
    <link href="../css/button.css" rel="stylesheet">
    <script type="text/javascript">
        var ip_addr = document.location.hostname;

        function postCountColumn() {
            var request = new XMLHttpRequest();
            var positionid = document.getElementById("positionid");
            var url = "http://"+ip_addr+":8080/job-portal/jobs/chart/countcolumn?postcatid=" + positionid.value;
            request.open("GET", url);
            request.send();
            request.onreadystatechange = function () {
                if (request.readyState == 4) {
                    if (request.status == 200) {
                        var ajdate = JSON.parse(request.responseText);
                        var width;
                        var length = ajdate.data.length;
                        if (length > 100) {
                            width = 3000;
                        } else if (length < 100 && length > 20) {
                            width = 2000;
                        }
                        else if (length < 20) {
                            width = 1000;
                        }
                        drawCountColumnchart(ajdate.data, width);
                    }
                }
            }
        }
        function postCompanySize() {
            var positionid = document.getElementById("positionid");
            var request = new XMLHttpRequest();
            var url = "http://"+ip_addr+":8080/job-portal/jobs/chart/companysizepie?postId=" + positionid.value;
            request.open("GET", url);
            request.send();
            request.onreadystatechange = function () {
                if (request.readyState == 4) {
                    if (request.status == 200) {
                        var ajdate = JSON.parse(request.responseText);
                        drawCompanySizechart(ajdate.data);
                    }
                }
            }
        }
        function postCompanyField() {
            var request = new XMLHttpRequest();
            var positionid = document.getElementById("positionid");
            var url = "http://"+ip_addr+":8080/job-portal/jobs/chart/fieldpie?post=" + positionid.value;
            request.open("GET", url);
            request.send();
            request.onreadystatechange = function () {
                if (request.readyState == 4) {
                    if (request.status == 200) {
                        var ajdate = JSON.parse(request.responseText);
                        drawCompanyFieldchart(ajdate.data);
                    }
                }
            }
        }
        function postFinancestage() {
            var request = new XMLHttpRequest();
            var positionid = document.getElementById("positionid");
            var url = "http://"+ip_addr+":8080/job-portal/jobs/chart/financestage?post=" + positionid.value;
            request.open("GET", url);
            request.send();
            request.onreadystatechange = function () {
                if (request.readyState == 4) {
                    if (request.status == 200) {
                        var ajdate = JSON.parse(request.responseText);
                        drawFinancestagechart(ajdate.data);
                    }
                }
            }
        }
        function postCityCountLine() {
            var request = new XMLHttpRequest();
            var ids = document.getElementById("myModal1").name + "," + document.getElementById("myModal2").name + "," +
                document.getElementById("myModal3").name + "," + document.getElementById("myModal4").name + "," +
                document.getElementById("myModal5").name;
            var url = "http://"+ip_addr+":8080/job-portal/jobs/chart/citycountline?postids=" + ids;
            request.open("GET", url);
            request.send();
            request.onreadystatechange = function () {
                if (request.readyState == 4) {
                    if (request.status == 200) {
                        var ajdate = JSON.parse(request.responseText);
                        drawCityCountchart(ajdate.data);
                    }
                }
            }
        }
        function postCitySalary() {
            var request = new XMLHttpRequest();

            var ids = document.getElementById("myModal1").name + "," + document.getElementById("myModal2").name + "," +
                document.getElementById("myModal3").name + "," + document.getElementById("myModal4").name + "," +
                document.getElementById("myModal5").name;
            var url = "http://"+ip_addr+":8080/job-portal/jobs/chart/citysalaryline?postids=" + ids;
            request.open("GET", url);
            request.send();
            request.onreadystatechange = function () {
                if (request.readyState == 4) {
                    if (request.status == 200) {
                        var ajdate = JSON.parse(request.responseText);
                        drawCitySalarychart(ajdate.data);
                    }
                }
            }
        }
        function postSalaryColumn() {
            var request = new XMLHttpRequest();
            var positionid = document.getElementById("positionid");
            var url = "http://"+ip_addr+":8080/job-portal/jobs/chart/salarycolumn?postcatid=" + positionid.value;
            request.open("GET", url);
            request.send();
            request.onreadystatechange = function () {
                if (request.readyState == 4) {
                    if (request.status == 200) {
                        var ajdate = JSON.parse(request.responseText);
                        drawSalaryColumnchart(ajdate.data);
                    }
                }
            }
        }
        function postRequest(type) {
            var request = new XMLHttpRequest();
            var positionid = document.getElementById("positionid");
            var url = "http://"+ip_addr+":8080/job-portal/jobdetail/chartrequest/" + positionid.value;
            request.open("GET", url);
            request.send();
            request.onreadystatechange = function () {
                if (request.readyState == 4) {
                    if (request.status == 200) {
                        var ajdate = JSON.parse(request.responseText);
                        if(type==1){
                            drawRequestchart(ajdate.data);
                        }else {
                            drawRequestList(ajdate.data);
                        }
                    }
                }
            }
        }
        function drawRequestList(data) {
            var root=document.getElementById("chartContainer");
            root.innerHTML="";
            var size=data.length;
            var option = $("#selthreed option:selected ");
            for(var i=0;i<size;i++){
                var a=document.createElement("a");
                var div=document.createElement("div");
                div.style.backgroundColor=data[i].itemStyle.normal.color;
                div.style.width=120;
                div.style.margin=10;
                div.style.height=30;
                div.style.borderRadius=10;
                div.style.float="left";
                div.style.textAlign="center";
                a.setAttribute("href","/job-portal/index/"+option.text()+"?keyword="+data[i]["name"]);
                a.innerHTML=data[i]["name"]+" "+data[i]["value"];
                a.style.textDecoration="none";

                div.appendChild(a);
                root.appendChild(div);
            }
        }
        function drawSalaryColumnchart(data) {
            var revenueChart = new FusionCharts({
                "type": "column3d",
                "renderAt": "chartContainer",
                "width": "3000",
                "height": "800",
                "dataFormat": "json",
                "dataSource": {
                    "chart": {
                        "caption": "岗位薪资统计",
                        "subCaption": "by荣先生",
                        "xAxisName": "岗位",
                        "yAxisName": "薪资",
                        "theme": "fint"
                    },
                    "data": data
                }
            });
            revenueChart.render();
        }
        function drawCitySalarychart(data) {
            var fusioncharts = new FusionCharts({
                    type: 'msline',
                    renderAt: 'chartContainer',
                    width: '1000',
                    height: '500',
                    dataFormat: 'json',
                    dataSource: {
                        "chart": {
                            "caption": "岗位薪资地域分析",
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
                            "yAxisName": "平均薪资（k）",
                            "showValues": "0"
                        },
                        "categories": [{
                            "category": [{
                                "label": "北京"
                            }, {
                                "label": "上海"
                            }, {
                                "label": "广州"
                            }, {
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
                        "dataset": data.dataset
                    }
                }
            );
            fusioncharts.render();
        }
        ;
        function drawCityCountchart(data) {
            var fusioncharts = new FusionCharts({
                    type: 'msline',
                    renderAt: 'chartContainer',
                    width: '1000',
                    height: '500',
                    dataFormat: 'json',
                    dataSource: {
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
                            "yAxisName": "数量（个）",
                            "showValues": "0"
                        },
                        "categories": [{
                            "category": [{
                                "label": "北京"
                            }, {
                                "label": "上海"
                            }, {
                                "label": "广州"
                            }, {
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
                        "dataset": data.dataset
                    }
                }
            );
            fusioncharts.render();
        }
        ;
        function drawFinancestagechart(data) {
            var revenueChart = new FusionCharts({
                "type": "pie3d",
                "renderAt": "chartContainer",
                "width": "1000",
                "height": "1000",
                "dataFormat": "json",
                "dataSource": {
                    "chart": {
                        "caption": "公司发展阶段分析饼图",
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
                    "data": data
                }
            });
            revenueChart.addEventListener("Exported", function (evt, args) {
                alert(args.DOMId + (args.statusCode ? " 图表已经导出" : "图表不能够被导出"));
            });
            revenueChart.render();
        }
        function drawCountColumnchart(data, width) {
            var revenueChart = new FusionCharts({
                "type": "column3d",
                "renderAt": "chartContainer",
                "width": width,
                "height": "800",
                "dataFormat": "json",
                "dataSource": {
                    "chart": {
                        "caption": "招聘岗位统计",
                        "subCaption": "by荣先生",
                        "xAxisName": "岗位",
                        "yAxisName": "数量(个)",
                        "theme": "fint"
                    },
                    "data": data
                }
            });
            revenueChart.render();
        }

        function drawCompanyFieldchart(data) {
            var revenueChart = new FusionCharts({
                "type": "pie3d",
                "renderAt": "chartContainer",
                "width": "1300",
                "height": "500",
                "dataFormat": "json",
                "dataSource": {
                    "chart": {
                        "caption": "公司领域分析饼图",
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
                    "data": data
                }

            });
            revenueChart.render();
        }
        function drawCompanySizechart(data) {
            var revenueChart = new FusionCharts({
                "type": "pie3d",
                "renderAt": "chartContainer",
                "width": "500",
                "height": "500",
                "dataFormat": "json",
                "dataSource": {
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
                    "data": data
                }
            });
            revenueChart.addEventListener("Exported", function (evt, args) {
                alert(args.DOMId + (args.statusCode ? " 图表已经导出" : "图表不能够被导出"));
            });
            revenueChart.render();
        }
        function getChildId(postid, id, flag) {
            var request = new XMLHttpRequest();

            var url = "http://"+ip_addr+":8080/job-portal/jobcat/" + postid;
            request.open("GET", url);
            request.send();
            request.onreadystatechange = function () {
                if (request.readyState == 4) {
                    if (request.status == 200) {
                        var ajdate = JSON.parse(request.responseText);
                        if (flag == 1) {
                            addChildOption(ajdate.data, id);
                        }
                        else {
                            winaddChildOption(ajdate.data, id);
                        }
                    }
                }
            }
        }
        function post() {
            var chart = document.getElementById("chart");
            var chartValue;
            switch (chart.value) {
                case "0":
                    postCountColumn();
                    break;
                case "1":
                    postCompanySize();
                    break;
                case "2":
                    postCompanyField();
                    break;
                case "3":
                    postFinancestage();
                    break;
                case "4":
                    postSalaryColumn();
                    break;
                case "5":
                    postCitySalary();
                    break;
                case "6":
                    postCityCountLine();
                    break;
                case "7":
                    postRequest(1);
                    break;
                case "8":
                    postRequest(2);
                    break;
            }
        }
        function addChildOption(data, id) {
            var sel;
            if (id == 2) {
                sel = document.getElementById("seltwo");
                sel.innerHTML = "";
                var selthreed = document.getElementById("selthreed");
                selthreed.innerHTML = "";
            }
            else if (id == 3) {
                sel = document.getElementById("selthreed");
                sel.innerHTML = "";
            }
            var length = data.length;
            var option = document.createElement("option");
            option.innerHTML = "不限";
            sel.appendChild(option);
            for (var j = 0; j < length; j++) {
                var option = document.createElement("option");
                option.innerHTML = data[j]["positionName"];
                option.value = data[j]["id"];
                sel.appendChild(option);
            }

        }

        function winaddChildOption(data, id) {
            var sel;
            if (id == 2) {
                sel = document.getElementById("winseltwo");
                sel.innerHTML = "";
                var selthreed = document.getElementById("winselthreed");
                selthreed.innerHTML = "";
            }
            else if (id == 3) {
                sel = document.getElementById("winselthreed");
                sel.innerHTML = "";
            }
            var length = data.length;
            var option = document.createElement("option");
            option.innerHTML = "不限";
            sel.appendChild(option);
            for (var j = 0; j < length; j++) {
                var option = document.createElement("option");
                option.innerHTML = data[j]["positionName"];
                option.value = data[j]["id"];
                sel.appendChild(option);
            }

        }
        function chg(id) {
            var positionid = document.getElementById("positionid");
            if (id == 1) {
                var seleone = document.getElementById("selone");
                if (seleone.value == 0) {
                    sel = document.getElementById("seltwo");
                    sel.innerHTML = "";
                    var selthreed = document.getElementById("selthreed");
                    selthreed.innerHTML = "";
                    positionid.value = seleone.value;
                    return;
                }
                getChildId(seleone.value, 2, 1);
                positionid.value = seleone.value;
            }
            else if (id == 2) {
                var seltwo = document.getElementById("seltwo");
                getChildId(seltwo.value, 3, 1);
                positionid.value = seltwo.value;

            }
            else if (id == 3) {
                var selthreed = document.getElementById("selthreed");
                getChildId(selthreed.value, 0, 1);
                positionid.value = selthreed.value;
            }
        }

        function winchg(id) {
            var positionid = document.getElementById("winpositionid");
            if (id == 1) {
                var seleone = document.getElementById("winselone");
                if (seleone.value == 0) {
                    sel = document.getElementById("winseltwo");
                    sel.innerHTML = "";
                    var selthreed = document.getElementById("winselthreed");
                    selthreed.innerHTML = "";
                    positionid.value = seleone.value;
                    var option = $("#winselone option:selected ");
                    positionid.name = option.text();
                    return;
                }
                getChildId(seleone.value, 2, 2);
                positionid.value = seleone.value;
                var option = $("#winselone option:selected ");
                positionid.name = option.text();
            }
            else if (id == 2) {
                var seltwo = document.getElementById("winseltwo");
                getChildId(seltwo.value, 3, 2);
                positionid.value = seltwo.value;
                var option = $("#winseltwo option:selected ");
                positionid.name = option.text();

            }
            else if (id == 3) {
                var selthreed = document.getElementById("winselthreed");
                getChildId(selthreed.value, 0, 2);
                positionid.value = selthreed.value;
                var option = $("#winselthreed option:selected ");
                positionid.name = option.text();

            }
        }
        function chartChange() {
//                var chart=document.getElementById("chart").value;
//                switch (chart){
//                    case "1":
//                        var sel=document.getElementById("selthreed");
//                        sel.style="display: block";
//                        break;
//                }

        }
        function addpost() {
            jbox.close();
            var name = document.getElementById("winpositionid").name;
            var id = document.getElementById("winpositionid").value;
            document.getElementById(myModal).name = id;
            document.getElementById(myModal).innerHTML = name;
        }
        var myModal;
        function myModalClick1() {
            myModal = "myModal1";
        }
        function myModalClick2() {
            myModal = "myModal2";
        }
        function myModalClick3() {
            myModal = "myModal3";
        }
        function myModalClick4() {
            myModal = "myModal4";
        }
        function myModalClick5() {
            myModal = "myModal5";
        }
        var jbox;
        $(function () {
            jbox = new jBox('Modal', {
                width: 300,
                height: 200,
                attach: $('.myModal'),
                title: '请选择岗位',
                content: '<select id="winselone" onChange="winchg(1)">'
                + '<option value="0">all</option>'
                + '<option value="1">技术</option>'
                + '<option value="2">产品</option>'
                + '<option value="3">设计</option>'
                + '</select>'
                + '<select id="winseltwo" onChange="winchg(2)">'
                + '</select>'
                + '<select id="winselthreed" onChange="winchg(3)">'
                + ' </select>'
                + '<input type="button" name="btn" value="确定" id="winbtn" onclick="addpost()">'

            });


        })

    </script>
</head>
<body>

<select id="chart" onchange="chartChange()">
    <option value="0">岗位数量柱状图</option>
    <option value="1">公司规模饼图</option>
    <option value="2">公司领域饼图</option>
    <option value="3">公司发展阶段饼图</option>
    <option value="4">岗位薪资柱状图</option>
    <option value="5">城市岗位薪资折线图</option>
    <option value="6">城市岗位数量折线图</option>
    <option value="7">岗位技能需求统计</option>
    <option value="8">岗位技能需求统计列表展示</option>
</select>
<select id="selone" onChange="chg(1)">
    <option value="0">all</option>
    <option value="1">技术</option>
    <option value="2">产品</option>
    <option value="3">设计</option>
</select>

<select id="seltwo" onChange="chg(2)">
</select>
<select id="selthreed" onChange="chg(3)">
</select>
<input type="hidden" id="positionid" value="0"/>
<input type="hidden" id="winpositionid" value="0" name=""/>
<button class="myModal" id="myModal1" onclick="myModalClick1()">岗位一</button>
<button class="myModal" id="myModal2" onclick="myModalClick2()">岗位二</button>
<button class="myModal" id="myModal3" onclick="myModalClick3()">岗位三</button>
<button class="myModal" id="myModal4" onclick="myModalClick4()">岗位四</button>
<button class="myModal" id="myModal5" onclick="myModalClick5()">岗位五</button>
<input type="button" name="btn" value="确定" id="btn" onclick="post()">

<div id="chartContainer" style="width:1200px;height:800px"></div>


<div id="main" style="width:1200px;height:800px"></div>

<!-- ECharts单文件引入 -->
<script type="text/javascript">
    function drawRequestchart(data) {

        // 路径配置
    require.config({
        paths: {
            echarts: 'http://echarts.baidu.com/build/dist'
        }
    });
//
//    function createRandomItemStyle() {
//        return {
//            normal: {
//                color: 'rgb(' + [
//                    Math.round(Math.random() * 160),
//                    Math.round(Math.random() * 160),
//                    Math.round(Math.random() * 160)
//                ].join(',') + ')'
//            }
//        };
//    }

    // 使用
    require(
        [
            'echarts',
            //按需加载 (例如:使用柱状图就加载bar模块)
//            'echarts/chart/line',             //折线（面积）图
            //'echarts/chart/bar',             //柱状（条形）图
            //'echarts/chart/scatter',        //散点（气泡）图
            //'echarts/chart/k',             //K线图
//            'echarts/chart/pie',             //饼（圆环）图
            //'echarts/chart/radar',         //雷达（面积）图
            //'echarts/chart/chord',         //和弦图
            //'echarts/chart/force',         //力导向布局图
            //'echarts/chart/map',             //地图
            //'echarts/chart/gauge',         //仪表盘
            //'echarts/chart/funnel',         //漏斗图
            //'echarts/chart/eventRiver',    //事件河流图
            //'echarts/chart/venn',         //韦恩图
            //'echarts/chart/treemap',        //矩形树图
            //'echarts/chart/tree',         //树图
            'echarts/chart/wordCloud',    //字符云
            //'echarts/chart/mix',             //混搭
            //'echarts/chart/component',    //组件
            //'echarts/chart/other',         //其他
            //'echarts/chart/theme',         //主题
            //'echarts/chart/topic',         //专题
        ],
        function (ec) {
            // 基于准备好的dom，初始化echarts图表
            var myChart = ec.init(document.getElementById('chartContainer'));

            ///////////////////////

            option = {
                title: {
                    text: '岗位技能词云图',
                    link: 'http://www.google.com/trends/hottrends'
                },
                tooltip: {
                    show: true
                },
                series: [{
                    name: '荣先生',
                    type: 'wordCloud',
                    size: ['80%', '80%'],
                    textRotation : [0, 45, 90, -45],
                    textPadding: 0,
                    autoSize: {
                        enable: true,
                        minSize: 14
                    },
                    data: data
                }]
            };

            ///////////////////////

            // 为echarts对象加载数据
            myChart.setOption(option);
        }
    );
    }
</script>
</body>
</html>
