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

	<c:forEach items="${events}" var="event">
		<br />Name: <c:out value="${event.eventName}" />
		<br />Date: <c:out value="${event.date}" />
		<br />Time: <c:out value="${event.time}" />
		<br />Message: <c:out value="${event.message}" />
		<br />Attendees: <c:out value="${event.getAttendees().size()}" />
		<br />
	</c:forEach>
</body>
</html>