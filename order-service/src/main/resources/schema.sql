create table order(
    id serial primary key,
    version int,
    status varchar,
    consumer_id int,
    restaurant_id int,

    delivery_time timestamp,
    delivery_address varchar(500)
)
create table order_line_item(
    id serial primary key ,
    menu_item_id int,
    name varchar(500),
    quantity int,
    order_id int
)