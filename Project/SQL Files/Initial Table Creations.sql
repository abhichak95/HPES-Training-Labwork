show schemas;
drop schema if exists backslash;
create schema BackSlash;
show schemas;
use backslash;
show tables;
drop table if exists all_users;
create table all_users (
	user_id int unsigned not null primary key auto_increment,
    username varchar(25) not null unique,
    password varchar(25) not null
);
desc all_users;

drop table if exists user_personal_details;
create table user_personal_details (
	user_id int primary key auto_increment,
	first_name varchar(50) not null,
    middle_name varchar(50),
    last_name varchar(50),
    email_primary varchar(50) not null unique,
    email_secondary varchar(50),
    contact_primary numeric not null,
    contact_secondary numeric,
    dob date,
    gender enum('M', 'F', 'O')    
);
desc user_personal_details;

drop table if exists user_educational_details;
create table user_educational_details (
	user_id int primary key auto_increment,
	last_institution varchar(100),
    degree varchar(50),
    major varchar(50),
    year_completed int(4)
);
desc user_educational_details;

drop table if exists user_work_details;
create table user_work_details (
	user_id int primary key auto_increment,
	organization varchar(100),
    position varchar(50),
    work_since int(4)
);
desc user_work_details;

drop table if exists user_other_details;
create table user_other_details (
	user_id int primary key auto_increment,
	hometown varchar(30),
    house_no varchar(30),
    street varchar(30),
    city varchar(30),
    state varchar(30)
);
desc user_other_details;

drop table if exists all_communities;
create table all_communities (
	community_id int primary key auto_increment,
    community_name varchar(30) not null unique,
    admin_id int not null
);
desc all_communities;

drop table if exists community_users;
create table community_users (
	count int unsigned primary key auto_increment,
	community_id int not null,
    user_id int not null
);

drop table if exists post;
create table post (
	count int primary key auto_increment,
	content varchar(256) not null,
    user_id int not null,
    community_id int not null,
    date_time datetime not null
);