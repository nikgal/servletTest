<html>
<head> 
	<link rel="stylesheet" type="text/css" href="css/main.css"/>
</head>
<body>
<h2>Hello World!</h2>

<%
for(int i = 0; i<10;i++){%>
	<h2>Hello World!<%=(int[])request.getAttribute("numbers")%></h2>
<%}%>

</body>
</html>
