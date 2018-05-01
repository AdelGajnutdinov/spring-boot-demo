<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Product Adding</title>
    <link href="/css/styles.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="form-style-2">
    <h2>
        Please add new product!
    </h2>
    <form method="post" action="/addProduct">
        <label for="name">Name
            <input class="input-field" id="name" name="name">
        </label>
        <br>
        <label for="price">Price
            <input class="input-field" id="price" name="price">
        </label>
        <input type="submit" value="Add!">
        <br>
    </form>
</div>
</body>
</html>
