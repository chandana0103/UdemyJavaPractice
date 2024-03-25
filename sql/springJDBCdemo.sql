create table student(
    rollno int primary key,
    name varchar(30),
    marks int
);

select * from student order by rollno ASC;

insert into student(rollno,name,marks) values(101,'sonu',45);
insert into student(rollno,name,marks) values(102,'chotu',75);
insert into student(rollno,name,marks) values(103,'chinnu',85);

update student set marks=78 where rollno=101;