create table ticket(
    id serial primary key,
    state varchar,
    previous_state varchar,
    restaurant_id int,

    ready_by timestamp,
    accept_time timestamp,

    preparing_time timestamp,
    picked_up_time timestamp,
    ready_for_pickup_time timestamp
);

create table ticket_line_item(
    id serial primary key,
    quantity int,
    menuItemId varchar,
    name varchar
)