create table basicdata(
stu_id varchar(10) PRIMARY KEY,
stu_name varchar(30),
stu_address varchar(30));

create table marks(
stu_id varchar(10) primary key,
chemistry int(3),
physics int(3),
maths int(3));

insert into basicdata(stu_id,stu_name,stu_address) VALUES
('TG/001','Amila','Matara'),
('TG/002','Basil','Hambanthota'),
('TG/003','Charles','jaffna'),
('TG/004','Debian','colombo');

insert into marks(stu_id,chemistry,physics,maths) VALUES
('TG/001',65,75,80),
('TG/002',50,40,60),
('TG/003',55,85,35),
('TG/004',85,75,85);