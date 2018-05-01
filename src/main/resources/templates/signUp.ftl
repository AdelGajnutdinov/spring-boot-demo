<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Registration</title>
    <link href="/css/styles.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="form-style-2">
    <h2>
        Please Sign Up!
    </h2>
    <form method="post" action="/signUp">
        <label for="login">Login
            <input class="input-field" type="text" id="login" name="login">
        </label>
        <br>
        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <br>
        <label for="first-name">First name
            <input class="input-field"  id="first-name" name="firstName">
        </label>
        <br>
        <label for="last-name">Last name
            <input class="input-field"  id="last-name" name="lastName">
        </label>
        <br>
        <label for="remember-me">
            <input type="checkbox" id="remember-me" name="remember-me">Remember Me, plz</label>
        <input type="submit" value="SignUp">
        <br>
    </form>
</div>
</body>
</html>
