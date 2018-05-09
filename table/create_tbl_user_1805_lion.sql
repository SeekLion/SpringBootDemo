drop table tbl_user;
CREATE table tbl_user(
	id BIGINT  not null ,
	name VARCHAR(300) not null,
	PASSWORD VARCHAR(300) not null,
	PRIMARY KEY (id)
);
