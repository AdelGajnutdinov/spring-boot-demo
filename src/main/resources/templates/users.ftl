<html>
<head>
    <title>Users</title>
    <link href="/css/styles.css" rel="stylesheet">
</head>

<div class="form-style-2">
    <h2>
        Already in System!
    </h2>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
    <#list usersFromServer as user>
        <tr>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
        </tr>
    </#list>
    </table>
</div>
</html>
