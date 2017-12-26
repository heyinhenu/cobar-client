create database dbtest1;
create database dbtest2;
create database dbtest3;
create table `iuser` (
  `id` bigint(20) not null auto_increment,
  `taobaoid` bigint(20) default '0',
  `name` varchar(20) default '',
  `upd_time` datetime default null,
  primary key (`id`)
) engine=innodb auto_increment=10 default charset=utf8;