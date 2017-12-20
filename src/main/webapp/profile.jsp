<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Hello ${name}</title>
</head>
<body>
	Hello ${profile.userName}
	<br />
	<br /> Name:
	<c:out value="${profile.userName}" />

	<br /> Birthday:
	<c:out value="${profile.birthday }" />

	<br /> Email:
	<c:out value="${profile.email }" />

	<br /> Password:
	<c:out value="${profile.passWord }" />
	<br />
	<br /> Interesses:
	<br />
	<c:forEach items="${profile.preferences}" var="preference">
		<c:out value="${preference}" />

		<br />
	</c:forEach>
</body>
</html>