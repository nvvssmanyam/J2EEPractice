create table person
(
	id	integer not null,
	name varchar(255) not null,
	addr varchar(255),
	dob timestamp,
	primary key(id)
);

insert into person (id, name, addr, dob) values(10001, 'Ranga', 'Hyderabad', sysdate());
insert into person (id, name, addr, dob) values(10002, 'Chandra', 'Hyderabad', sysdate());
insert into person (id, name, addr, dob) values(10003, 'Jittu', 'Bangalore', sysdate());