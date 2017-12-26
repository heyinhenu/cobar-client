CREATE database DBTEST1;
CREATE database DBTEST2;
CREATE database DBTEST3;
CREATE TABLE `IUSER` (  
  `id` bigint(20) NOT NULL AUTO_INCREMENT,  
  `taobaoId` bigint(20) DEFAULT '0',  
  `name` varchar(20) DEFAULT '',  
  `upd_time` datetime DEFAULT NULL,  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;