<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cập Nhật Thức Ăn Chăn Nuôi</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />" />
</head>
<body>
    <h1>Cập Nhật Thức Ăn Chăn Nuôi</h1>
    <form action="${pageContext.request.contextPath}/updateAnimalFeed" method="post">
        <input type="hidden" name="id" value="${animalFeed.id}" />

        <label for="name">Tên Thức Ăn:</label>
        <input type="text" id="name" name="name" value="${animalFeed.name}" required /><br /><br />

        <label for="address">Địa Chỉ:</label>
        <input type="text" id="address" name="address" value="${animalFeed.address}" required /><br /><br />

        <label for="costPrice">Giá Vốn:</label>
        <input type="number" id="costPrice" name="costPrice" step="0.01" value="${animalFeed.costPrice}" required /><br /><br />

        <label for="type">Loại:</label>
        <input type="text" id="type" name="type" value="${animalFeed.type}" /><br /><br />

        <label for="supplier">Nhà Cung Cấp:</label>
        <input type="text" id="supplier" name="supplier" value="${animalFeed.supplier}" required /><br /><br />

        <input type="submit" value="Cập Nhật" />
    </form>

    <a href="${pageContext.request.contextPath}/">Quay lại trang chính</a>
</body>
</html>