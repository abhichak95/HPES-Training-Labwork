-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.67-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema assignment
--

CREATE DATABASE IF NOT EXISTS assignment;
USE assignment;

--
-- Definition of table `voter`
--

DROP TABLE IF EXISTS `voter`;
CREATE TABLE `voter` (
  `name` varchar(50) NOT NULL,
  `age` int(2) NOT NULL default '18',
  `gender` varchar(1) NOT NULL,
  `dob` varchar(15) NOT NULL,
  `email_id` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `vote_status` int(1) NOT NULL default '0',
  PRIMARY KEY  (`email_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `voter`
--

/*!40000 ALTER TABLE `voter` DISABLE KEYS */;
INSERT INTO `voter` (`name`,`age`,`gender`,`dob`,`email_id`,`password`,`vote_status`) VALUES 
 ('abcd',20,'M','12345','abcd','efgh',1),
 ('abd',20,'M','12345','abd','poi',1),
 ('Abhi',19,'M','1995-01-27','hello','hello',1),
 ('Abhi2',19,'M','1995-01-27','hello1','hello1',1),
 ('qwer',20,'M','12345','qwer','qwer',1),
 ('qwerty',20,'M','1234567890','qwerty','qwerty',1);
/*!40000 ALTER TABLE `voter` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
