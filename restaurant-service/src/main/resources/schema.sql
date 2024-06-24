create table restaurant(
    id serial primary key,
    name varchar(500)
);
create table menu_item(
    id varchar(500) primary key,
    name varchar(500),
    price int8,
    restaurant_id serial
)