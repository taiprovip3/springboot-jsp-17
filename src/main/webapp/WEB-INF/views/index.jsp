<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm Thức Ăn Chăn Nuôi</title>
 <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />" />
</head>
<body>
	<h1>Thêm Thức Ăn Chăn Nuôi</h1>
    <form action="${pageContext.request.contextPath}/addAnimalFeed" method="post">
        <label for="name">Tên Thức Ăn:</label><br>
        <input type="text" id="name" name="name" required /><br /><br />

        <label for="address">Địa Chỉ:</label><br>
        <input type="text" id="address" name="address" required /><br /><br />

        <label for="costPrice">Giá Vốn:</label><br>
        <input type="number" id="costPrice" name="costPrice" step="0.01" required /><br /><br />

        <label for="type">Loại:</label><br>
        <input type="text" id="type" name="type" /><br /><br />

        <label for="supplier">Nhà Cung Cấp:</label><br>
        <input type="text" id="supplier" name="supplier" required /><br /><br />
        
        <input type="submit" value="Thêm" />
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
                <th>Hành Động</th>
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
                    <td>
                        <form action="${pageContext.request.contextPath}/deleteAnimalFeed" method="get" style="display:inline;">
                            <input type="hidden" name="id" value="${feed.id}" />
                            <input type="submit" value="Xóa" onclick="return confirm('Bạn có chắc chắn muốn xóa?');" />
                        </form>
                        <a href="${pageContext.request.contextPath}/updateAnimalFeed?id=${feed.id}">Cập Nhật</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>