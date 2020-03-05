<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>  
<head>  
<style>  
.error{color:red}  
</style>  
</head>  
<body>  
<form:form action="ordersearch" modelAttribute="ord">  
Customer ID: <form:input path="customerID"/> <br><br>  
<form:errors path="customerID" cssClass="error"/><br><br>  
<input type="submit" value="Search">  
<input type="reset" value="Start Over">  
</form:form>  
</body>  
</html>  