<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/30
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../css/mCustomScrollbar_ac2fb8b.css"/>
    <link rel="stylesheet" type="text/css" href="../css/layout_39e7f73.css"/>
    <link rel="stylesheet" type="text/css" href="../css/widgets_72ff0d6.css"/>
    <link rel="stylesheet" type="text/css" href="../css/main.html_aio_ee307ca.css"/>
</head>
<body onload="loadData('null','null','null','null','null',1,'null','null',1,10)">
<input type="hidden" id="job" value="${job}"/>
<input type="hidden" id="city" value="citynull"/>
<input type="hidden" id="education" value="educationnull" />
<input type="hidden" id="financestage"  value="financestagenull" />
<input type="hidden" id="industryfield"  value="industryfieldnull" />
<input type="hidden" id="workyear"  value="workyearnull"/>
<input type="hidden" id="page" value="1"/>
<input type="hidden" id="pages" value="1"/>
<!-- 页面主体START -->
<div id="content-container">

    <div class="search-wrapper  ">
        <div id="searchBar" class="search-bar">
            <div class="tab-wrapper">
                <a id="tab_pos" class="active" rel="nofollow" href="">职位 ( <span>99999</span> ) </a>
            </div>
            <div class="input-wrapper" data-lg-tj-track-code="search_search" data-lg-tj-track-type="1">
                <div class="keyword-wrapper" style="height: 50px;">
                    <input type="text" id="keyword" style="height: 50px;" autocomplete="off" maxlength="64" placeholder="搜索职位、公司或地点"
                           value="${keyword}"/>
                </div>
                <input type="button" id="submit" value="搜索" onclick="loadDataByKeyWord()"/>
            </div>
        </div>
    </div>


    <div id="main_container">
        <div class="content_left">
            <div id="positionHead" class="">
                <ul id="filterBox" class="filter-wrapper">
                    <input id="filterOption" type="hidden" value="1">
                    <li class="li-taller brief dn" id="filterBrief">
                        <span class="title">工作地点：</span>
                        <a rel="nofollow" href="" class="active">北京</a>
                        <span class="title">工作经验：</span>
                        <a rel="nofollow" href="" class="active">不限</a>
                        <span class="title">学历要求：</span>
                        <a rel="nofollow" href="" class="active">不限</a>
                        <span class="title">融资阶段：</span>
                        <a rel="nofollow" href="" class="active">不限</a>
                        <span class="title">行业领域：</span>
                        <a rel="nofollow" href="" class="active">不限</a>
                    </li>
                    <div class="details" id="filterCollapse">
                        <div class="has-more">
                            <!-- 处理工作地点深层选择 -->
                            <div class="choose-detail">
                                <li class="position-head">

                                    <div class="current-handle-position">
                                        <span class="title">工作地点：</span>
                                        <a data-id="" class="active" onclick="loadDataByCity('null')" name="citynull">全国</a>
                                        <a  onclick="loadDataByCity('北京')" name="北京">北京</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('上海')" name="上海">上海</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('广州')" name="广州">广州</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('深圳')" name="深圳">深圳</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('杭州')" name="杭州">杭州</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('成都')" name="成都">成都</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('南京')" name="南京">南京</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('武汉')" name="武汉">武汉</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('西安')" name="西安">西安</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('苏州')" name="苏州">苏州</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('沈阳')" name="沈阳">沈阳</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('厦门')" name="厦门">厦门</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('青岛')" name="青岛">青岛</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('贵阳')" name="贵阳">贵阳</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('天津')" name="天津">天津</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('珠海')" name="珠海">珠海</a>
                                        <a  href="javascript:;" style="margin-left: 130px"  onclick="loadDataByCity('济南')" name="济南">济南</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('长沙')" name="长沙">长沙</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('重庆')" name="重庆">重庆</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('兰州')" name="兰州">兰州</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('郑州')" name="郑州">郑州</a>
                                        <a  href="javascript:;"  onclick="loadDataByCity('太原')" name="太原">太原</a>
                                    </div>

                                    <div class="other-hot-city">

                                        <a rel="nofollow" class="btn-more" href=""></a>
                                    </div>

                                </li>
                            </div>
                        </div>

                        <li class="multi-chosen"><span class="title">工作经验：</span>
                            <a rel="nofollow"  href="javascript:;"  class="active" data-lg-tj-id="8r00" data-lg-tj-no="
                                                            0001
                                                    " data-lg-tj-cid="idnull" onclick="loadDataByWorkYear('null')" name="workyearnull">不限
                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8r00" data-lg-tj-no="
                                                                    0002
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByWorkYear('应届毕业生')" name="应届毕业生">应届毕业生
                                <i class="delete"></i>

                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8r00" data-lg-tj-no="
                                                                    0003
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByWorkYear('1年以下')" name="1年以下">1年以下
                                <i class="delete"></i>

                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8r00" data-lg-tj-no="
                                                                    0003
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByWorkYear('1-3年')" name="1-3年">1-3年
                                <i class="delete"></i>

                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8r00" data-lg-tj-no="
                                                                    0004
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByWorkYear('3-5年')" name="3-5年">3-5年
                                <i class="delete"></i>

                            </a>
                            <a rel="nofollow"  href="javascript:;" data-lg-tj-id="8r00" data-lg-tj-no="
                                                                    0005
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByWorkYear('5-10年')" name="5-10年">5-10年
                                <i class="delete"></i>

                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8r00" data-lg-tj-no="
                                                                    0006
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByWorkYear('10年以上')" name="10年以上">10年以上
                                <i class="delete"></i>

                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8r00" data-lg-tj-no="
                                                                    0006
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByWorkYear('不限')" name="10年以上">不要求
                                <i class="delete"></i>

                            </a>
                        </li>

                        <li class="multi-chosen"><span class="title">学历要求：</span>

                            <a rel="nofollow"  href="javascript:;" class="active" data-lg-tj-id="8s00" data-lg-tj-no="
                                                            0001
                                                    " data-lg-tj-cid="idnull" onclick="loadDataByEducation('null')" name="educationnull">不限
                            </a>
                            <a rel="nofollow"   href="javascript:;" data-lg-tj-id="8s00" data-lg-tj-no="
                                                                    0002
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByEducation('大专')" name="大专">大专
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"   href="javascript:;" data-lg-tj-id="8s00" data-lg-tj-no="
                                                                    0003
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByEducation('本科')" name="本科">本科
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"  href="javascript:;" data-lg-tj-id="8s00" data-lg-tj-no="
                                                                    0004
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByEducation('硕士')" name="硕士">硕士
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8s00" data-lg-tj-no="
                                                                    0005
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByEducation('博士')" name="博士">博士
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8s00" data-lg-tj-no="
                                                                    0006
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByEducation('不限')" name="不要求">不要求
                                <i class="delete"></i>
                            </a>

                        </li>
                        <li class="multi-chosen"><span class="title">融资阶段：</span>
                            <a rel="nofollow"   href="javascript:;" class="active" data-lg-tj-id="8t00" data-lg-tj-no="
                                                            0001
                                                    " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('null')" name="financestagenull">不限
                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8t00" data-lg-tj-no="
                                                                    0002
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('初创型(未融资)')" name="初创型(未融资)">未融资
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8t00" data-lg-tj-no="
                                                                    0003
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('初创型(天使轮)')" name="初创型(天使轮)">天使轮
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow" href="javascript:;"  data-lg-tj-id="8t00" data-lg-tj-no="
                                                                    0004
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('成长型(A轮)')" name="成长型(A轮)">A轮
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8t00" data-lg-tj-no="
                                                                    0005
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('成长型(B轮)')" name="成长型(B轮)">B轮
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8t00" data-lg-tj-no="
                                                                    0006
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('成熟型(C轮)')" name="成熟型(C轮)">C轮
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8t00" data-lg-tj-no="
                                                                    0007
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('成熟型(D轮及以上)')" name="成熟型(D轮及以上)">D轮及以上
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8t00" data-lg-tj-no="
                                                                    0008
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('上市公司')" name="上市公司">上市公司
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8t00" data-lg-tj-no="
                                                                    0009
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('初创型(不需要融资)')" name="不需要融资">初创-不需要融资
                                <i class="delete"></i>
                            </a>
                            <a rel="nofollow"   href="javascript:;" data-lg-tj-id="8t00" data-lg-tj-no="
                                                                    0009
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('成长型(不需要融资)')" name="不需要融资">成长-不需要融资
                                <i class="delete"></i>
                            </a> <a rel="nofollow"  href="javascript:;" style="margin-left: 130px" data-lg-tj-id="8t00" data-lg-tj-no="
                                                                    0009
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByFinanceStage('成熟型(不需要融资)')" name="不需要融资">成熟-不需要融资
                                <i class="delete"></i>
                            </a>
                        </li>
                        <div class="has-more hy-area">
                            <li class="multi-chosen">
                                <span class="title">行业领域：</span>
                                <a rel="nofollow"  href="javascript:;"  class="active" data-lg-tj-id="8u00" data-lg-tj-no="
                                                            0001
                                                    " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('null')" name="industryfieldnull">不限
                                </a>
                                <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0002
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('移动互联网')" name="移动互联网">移动互联网
                                    <i class="delete"></i>
                                </a>
                                <a rel="nofollow" href="javascript:;"   data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0003
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('电子商务')" name="电子商务">电子商务
                                    <i class="delete"></i>
                                </a>
                                <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0004
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('金融')" name="金融">金融
                                    <i class="delete"></i>
                                </a>
                                <a rel="nofollow"   href="javascript:;" data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0005
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('企业服务')" name="企业服务">企业服务
                                    <i class="delete"></i>
                                </a>
                                <a rel="nofollow"   href="javascript:;" data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0006
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('教育')" name="教育">教育
                                    <i class="delete"></i>
                                </a>
                                <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0007
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('文化娱乐')" name="文化娱乐">文化娱乐
                                    <i class="delete"></i>
                                </a>
                                <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0008
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('游戏')" name="游戏">游戏
                                    <i class="delete"></i>
                                </a>
                                <a rel="nofollow"   href="javascript:;" data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0009
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('O2O')" name="O2O">O2O
                                    <i class="delete"></i>
                                </a>
                                <a rel="nofollow"   href="javascript:;" data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0010
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('硬件')" name="硬件">硬件
                                    <i class="delete"></i>
                                </a>
                                <a rel="nofollow"   href="javascript:;" data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0010
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('生活服务')" name="生活服务">生活服务
                                    <i class="delete"></i>
                                </a><a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0010
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('医疗健康')" name="医疗健康">医疗健康
                                <i class="delete"></i>
                            </a>

                                <a style="margin-left: 130px"  href="javascript:;" rel="nofollow"  data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0010
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('数据服务')" name="数据服务">数据服务
                                    <i class="delete"></i>
                                </a>
                                <a rel="nofollow"  href="javascript:;"  data-lg-tj-id="8u00" data-lg-tj-no="
                                                                    0010
                                                            " data-lg-tj-cid="idnull" onclick="loadDataByIndestryField('广告营销')" name="广告营销">广告营销
                                    <i class="delete"></i>
                                </a>
                            </li>
                        </div>
                    </div>
                </ul>
                <div class="btn-collapse-wrapper">
                    <a rel="nofollow" class="btn-collapse " title="点击收起筛选项" href="javascript:"></a>
                </div>
            </div>

            <!-- 职位列表 -->

            <div class="s_position_list " id="s_position_list">
                <!-- 精确搜索某个城市的职位为空时 -->
                <!-- 分站城市 -->
                <ul class="item_con_list" id="item_con_list">


                </ul>

                <!-- 分页 -->
                <div class="item_con_pager">
                    <div class="pager_container">
                        <!-- 上一页处理 -->
                        <a rel="nofollow"  href="javascript:;"  onclick="loadUpPage()" class="page_no" data-index="">上一页</a>
                        <!-- 当前页号不需要设置链接 -->
                        <a rel="nofollow" href="" class="page_no pager_is_current" name="currentpage">1</a>/
                        <a rel="nofollow" href="" class="page_no " name="allpage">1</a>
                        <!-- 下一页处理 -->
                        <a  href="javascript:;" onclick="loadNextPage()" class="page_no" data-index="2">下一页</a>
                    </div>
                </div>

            </div>

        </div>

    </div>
</div>
<script type="text/javascript" src="../js/lagou/vendor_a673406.js"></script>
<script type="text/javascript" src="../js/lagou/widgets_a1e07bb.js"></script>
<script type="text/javascript" src="../js/lagou/layout_89bb557.js"></script>
<script type="text/javascript" src="../js/lagou/main.html_aio_4787e07.js"></script>
<script type="text/javascript" src="../js/lagou/main.html_aio_2_d589526.js"></script>
<script type="text/javascript" src="../js/lagou/userinfo_7f282e9.js"></script>
<script type="text/javascript">
    function loadData(city,wy,edu,rz,field,sort,sal,nature,page,rows) {
        var job=document.getElementById("job").value;
        var keyword=document.getElementById("keyword").value;
        var ip_addr = document.location.hostname;
        var request = new XMLHttpRequest();
        var url = "http://"+ip_addr+":8080/job-portal/search/"+job+"?keyword="+keyword+"&city="+city+
                "&wy="+wy+"&edu="+edu+"&rz="+rz+"&field="+field+"&sort="+sort +
                "&sal="+sal+"&nature="+nature+"&page="+page+"&rows="+rows;
        request.open("GET", url);
        request.send();
        request.onreadystatechange = function () {
            if (request.readyState == 4) {
                if (request.status == 200) {
                    var ajdate = JSON.parse(request.responseText);
                    if (ajdate.msg == "success") {
                        var root=document.getElementById("item_con_list");
                        root.innerHTML="";
                        addDataToList(ajdate.data);
                        setParam(ajdate.data);
                    }
                }
            }
        }
    }

    function setParam(data){
        var city=document.getElementById("city");
        var newCity=document.getElementsByName(city.value);
        newCity[0].className="active";
        var education=document.getElementById("education");
        var newEducation=document.getElementsByName(education.value);
        newEducation[0].className="active";
        var workyear=document.getElementById("workyear");
        var newWorkyesr=document.getElementsByName(workyear.value);
        newWorkyesr[0].className="active";
        var financestage=document.getElementById("financestage");
        var newFinanceStage=document.getElementsByName(financestage.value);
        newFinanceStage[0].className="active";
        var industryfield=document.getElementById("industryfield");
        var newIndustryField=document.getElementsByName(industryfield.value);
        newIndustryField[0].className="active";
        var page=document.getElementById("page");
        var pages=document.getElementById("pages");
        page.value=data.page;
        pages.value=data.pages;
        var currentpage=document.getElementsByName("currentpage");
        var allpage=document.getElementsByName("allpage");
        currentpage[0].innerHTML=data.page;
        allpage[0].innerHTML=data.pages;
    }

    function loadNextPage(){
        var page=document.getElementById("page");
        var pages=document.getElementById("pages");
        var p=page.value;
        if(++p>pages.value){
            p--;
            alert("没有下一页了哦/(ㄒoㄒ)/~~");
            return;
        }else{
            p--;
        }

        var city=document.getElementById("city");
        var education=document.getElementById("education");
        var workyear=document.getElementById("workyear");
        var financestage=document.getElementById("financestage");
        var industryfield=document.getElementById("industryfield");
        var ci=city.value.indexOf("null");
        var ei=education.value.indexOf("null");
        var fi=financestage.value.indexOf("null");
        var ii=industryfield.value.indexOf("null");
        var wi=workyear.value.indexOf("null");
        loadData(ci>0?"null":city.value,wi>0?"null":workyear.value,ei>0?"null":education.value,fi>0?"null":financestage.value,ii>0?"null":industryfield.value,1,'null','null',++p,10);
    }

    function loadUpPage(){
        var page=document.getElementById("page");
        var p=page.value;
        if(--p<1){
            alert("没有上一页了哦/(ㄒoㄒ)/~~");
            p++;
            return;
        }else{
            p++;
        }
        var city=document.getElementById("city");
        var education=document.getElementById("education");
        var workyear=document.getElementById("workyear");
        var financestage=document.getElementById("financestage");
        var industryfield=document.getElementById("industryfield");
        var ci=city.value.indexOf("null");
        var ei=education.value.indexOf("null");
        var fi=financestage.value.indexOf("null");
        var ii=industryfield.value.indexOf("null");
        var wi=workyear.value.indexOf("null");

        loadData(ci>0?"null":city.value,wi>0?"null":workyear.value,ei>0?"null":education.value,fi>0?"null":financestage.value,ii>0?"null":industryfield.value,1,'null','null',--p,10);
    }

    function loadDataByCity(city){
        var hiddencity=document.getElementById("city");
        var oldcity=document.getElementsByName(hiddencity.value);
        oldcity[0].className="";
        if(city=="null"){
            hiddencity.value="citynull";
        }else{
            hiddencity.value=city;
        }
        var hiddeneducation=document.getElementById("education");
        var hiddenfinancestage=document.getElementById("financestage");
        var hiddenindustryfield=document.getElementById("industryfield");
        var hiddenworkyear=document.getElementById("workyear");
        var oldeducation=document.getElementsByName(hiddeneducation.value);
        var oldfinancestage=document.getElementsByName(hiddenfinancestage.value);
        var oldindustryfield=document.getElementsByName(hiddenindustryfield.value);
        var oldworkyear=document.getElementsByName(hiddenworkyear.value);
        oldeducation[0].className="";
        oldfinancestage[0].className="";
        oldindustryfield[0].className="";
        oldworkyear[0].className="";
        hiddeneducation.value="educationnull";
        hiddenfinancestage.value="financestagenull";
        hiddenindustryfield.value="industryfieldnull";
        hiddenworkyear.value="workyearnull";
        loadData(city,'null','null','null','null',1,'null','null',1,10);
    }

    function loadDataByKeyWord(){
        var city=document.getElementById("city");
        var education=document.getElementById("education");
        var financestage=document.getElementById("financestage");
        var industryfield=document.getElementById("industryfield");
        var workyear=document.getElementById("workyear");
        var ci=city.value.indexOf("null");
        var ei=education.value.indexOf("null");
        var fi=financestage.value.indexOf("null");
        var ii=industryfield.value.indexOf("null");
        var wi=workyear.value.indexOf("null");
        loadData(ci>0?"null":city.value,wi>0?"null":workyear.value,ei>0?"null":education.value,fi>0?"null":financestage.value,ii>0?"null":industryfield.value,1,'null','null',1,10);
    }
    function loadDataByWorkYear(workyear){
        var hiddenworkyear=document.getElementById("workyear");
        var oldworkyear=document.getElementsByName(hiddenworkyear.value);
        oldworkyear[0].className="";
        if(workyear=="null"){
            hiddenworkyear.value="workyearnull";
        }else{
            hiddenworkyear.value=workyear;
        }
        var city=document.getElementById("city");
        var education=document.getElementById("education");
        var financestage=document.getElementById("financestage");
        var industryfield=document.getElementById("industryfield");
        var ci=city.value.indexOf("null");
        var ei=education.value.indexOf("null");
        var fi=financestage.value.indexOf("null");
        var ii=industryfield.value.indexOf("null");
        loadData(ci>0?"null":city.value,workyear,ei>0?"null":education.value,fi>0?"null":financestage.value,ii>0?"null":industryfield.value,1,'null','null',1,10);
    }
    function loadDataByEducation(education){
        var hiddeneducation=document.getElementById("education");
        var oldeducation=document.getElementsByName(hiddeneducation.value);
        oldeducation[0].className="";
        if(education=="null"){
            hiddeneducation.value="educationnull";
        }else{
            hiddeneducation.value=education;
        }
        var city=document.getElementById("city");
        var workyear=document.getElementById("workyear");
        var financestage=document.getElementById("financestage");
        var industryfield=document.getElementById("industryfield");
        var ci=city.value.indexOf("null");
        var wi=workyear.value.indexOf("null");
        var fi=financestage.value.indexOf("null");
        var ii=industryfield.value.indexOf("null");
        loadData(ci>0?"null":city.value,wi>0?"null":workyear.value,education,fi>0?"null":financestage.value,ii>0?"null":industryfield.value,1,'null','null',1,10);
    }
    function loadDataByFinanceStage(financestage){
        var hiddenfinancestage=document.getElementById("financestage");
        var oldfinancestage=document.getElementsByName(hiddenfinancestage.value);
        oldfinancestage[0].className="";
        if(financestage=="null"){
            hiddenfinancestage.value="financestagenull";
        }else{
            hiddenfinancestage.value=financestage;
        }
        var city=document.getElementById("city");
        var workyear=document.getElementById("workyear");
        var education=document.getElementById("education");
        var industryfield=document.getElementById("industryfield");
        var ci=city.value.indexOf("null");
        var wi=workyear.value.indexOf("null");
        var ei=education.value.indexOf("null");
        var ii=industryfield.value.indexOf("null");
        loadData(ci>0?"null":city.value,wi>0?"null":workyear.value,ei>0?"null":education.value,financestage,ii>0?"null":industryfield.value,1,'null','null',1,10);
    }
    function loadDataByIndestryField(industryfield){
        var hiddenindustryfield=document.getElementById("industryfield");
        var oldindustryfield=document.getElementsByName(hiddenindustryfield.value);
        oldindustryfield[0].className="";
        if(industryfield=="null"){
            hiddenindustryfield.value="industryfieldnull";
        }else{
            hiddenindustryfield.value=industryfield;
        }
        var city=document.getElementById("city");
        var workyear=document.getElementById("workyear");
        var education=document.getElementById("education");
        var financestage=document.getElementById("financestage");
        var ci=city.value.indexOf("null");
        var wi=workyear.value.indexOf("null");
        var ei=education.value.indexOf("null");
        var fi=financestage.value.indexOf("null");
        loadData(ci>0?"null":city.value,wi>0?"null":workyear.value,ei>0?"null":education.value,fi>0?"null":financestage.value,industryfield,1,'null','null',1,10);
    }
    function addDataToList(data) {
        var length=data.rows;
        for(var i=0;i<length;i++){
//            alert(data["list"][i]["positionname"]);  data["list"][i]
            var root=document.getElementById("item_con_list");
            var li=document.createElement("li");
            li.className="con_list_item";
            li.setAttribute("data-index",i);
            if(!data["list"][i]){
                break;
            }
            li.setAttribute("data-positionId",data["list"][i]["positionid"]);
            li.setAttribute("data-salary",data["list"][i]["salary"]);
            li.setAttribute("data-company",data["list"][i]["companyshortname"]);
            li.setAttribute("data-positionName",data["list"][i]["positionname"]);
            li.setAttribute("data-companyid",data["list"][i]["companyid"]);
            var div1=document.createElement("div");
            div1.className="list_item_top";
            var div2=document.createElement("div");
            div2.className="position";
            var div3=document.createElement("div");
            div3.className="p_top";
            var a=document.createElement("a");
            a.className="position_link";
            a.setAttribute("href","/job-portal/jobdetail/"+data["list"][i]["positionid"]);
            a.setAttribute("target","_blank");
            a.setAttribute("data-index",i);
            div3.appendChild(a);
            var h2=document.createElement("h2");
            h2.innerHTML=data["list"][i]["positionname"];
            var span1=document.createElement("span");
            span1.className="add";
            var district=data["list"][i]["district"];
            if (district) {
                span1.innerHTML="["+district+"]";
            }else{
                span1.innerHTML="";
            }
            a.appendChild(h2);
            a.appendChild(span1);
            div3.appendChild(a);
            var span2=document.createElement("span");
            span2.className="format-time";
            span2.innerHTML=data["list"][i]["formatcreatetime"];
            div3.appendChild(span2);
            var div4=document.createElement("div");
            div4.className="p_bot";
            var div5=document.createElement("div");
            div5.className="li_b_l";
            div4.appendChild(div5);
            var span3=document.createElement("span");
            span3.className="money";
            span3.innerHTML=data["list"][i]["salary"];
            var span4=document.createElement("span");
            span4.innerHTML="  经验"+data["list"][i]["workyear"]+" /"+data["list"][i]["education"];
            var div6=document.createElement("div");
            var div7=document.createElement("div");
            div6.className="company";
            div7.className="company_name";
            var a1=document.createElement("a");
            a1.innerHTML=data["list"][i]["companyfullname"];
            var div8=document.createElement("div");
            div8.className="industry";
            div8.innerHTML=data["list"][i]["industryfield"]+" /"+data["list"][i]["financestage"];
            var div9=document.createElement("div");
            div9.className="com_logo";
            var img=document.createElement("img");
            img.setAttribute("alt",data["list"][i]["companyfullname"]);
            img.setAttribute("src",data["list"][i]["companylogo"]);
            img.setAttribute("width",60);
            img.setAttribute("height",60);
            var a3=document.createElement("a");
            a3.appendChild(img);
            var div10=document.createElement("div");
            var div11=document.createElement("div");
            div10.className="list_item_bot";
            div11.className="li_b_r";
            div11.innerHTML=data["list"][i]["positionadvantage"];
            div10.appendChild(div11);
            div9.appendChild(a3);
            div7.appendChild(a1);
            div6.appendChild(div7);
            div6.appendChild(div8);
            div1.appendChild(div9);
            div5.appendChild(span3);
            div5.appendChild(span4);
            div2.appendChild(div3);
            div2.appendChild(div4);
            div4.appendChild(div5);
            div1.appendChild(div2);
            div1.appendChild(div6);
            div1.appendChild(div9);
            li.appendChild(div1);
            li.appendChild(div10);
            root.appendChild(li);
        }
    }
</script>
</body>
</html>