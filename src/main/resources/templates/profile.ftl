<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Profile</title>
    <link href="/css/styles.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<h2>${user.firstName}</h2>
<h2>${user.lastName}</h2>
<a href="/logout">Logout</a>
<h2>
    Your cart!
</h2>
<#if productsFromServer??>
<div>
    <table>
        <tr>
            <th>Code</th>
            <th>Name</th>
            <th>Count</th>
            <th>Price</th>
        </tr>
        <#list productsFromServer as product>
            <tr>
                <td>${product.code}</td>
                <td>${product.name}</td>
                <td>${product.count}</td>
                <td>${product.price}</td>
            </tr>
        </#list>
        <tr>
            <th></th>
            <th></th>
            <th>Total price:</th>
            <td>${totalPrice}</td>
        </tr>
    </table>
</div>
<#else>
<h2>
    You have made no orders yet :(
</h2>
</#if>
</body>
</html>