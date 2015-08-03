-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.25-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema backslash
--

CREATE DATABASE IF NOT EXISTS backslash;
USE backslash;

--
-- Definition of table `all_communities`
--

DROP TABLE IF EXISTS `all_communities`;
CREATE TABLE `all_communities` (
  `community_id` int(11) NOT NULL AUTO_INCREMENT,
  `community_name` varchar(30) NOT NULL,
  `admin_id` int(11) NOT NULL,
  PRIMARY KEY (`community_id`),
  UNIQUE KEY `community_name` (`community_name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `all_communities`
--

/*!40000 ALTER TABLE `all_communities` DISABLE KEYS */;
INSERT INTO `all_communities` (`community_id`,`community_name`,`admin_id`) VALUES 
 (1,'HPES',1);
/*!40000 ALTER TABLE `all_communities` ENABLE KEYS */;


--
-- Definition of table `all_users`
--

DROP TABLE IF EXISTS `all_users`;
CREATE TABLE `all_users` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `all_users`
--

/*!40000 ALTER TABLE `all_users` DISABLE KEYS */;
INSERT INTO `all_users` (`user_id`,`username`,`password`) VALUES 
 (1,'pradyumn','tiwari'),
 (2,'abhishek','chak');
/*!40000 ALTER TABLE `all_users` ENABLE KEYS */;


--
-- Definition of table `community_users`
--

DROP TABLE IF EXISTS `community_users`;
CREATE TABLE `community_users` (
  `count` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `community_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`count`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `community_users`
--

/*!40000 ALTER TABLE `community_users` DISABLE KEYS */;
INSERT INTO `community_users` (`count`,`community_id`,`user_id`) VALUES 
 (1,1,1),
 (2,1,2);
/*!40000 ALTER TABLE `community_users` ENABLE KEYS */;


--
-- Definition of table `post`
--

DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `count` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(256) NOT NULL,
  `user_id` int(11) NOT NULL,
  `community_id` int(11) NOT NULL,
  `date_time` datetime NOT NULL,
  PRIMARY KEY (`count`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `post`
--

/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` (`count`,`content`,`user_id`,`community_id`,`date_time`) VALUES 
 (1,'hello there',1,1,'2015-07-15 11:42:51'),
 (2,'how r u guys?',1,1,'2015-07-15 11:45:59'),
 (3,'fine bro',2,1,'2015-07-15 11:50:25');
/*!40000 ALTER TABLE `post` ENABLE KEYS */;


--
-- Definition of table `user_educational_details`
--

DROP TABLE IF EXISTS `user_educational_details`;
CREATE TABLE `user_educational_details` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `last_institution` varchar(100) DEFAULT NULL,
  `degree` varchar(50) DEFAULT NULL,
  `major` varchar(50) DEFAULT NULL,
  `year_completed` int(4) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_educational_details`
--

/*!40000 ALTER TABLE `user_educational_details` DISABLE KEYS */;
INSERT INTO `user_educational_details` (`user_id`,`last_institution`,`degree`,`major`,`year_completed`) VALUES 
 (1,'Galgotia','B.Tech','CSE',2016),
 (2,'Galgotia','B.tech','CSE',2016);
/*!40000 ALTER TABLE `user_educational_details` ENABLE KEYS */;


--
-- Definition of table `user_other_details`
--

DROP TABLE IF EXISTS `user_other_details`;
CREATE TABLE `user_other_details` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `hometown` varchar(30) DEFAULT NULL,
  `house_no` varchar(30) DEFAULT NULL,
  `street` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `state` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_other_details`
--

/*!40000 ALTER TABLE `user_other_details` DISABLE KEYS */;
INSERT INTO `user_other_details` (`user_id`,`hometown`,`house_no`,`street`,`city`,`state`) VALUES 
 (1,'Kanpur','32','Jhumritalaiyya','Kanpur','UP'),
 (2,'Varanasi','D - 61','Alpha 1','Greater noida','Uttar Pradesh');
/*!40000 ALTER TABLE `user_other_details` ENABLE KEYS */;


--
-- Definition of table `user_personal_details`
--

DROP TABLE IF EXISTS `user_personal_details`;
CREATE TABLE `user_personal_details` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `middle_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email_primary` varchar(50) NOT NULL,
  `email_secondary` varchar(50) DEFAULT NULL,
  `contact_primary` decimal(10,0) NOT NULL,
  `contact_secondary` decimal(10,0) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` enum('M','F','O') DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_primary` (`email_primary`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_personal_details`
--

/*!40000 ALTER TABLE `user_personal_details` DISABLE KEYS */;
INSERT INTO `user_personal_details` (`user_id`,`first_name`,`middle_name`,`last_name`,`email_primary`,`email_secondary`,`contact_primary`,`contact_secondary`,`dob`,`gender`) VALUES 
 (1,'Pradyumn','Kumar','Tiwari','pradyumntiwari1732@gmail.com','pradyumntiwari17@gmail.com','8802832851','8802454766','1994-02-15','M'),
 (2,'Abhishek','','Chakraborty','abhishekchak93@gmail.com','eofsentinel@outlook.com','9958345723','9415252396','1995-01-22','M');
/*!40000 ALTER TABLE `user_personal_details` ENABLE KEYS */;


--
-- Definition of table `user_work_details`
--

DROP TABLE IF EXISTS `user_work_details`;
CREATE TABLE `user_work_details` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `organization` varchar(100) DEFAULT NULL,
  `position` varchar(50) DEFAULT NULL,
  `work_since` int(4) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_work_details`
--

/*!40000 ALTER TABLE `user_work_details` DISABLE KEYS */;
INSERT INTO `user_work_details` (`user_id`,`organization`,`position`,`work_since`) VALUES 
 (1,'None','Self',2015),
 (2,'HP','Backend Web Developer',2015);
/*!40000 ALTER TABLE `user_work_details` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
