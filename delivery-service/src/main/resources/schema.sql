create table delivery(
    id serial primary key ,
    pickup_address varchar,
    state String,
    restaurant_id int,
    pickup_time timestamp,
    delivery_address varchar,
    delivery_time timestamp,
    assigned_courier int,
    ready_by timestamp
);
create table courier(
    id serial primary key ,
    available bit
);

create table action(
    id serial primary key
    type_action varchar,
    address varchar,
    time timestamp,
    delivery_id int,
    courier_id int
)