create table restaurant(
    id serial primary key,
    name varchar(500)
);
create table menu_item(
    id serial primary key,
    code varchar(500),
    name varchar(500),
    price int8,
    restaurant_id serial
)