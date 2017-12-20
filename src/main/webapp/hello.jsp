<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Hello ${name}</title>
</head>
<body>
	Hello ${name}
	<br />
	<br />

	<c:forEach items="${events}" var="event">
		Name: <c:out value="${event.eventName}" />
		Date: <c:out value="${event.date}" />
		<br />
	</c:forEach>
</body>
</html>