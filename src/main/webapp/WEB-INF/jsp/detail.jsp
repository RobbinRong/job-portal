<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xianshengrong
  Date: 2016/12/5
  Time: 上午11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- meta -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit">
    <meta property="qc:admins" content="23635710066417756375" />
    <meta name="baidu-site-verification" content="QIQ6KC1oZ6" />
    <meta charset="UTF-8">



    <!-- global_domain FE_base... -->

    <script type="text/javascript">

        (function() {
            var protocol = window.location.protocol;
            var host = window.location.host;
            var baseUrl = protocol + '//' + host;

            window.GLOBAL_DOMAIN = window.GLOBAL_DOMAIN || {
                    ctx: protocol + '//www.lagou.com',
                    rctx: protocol + '//hr.lagou.com',
                    crctx: protocol + '//hr.lagou.com/company',
                    pctx: protocol + '//passport.lagou.com',
                    actx: protocol + '//account.lagou.com',
                    paictx: protocol + '//pai.lagou.com',
                    sctx: protocol + '//suggest.lagou.com',
                    zctx: protocol + '//yanzhi.lagou.com',
                    proctx: 'https://pro.lagou.com',
                    lgsctx: protocol + '//www.lgstatic.com',
                    FE_frontLogin: baseUrl + '/frontLogin.do',
                    FE_frontLogout: baseUrl + '/frontLogout.do',
                    FE_frontRegister: baseUrl + '/frontRegister.do'
                };

            window.GLOBAL_CDN_DOMAIN = 'www.lgstatic.com';
        })();
    </script>




    <!-- SEO 需求 -->
    <link rel="canonical" href="http://www.lagou.com/jobs/2612416.html">

    <!-- 公共样式 -->
    <!-- header样式 -->	<!-- footer样式 -->
    <!-- 页面样式 -->
    <!-- 动态token，防御伪造请求，重复提交 -->
    <script type="text/javascript">
        window.X_Anti_Forge_Token = 'c5f44089-ffcc-4d48-840e-be3cf6088ddc';
        window.X_Anti_Forge_Code = '61533994';
    </script>
    <link rel="stylesheet" type="text/css" href="//www.lgstatic.com/www/static/dep/mCustomScrollbar/css/mCustomScrollbar_ac2fb8b.css" />
    <link rel="stylesheet" type="text/css" href="//www.lgstatic.com/www/static/pkg/layout_39e7f73.css" />
    <link rel="stylesheet" type="text/css" href="//www.lgstatic.com/www/static/pkg/job-detail/page/index/main.html_aio_55cd6b9.css" />
    <link rel="stylesheet" type="text/css" href="//www.lgstatic.com/www/static/pkg/widgets_72ff0d6.css" />
    <link rel="stylesheet" type="text/css" href="//www.lgstatic.com/www/static/pkg/job-detail/page/index/main.html_aio_2_a2736e3.css" />
</head>
<body >
<!-- 页面主体START -->
<div class="position-head">
    <div class="position-content ">
        <div class="position-content-l">
            <div class="job-name" title="Java" >
                <div class="company" id="postdepartment">${content.data.postdepartment}</div>
                <span class="name" id="job_name_title">${content.data.postdepartment}</span>
            </div>
            <dd class="job_request">
                <p>
                    <span class="salary" id="salary" >${content.data.salary}</span>/
                    <span id="city"> ${content.data.workplace}</span> /
                    <span id="workyear">${content.data.experience}</span> /
                    <span id="education">${content.data.educationbackground}</span> /
                    <span id="jobkind">${content.data.jobkind}</span>
                </p>
                <p class="publish_time" id="publishtime">${content.data.publishtime}</p>
            </dd>
        </div>
    </div>
</div>
<div class="container clearfix" id="container">
    <div class="content_l fl">

        <dl class="job_detail" id="job_detail">

            <dt class="clearfix join_tc_icon">


            </dt>
            <dd class="job-advantage">
                <span class="advantage">职位诱惑：</span>
                <p id="advantage">${content.data.welfare}</p>
            </dd>
            <dd class="job_bt">
                <h3 class="description">职位描述：</h3>
                <div id="description">
                    <c:if test="${content.data.duty!=undefined}">
                        工作职责${content.data.duty}
                    </c:if>
                    <c:if test="${content.data.postrequest!=undefined}">
                        </br></br>工作要求
                        ${content.data.postrequest}
                    </c:if>
                </div>
            </dd>
            <dd class="job-address clearfix">

                <h3 class="address">工作地址</h3>-
                <div class="work_addr" id="positionaddress">
                    ${content.data.positionaddress}
                    <%--<a rel="nofollow" href="javascript:;" id="mapPreview">查看地图</a>--%>
                </div>
                <div id="miniMap"></div>
                <input type="hidden" name="positionLng" value="116.35735297" />
                <input type="hidden" name="positionLat" value="39.93921106" />
                <input type="hidden" name="positionAddress" value="西直门南大街2号成铭大厦C座16层（西直门地铁站C口）" />
                <input type="hidden" name="workAddress" value="北京" />
                <div style="display: none;">
                    <div id="mapPopup" class="popup">
                        <div id="fullMap"></div>
                    </div>
                </div>
            </dd>
        </dl>
    </div>
    <div class="content_r">
        <dl class="job_company" id="job_company">
            <dt>
                <a  data-lg-tj-track-code="jobs_logo" id="company">
                    <img src="http://${content.data.companyiconurl}" width="96" height="96">
                    <div>
                        <h2 class="fl" id="companynickname">
                            ${content.data.companynickname}
                            <i class="icon-glyph-valid"></i>
                        </h2>
                    </div>
                </a>
            </dt>
            <dd>
                <ul class="c_feature">
                    <li>
                        <i class="icon-glyph-fourSquare"></i> <span id="companyfeild">
                        ${content.data.companyfeild}
                    </span>
                        <span class="hovertips">领域</span>
                    </li>
                    <li>
                        <i class="icon-glyph-trend" ></i> <span id="companydevelopestage">
                        ${content.data.companydevelopestage}
                    </span>
                        <span class="hovertips">发展阶段</span>
                    </li>
                    <li>
                        <i class="icon-glyph-figure"></i> <span id="companyscale"></span>
                        ${content.data.companyscale}
                        <span class="hovertips">规模</span>
                    </li>
                    <li>
                        <i class="icon-glyph-home"></i>
                        <a  target="_blank"  id="companyhomepageurl" href="${content.data.companyhomepageurl}" rel="nofollow">${content.data.companyhomepageurl}</a>
                        <span class="hovertips">公司主页</span>
                    </li>
                </ul>
            </dd>
        </dl>
    </div>
</div>
<!-- 页面主体END -->
<a id="backtop" title="回到顶部" rel="nofollow"></a>
<input type="hidden" value="${jobid}" id="jobid" />
<input type="hidden" value="25439" id="companyid" />
<!-- jquery lib -->
<script src="//www.lgstatic.com/www/static/dep/ExplorerCanvas/excanvas_329c23c.js"></script>
<script type="text/javascript" src="//www.lgstatic.com/www/static/pkg/vendor_a673406.js"></script>
<script type="text/javascript">/*resourcemap*/
require.config({paths:{
    "common/widgets/common/msgPopup": "//www.lgstatic.com/www/static/common/widgets/common/msgPopup_ec89803"
}});</script>
<script type="text/javascript" src="//www.lgstatic.com/www/static/pkg/job-detail/page/index/main.html_aio_4787e07.js"></script>
<script type="text/javascript" src="//www.lgstatic.com/www/static/pkg/widgets_e58a3ef.js"></script>
<script type="text/javascript" src="//www.lgstatic.com/www/static/common/widgets/common/userinfo_7f282e9.js"></script>
<script type="text/javascript" src="//www.lgstatic.com/www/static/pkg/layout_89bb557.js"></script>
<script type="text/javascript" src="//www.lgstatic.com/www/static/pkg/job-detail/page/index/main.html_aio_2_43e9d89.js"></script>
<script type="text/javascript">
    require(['common/widgets/header_c/modules/emailvalid/main']);



    require(['common/widgets/header_c/layout/main']);


    require(['common/widgets/recommend/main']);


    require(['common/widgets/footer_c/modules/feedback/feedback']);


    require(['common/widgets/footer_c/layout/main']);

    $(document).ready(function () {
        var selector = '#webchat7moor';
        if ($(selector).length) {
            return;
        }

        var jqIframe = $('<iframe>', {
            id: selector.slice(1),
            src: '//www.lgstatic.com/third-parties/webchat7moor/main_00d91c6.html',
            style: 'margin:0;'
            + 'padding:0;'
            + 'width:320px;'
            + 'height:500px;'
            + 'border-width:0;'
            + 'border-radius: 3px;'
            + 'transition: height 0.5s ease-out;'
            + 'z-index:-99999;'
            + 'display: none;'
            + 'bottom:0;'
            + 'right:0;'
            + 'position:fixed;'
        });
        $(document.body).append(jqIframe);

        var child = jqIframe[0].contentWindow;
        var target = window.location.protocol + '//' + (window.GLOBAL_CDN_DOMAIN || 'www.lgstatic.com');

        $('#onlineService, #feedback-icon').on('click', function (e) {
            jqIframe.css('z-index', 99999).show();
            child.postMessage('{"code":1,"message":"open webchat plugin"}', target);
        });

        $(window).on('message', function (e) {
            var origin = e.origin || e.originalEvent.origin;
            if (origin.indexOf(target) !== 0) {
                return;
            }

            var data = e.data || e.originalEvent.data;
            if (data.code === 2 && typeof data.css !== 'undefined') {
                jqIframe.css(data.css);
            } else {
                jqIframe.css('z-index', -99999).hide();
            }
        });
    });


    window.global = window.global || {};
    window.global.qrImgSrc = '//www.lgstatic.com/';
    window.global.positionId = '2612416';
    window.global.companyId = '25439';
    window.global.experienceCount = '380';
    window.global.userId = '';
    require(['common/widgets/login_toolbar/main'])


    //业务主模块
    require(['job-detail/page/index/main']);

//
//    function loadData() {
//        jobid=document.getElementById("jobid").value;
//        var request = new XMLHttpRequest();
//        var url = "http://localhost:8080/job-portal/jobdetail/"+jobid;
//        request.open("GET", url);
//        request.send();
//        request.onreadystatechange = function () {
//            if (request.readyState == 4) {
//                if (request.status == 200) {
//                    var ajdate = JSON.parse(request.responseText);
//                    if (ajdate.msg == "success") {
//                        setData(ajdate.data);
//                    }
//                }
//            }
//        }
//    }
//
//    function setData(data) {
//        document.getElementById("postdepartment").innerHTML=data.postdepartment;
//        document.getElementById("job_name_title").innerHTML=data.postdepartment;
//        document.getElementById("salary").innerHTML=data.salary;
//        document.getElementById("city").innerHTML=data.workplace;
//         document.getElementById("workyear").innerHTML=data.experience;
//         document.getElementById("education").innerHTML=data.educationbackground;
//         document.getElementById("jobkind").innerHTML=data.jobkind;
//         document.getElementById("publishtime").innerHTML=data.publishtime;
//         document.getElementById("advantage").innerHTML=data.welfare.replace("职位诱惑 :","");
//         var description;
//         if(data.duty!=undefined){
//             description="工作职责"+data.duty;
//         }
//         if(data.postrequest!=undefined){
//             description+="</br></br>工作要求"+data.postrequest;
//         }
//         document.getElementById("description").innerHTML=description;
//         document.getElementById("positionaddress").innerHTML=data.positionaddress;
//         document.getElementById("companynickname").innerHTML=data.companynickname.replace("拉勾认证企业","");
//         document.getElementById("companyfeild").innerHTML=data.companyfeild;
//         document.getElementById("companydevelopestage").innerHTML=data.companydevelopestage;
//         var company=document.getElementById("company");
//         var img=document.createElement("img");
//         img.setAttribute("src","http://"+data.companyiconurl);
//         img.setAttribute("width",96);
//         img.setAttribute("height",96);
//         company.appendChild(img);
//         document.getElementById("companyscale").innerHTML=data.companyscale;
//         document.getElementById("companyhomepageurl").href=data.companyhomepageurl;
//         document.getElementById("companyhomepageurl").innerHTML=data.companyhomepageurl;
//         document.getElementById("companydevelopestage").innerHTML=data.companydevelopestage;
//    }
</script>
<script type="text/javascript" src="//www.lgstatic.com/www/static/common/static/js/plat_tj_resume_log_1097b01.js"></script>
</body>
</html>

