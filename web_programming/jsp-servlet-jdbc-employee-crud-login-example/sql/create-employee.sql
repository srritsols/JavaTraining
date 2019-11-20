CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `employeeId` varchar(45) DEFAULT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
