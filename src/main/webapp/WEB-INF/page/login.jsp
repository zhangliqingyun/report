<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>   
    <title>报表管理</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/style/img/headlogo.ico"> 
    <link href="${pageContext.request.contextPath}/style/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/style/css/font-awesome.css" rel="stylesheet">   
    <link href="${pageContext.request.contextPath}/style/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/style/css/style.css" rel="stylesheet">
    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>
                <h1 class="logo-name">R</h1>           
            </div>   
            <h3>欢迎使用报表管理系统</h3>      
            <div style="height:10px;color:red">${message}</div>                               
            <form class="m-t" role="form" action="${pageContext.request.contextPath}/home" method="post">   
                <div class="form-group">
                    <input type="text" name="username" class="form-control" placeholder="用户名" required="">
                </div>    
                <div class="form-group">
                    <input type="password" name="password" class="form-control" placeholder="密码" required="">
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>    
            </form>
        </div>
    </div>
    
    <!-- 全局js -->
    <script src="${pageContext.request.contextPath}/style/js/jquery.min.js"></script>   
    <script src="${pageContext.request.contextPath}/style/js/bootstrap.min.js"></script>     
</body>
</html>