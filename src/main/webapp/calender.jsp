<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Hello ${name}</title>
</head>
<body>
	<h1>Ga Je Mee!?</h1>
	<br /> Hello ${name}
	<br />
	<br />

	<c:forEach items="${calender}" var="calender">
		<br />Name: <c:out value="${calender.name}" />
		<br />Year: <c:out value="${calender.year}" />
		<br />
	</c:forEach>
</body>
</html>