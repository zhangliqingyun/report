<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>   
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">    
    <meta name="renderer" content="webkit">
    <title>报表管理</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/style/img/headlogo.ico">
    <link href="${pageContext.request.contextPath}/style/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/style/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/style/css/animate.css" rel="stylesheet">     
    <link href="${pageContext.request.contextPath}/style/css/style.css" rel="stylesheet">      
    
</head>

<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
    <div id="wrapper">
        <!--左侧导航开始-->
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="nav-close">
                <i class="fa fa-times-circle"></i>
            </div>
            <div class="sidebar-collapse">
                <ul class="nav" id="side-menu">
                    <li class="nav-header">
                        <div class="profile-element">
                     	    <h3>报表管理系统</h3>    
                        </div>
                    </li>
                    <li>
                        <a href="#">
                            <i class="fa fa-table"></i>
                            <span class="nav-label">数据入库</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="nav nav-second-level">           
                            <li>             
                                 <a class="J_menuItem" href="importPage">导入数据</a>
                            </li>
                        </ul>

                    </li>
                    <li>
                        <a href="#">
                            <i class="fa fa fa-bar-chart-o"></i>
                            <span class="nav-label">报表统计</span>
                            <span class="fa arrow"></span>
                        </a>   
                        <ul class="nav nav-second-level">      
                            <li>
                                <a class="J_menuItem"  href="reportPage">报表生成</a>    
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <!--左侧导航结束-->
        
        <!--右侧部分开始-->
        <div id="page-wrapper" class="gray-bg dashbard-1">
            <div class="row border-bottom">
                <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                    <div class="navbar-header">
                    	<a class="navbar-minimalize" href=""></a>
                    </div>
                    <ul class="nav navbar-top-links navbar-right">
                        <li>
                            <a class="dropdown-toggle count-info" data-toggle="dropdown" href="">                           
                                <i class="fa">欢迎您:</i>
                                <span class="text-muted text-xs" id="user">${sessionScope.user.realname}<b class="caret"></b></span>   
                            </a>   
                            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                <li><a class="J_menuItem" href="" data-ng-click='showUserDetail()'>个人资料</a></li>
                                <li class="divider"></li>
                                <li><a href="" data-ng-click='showUserChangePwd()'>修改密码</a></li>
                            </ul>   
                        </li>
                        <li class="dropdown hidden-xs">
                            <a class="right-sidebar-toggle" aria-expanded="false">
                                <i class="fa fa-tasks"></i> 主题
                            </a>
                        </li>
                    </ul>
                </nav>
             </div>
            <div class="row content-tabs">
                <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
                </button>
                <nav class="page-tabs J_menuTabs">    
                    <div class="page-tabs-content">                            
                        <a href="javascript:void(0);" class="active J_menuTab" data-id="homePage">首页</a>
                    </div>  
                </nav>
                <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
                </button>
                <div class="btn-group roll-nav roll-right">  
                    <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                    </button>
                    <ul role="menu" class="dropdown-menu dropdown-menu-right">
                        <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                        </li>
                        <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                        </li>
                    </ul>   
                </div>   
                <a href="login" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
            </div>    
            
            <!-- 显示区连接开始 -->          
            <div class="row J_mainContent" id="content-main">                          
                <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="homePage" frameborder="0" data-id="homePage" seamless></iframe>
            </div>         
            <!-- 显示区连接结束-->  
            
            <!-- 底部版本提示开始 -->
            <div class="footer">
                <div class="pull-right">
                    ${version.num }, 最近更新: ${version.updatedate}    
                </div>
            </div>
            <!-- 底部版本提示结束 -->
            
        </div>
        <!--右侧部分结束-->
        
        <!--右侧边栏开始-->
        <div id="right-sidebar">
            <div class="sidebar-container">      
               	<div class="tab-content">
                    <div id="tab-1" class="tab-pane active">
                        <div class="sidebar-title">
                            <h3> <i class="fa fa-comments-o"></i> 主题设置</h3>
                            <small><i class="fa fa-tim"></i> 你可以从这里选择和预览主题的布局和样式，这些设置会被保存在本地，下次打开的时候会直接应用这些设置。</small>
                        </div>
                        <div class="skin-setttings">
                            <div class="title">主题设置</div>
                            <div class="setings-item">
                                <span>收起左侧菜单</span>
                                <div class="switch">
                                    <div class="onoffswitch">
                                        <input type="checkbox" name="collapsemenu" class="onoffswitch-checkbox" id="collapsemenu">
                                        <label class="onoffswitch-label" for="collapsemenu">
                                            <span class="onoffswitch-inner"></span>
                                            <span class="onoffswitch-switch"></span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="setings-item">
                                <span>固定顶部</span>
                                <div class="switch">
                                    <div class="onoffswitch">
                                        <input type="checkbox" name="fixednavbar" class="onoffswitch-checkbox" id="fixednavbar">
                                        <label class="onoffswitch-label" for="fixednavbar">
                                            <span class="onoffswitch-inner"></span>
                                            <span class="onoffswitch-switch"></span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="setings-item">
                                <span>固定宽度</span>
                                <div class="switch">
                                    <div class="onoffswitch">
                                        <input type="checkbox" name="boxedlayout" class="onoffswitch-checkbox" id="boxedlayout">
                                        <label class="onoffswitch-label" for="boxedlayout">
                                            <span class="onoffswitch-inner"></span>
                                            <span class="onoffswitch-switch"></span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="title">皮肤选择</div>
                            <div class="setings-item default-skin nb">
                                <span class="skin-name "><a href="#" class="s-skin-0">默认皮肤</a></span>
                            </div>
                            <div class="setings-item blue-skin nb">
                                <span class="skin-name "><a href="#" class="s-skin-1">蓝色主题</a></span>
                            </div>
                            <div class="setings-item yellow-skin nb">
                                <span class="skin-name "><a href="#" class="s-skin-3">黄色/紫色主题</a></span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--右侧边栏结束-->
    </div>
    
   <!-- 全局js -->   
    <script src="${pageContext.request.contextPath}/style/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/style/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/style/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="${pageContext.request.contextPath}/style/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="${pageContext.request.contextPath}/style/js/plugins/layer/layer.min.js"></script>
    <!-- 自定义js -->      
    <script src="${pageContext.request.contextPath}/style/js/hplus.js"></script>  
    <script src="${pageContext.request.contextPath}/style/js/contabs.js"></script>
    <!-- 第三方插件 -->
    <script src="${pageContext.request.contextPath}/style/js/plugins/pace/pace.min.js"></script>
</body>
</html>