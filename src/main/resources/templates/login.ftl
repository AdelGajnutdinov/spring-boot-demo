<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Login</title>
    <link href="/css/styles.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<#if error??>
<div class="alert alert-danger" role="alert">Your login or password is incorrect!</div>
</#if>
<div class="form-style-2">
    <h2>
        Please Login!
    </h2>
    <form method="post" action="/login">
        <label for="login">Login
            <input class="input-field" type="text" id="login" name="login">
        </label>
        <br>
        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <br>
        <label for="remember-me">
            <input type="checkbox" id="remember-me" name="remember-me">Remember Me, plz</label>
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>
