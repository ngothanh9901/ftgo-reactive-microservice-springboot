create table delivery(
    id serial primary key,
    pickup_address varchar,
    state varchar,
    restaurant_id int,
    pickup_time timestamp,
    delivery_address varchar,
    delivery_time timestamp,
    assigned_courier int,
    ready_by timestamp
);
create table courier(
    id serial primary key,
    available bit,
);
create table action(
    type varchar,
    address varchar,
    time timestamp,
    delivery_id int,
    courier_id int
);

