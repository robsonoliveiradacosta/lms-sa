create table account (
    id serial primary key,
    name varchar(64) not null,
    email varchar(64) unique,
    password varchar(32) not null
);
