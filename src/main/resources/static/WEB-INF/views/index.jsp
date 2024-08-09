<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ThÃªm Thá»©c Än ChÄn NuÃ´i</title>
 <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />" />
</head>
<body>
	<h1>ThÃªm Thá»©c Än ChÄn NuÃ´i</h1>
    <form action="${pageContext.request.contextPath}/addAnimalFeed" method="post">
        <label for="name">TÃªn Thá»©c Än:</label>
        <input type="text" id="name" name="name" required /><br /><br />

        <label for="address">Äá»a Chá»:</label>
        <input type="text" id="address" name="address" required /><br /><br />

        <label for="costPrice">GiÃ¡ Vá»n:</label>
        <input type="number" id="costPrice" name="costPrice" step="0.01" required /><br /><br />

        <label for="type">Loáº¡i:</label>
        <input type="text" id="type" name="type" /><br /><br />

        <label for="supplier">NhÃ  Cung Cáº¥p:</label>
        <input type="text" id="supplier" name="supplier" required /><br /><br />

        <input type="submit" value="ThÃªm" />
    </form>
    
    <h2>Danh Sách Thức Ăn Chăn Nuôi</h2>
    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Tên Thức Ăn</th>
                <th>Địa Chỉ</th>
                <th>Giá Vốn</th>
                <th>Loại</th>
                <th>Nhà Cung Cấp</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="feed" items="${animalFeeds}">
                <tr>
                    <td><c:out value="${feed.id}" /></td>
                    <td><c:out value="${feed.name}" /></td>
                    <td><c:out value="${feed.address}" /></td>
                    <td><c:out value="${feed.costPrice}" /></td>
                    <td><c:out value="${feed.type}" /></td>
                    <td><c:out value="${feed.supplier}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>