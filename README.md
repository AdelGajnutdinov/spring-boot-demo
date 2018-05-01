### Pages
* [Profile](http://localhost:8080/) - Profile page with user's full name and his shopping cart
* [Login](http://localhost:8080/login) - Login page
* [SignUp](http://localhost:8080/signUp) - Sign up page
* [Users](http://localhost:8080/users) - Users list page
* [Products](http://localhost:8080/products) - List of products with ability to add any to shopping cart
* [AddProducts](http://localhost:8080/addProduct) - Form for admin to add new products

### Tables

In this project used four DB tables:
* *fix_user* - storing users' information
* *fix_product* - storing products' information
* *fix_cart_product* - storing carts' information
* *persistent_logins* - storing login tokens' information

Below you can see SQL queries to create them and insert basic data.
```
CREATE TABLE IF NOT EXISTS fix_user (
    id SERIAL PRIMARY KEY,
    login VARCHAR(30),
    password_hash VARCHAR(255),
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    state VARCHAR(20),
    role VARCHAR(20)
);
CREATE TABLE IF NOT EXISTS fix_product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    price NUMERIC(8, 2)
);
CREATE TABLE IF NOT EXISTS fix_cart_product (
    id SERIAL PRIMARY KEY,
    product_id INTEGER,
    owner_id INTEGER,
    product_count INTEGER
);
CREATE TABLE IF NOT EXISTS persistent_logins (
  username  VARCHAR(64) NOT NULL,
  series    VARCHAR(64) NOT NULL,
  token     VARCHAR(64) NOT NULL,
  last_used TIMESTAMP   NOT NULL,
  PRIMARY KEY (series)
);
INSERT INTO fix_product (name, price)
    VALUES ('Apple', 100);
INSERT INTO fix_product (name, price)
    VALUES ('Lemon', 50);
INSERT INTO fix_product (name, price)
    VALUES ('Pineapple', 200);
```
