<html>
<head>
    <title>Products</title>
    <link href="/css/styles.css" rel="stylesheet">
</head>

<div>
    <h2>
        Our products!
    </h2>
    <table>
        <tr>
            <th>Code</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
    <#list productsFromServer as product>
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
        </tr>
    </#list>
    </table>
</div>
<div class="form-style-2">
    <form method="post" action="/products">
        <label for="code">Code
            <input class="input-field" id="code" name="code">
        </label>
        <br>
        <label for="price">Count
            <input class="input-field" id="count" name="count">
        </label>
        <br>
        <input type="submit" value="Buy!">
    </form>
</div>
</html>
