CREATE TABLE `student` (
  `id` int(11) NOT NULL auto_increment,
  `stu_name` varchar(45) DEFAULT NULL,
  `stu_email` varchar(45) DEFAULT NULL,
  `stu_course` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;