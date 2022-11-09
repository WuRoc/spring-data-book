drop table if exists product;

create table product (
	id varchar(255) not null,
    price varchar(255) not null,
	name varchar(255),
    description varchar(1000),
    date varchar(255),
	primary key (id)
);

insert into product (id,name,description,price,date) values('PR1...210','BlackBerry 8100 Pearl','',124.60,'2022-11-17');
insert into product (id,name,description,price,date) values('PR1...211','Sony Ericsson W810i','',139.45,'2022-11-17');
insert into product (id,name,description,price,date) values('PR1...212','Samsung MM-A900M Ace','',97.80,'2022-11-17');
insert into product (id,name,description,price,date) values('PR1...213','Toshiba M285-E 14','',166.20,'2022-11-17');
insert into product (id,name,description,price,date) values('PR1...214','Nokia 2610 Phone','',145.50,'2022-11-17');
insert into product (id,name,description,price,date) values('PR1...215','CN Clogs Beach/Garden Clog','',190.70,'2022-11-17');
insert into product (id,name,description,price,date) values('PR1...216','AT&T 8525 PDA','',289.20,'2022-11-17');
insert into product (id,name,description,price,date) values('PR1...217','Canon Digital Rebel XT 8MP Digital SLR Camera','',13.70,'2022-11-17');
insert into product (id,name,description,price,date) values('PR2...310','Kindle Fire','',199.00,'2022-11-17');
insert into product (id,name,description,price,date) values('PR2...311','Apple TV MD199LL/A','',94.86,'2022-11-17');
insert into product (id,name,description,price,date) values('PR2...312','Medialink Wireless N Router','',49.99,'2022-11-17');
insert into product (id,name,description,price,date) values('PR2...313','Garmin nuvi 1450LMT','',147.44,'2022-11-17');
insert into product (id,name,description,price,date) values('PR2...314','Roku 2 XS 1080p Streaming Player','',99.00,'2022-11-17');
insert into product (id,name,description,price,date) values('PR2...315','Sony BDP-S590 3D Blu-ray Disk Player','',86.99,'2022-11-17');
insert into product (id,name,description,price,date) values('PR2...316','GoPro HD HERO2','',241.14,'2022-11-17');
insert into product (id,name,description,price,date) values('PR2...317','Toshiba 32C120U 32-Inch LCD HDTV','aa',239.99,'2022-11-17');
insert into product (id,price,name,description,date) values('1122323231','dim','tmp_english_student_read_speed_ninet','select student_id,stage_id,case when stage_speed >=200 then ceil(stage_speed /2) else stage_speed end as diff_stage_speed from (selecta2.student_id as student_id, stage_id, case when diff_stage_speed is not null then  diff_stage_speed else speed_value end as stage_speed,max_diff_day,case when max_diff_day = 0 then  1 when max_diff_day >0 and max_diff_day <= 6 then 7 when max_diff_day >6 and max_diff_day <= 14  then 15 from dim.tmp_english_student_read_speed_ninet','2022-11-17');