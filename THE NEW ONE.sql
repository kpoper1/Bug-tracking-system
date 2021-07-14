create database OOP
create table status
( s_id int primary key,
sname nvarchar(50)
)
create table role
( rID int primary key,
 rname nvarchar(50)
)
create  table project
( projectID int primary key,
p_name nvarchar(100),
pm_ID int 
)
--pm_ID int foreign key references manager(manID)
alter table project add foreign key (pm_ID) references manager(manID)
create table users
( uID int primary key,
 rID int ,
 uname nvarchar(50)
)
alter table users add foreign key (rID) references role (rID)

alter table users add password nvarchar(100)
create table bugs
( bID int primary key,
   bname nvarchar(100),
   priority nvarchar(50),
   btype nvarchar(100),
   bdate nvarchar(100),
   level nvarchar(100),
   statusname nvarchar(100),
   s_id int,
   project_name nvarchar(100),
  pID int
  )  
  alter table bugs add assign_devID int
alter table bugs add foreign key (assign_devID)  references developer(dev_id)
alter table bugs add foreign key (s_id) references status (s_id)
alter table bugs add foreign key (pID) references project(projectID)
  --assign_devID int foreign key references developer(devID) done,
  --inner join project name in bugs done
--select project_name  
--from bugs
--inner join project
--on bugs.project_name=project.p_name
-- --inner join status name from status to bugs done
-- select statusname 
-- from bugs 
-- inner join status
-- on bugs.statusname=status.sname

--select status from bugs inner join status 

create table developer
( dev_id int primary key,
  sid int ,
  bugname nvarchar(50),
  test_id int
) --testID int foreign key references tester(testID)
alter table developer add foreign key (test_id) references tester(testID)
alter table developer add foreign key (sid) references status (s_id)

create table tester
( testID int primary key,
   b_name nvarchar(100),
   priority_t nvarchar(50),
   b_type nvarchar(100),
   b_date nvarchar(100),
   level_t nvarchar(100),
   status int,
   projectID int,
   projectname nvarchar(100),
   screenshot nvarchar(150),
   devID int, 
   foreign key (status) references status(s_id),
 foreign key (devID) references developer(devID))
 alter table tester add foreign key (status) references status (s_id)
 alter table tester add foreign key (devID) references developer (dev_id)
 alter table tester add foreign key (projectID) references project(projectID)
 --inner join project name done
 --inner join 3l4aan nzhe elbugname, bug type, priority, bdate, level, status done
 
 --select projectname 
 --from tester 
 --inner join project
 --on tester.projectname=project.p_name

 --select  b_name, b_type, priority_t, b_date, level_t, status,projectname
 --from tester 
 --inner join bugs
 --on tester.b_name=bugs.bname and tester.b_type=bugs.btype 
 --and tester.priority_t=bugs.priority
 --and tester.b_date=bugs.bdate
 --and tester.level_t=bugs.level
 --and tester.status=bugs.statusname
 --and tester.projectname=bugs.project_name

create table admin
( adID int primary key,
  bugID int,
 userID int ,
 username nvarchar(100),
 userrole nvarchar(100),
 bugname nvarchar(100),
 projectname nvarchar(100))
  alter table admin add foreign key (bugID) references bugs (bID)
 alter table admin add foreign key (userID) references users (uID)
 alter table admin add pID int
 --inner join  username, userrole done
 --inner join bugname, projectname done
--select username,userrole
--from admin 
--inner join users 
--on admin.username=users.uname

--select bugname, projectname
--from admin 
--inner join bugs 
--on admin.bugname = bugs.bname
--and admin.projectname=bugs.project_name


create table manager
( manID int primary key,
   testID int ,
   devID int ,
    bugid int foreign key references bugs(bID),
	status_name nvarchar(100)
   --inner join status done 
   --performance in java 
)
 alter table manager add foreign key (testID) references tester (testID)
 alter table manager add foreign key (devID) references developer (dev_id)
--select status_name 
--from manager 
--inner join bugs on manager.status_name=bugs.statusname
