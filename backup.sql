-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: mybudgetdatabase
-- ------------------------------------------------------
-- Server version	5.6.23-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `mybudgetdatabase`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `mybudgetdatabase` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybudgetdatabase`;

--
-- Table structure for table `entrys`
--

DROP TABLE IF EXISTS `entrys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrys` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Item_Date` varchar(255) DEFAULT NULL,
  `Item_Cost` double DEFAULT NULL,
  `Item_Description` varchar(255) DEFAULT NULL,
  `Item_Name` varchar(255) DEFAULT NULL,
  `MoneySpendBy` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrys`
--

LOCK TABLES `entrys` WRITE;
/*!40000 ALTER TABLE `entrys` DISABLE KEYS */;
INSERT INTO `entrys` VALUES (7,'2015-7-07',120,'flowers and vegetables','vegetables','Mom'),(8,'2015-7-07',400,'mutton','mutton','Dad'),(9,'2015-7-08',645,'bahubali telugu me and bava','cinema tickets','Self'),(12,'2015-7-08',10,'tea and biscuit','tea','Self'),(13,'2015-7-08',10,'','pani puri','Self'),(14,'2015-7-08',10,'','capsicum bujji','Self'),(15,'2015-7-08',25,'half','faluda','Self'),(16,'2015-7-08',50,'','kabab','Mom'),(17,'2015-7-09',150,'1 kg','chicken','Mom'),(18,'2015-7-09',50,'12 egs','eggs','Mom'),(19,'2015-7-09',10,'','pani puri','Self'),(20,'2015-7-10',30,'idli	','tiffin','Self'),(21,'2015-7-10',10,'tea biscuit','tea','Self'),(22,'2015-7-10',100,'Bhahubali cinema expences','Cinema','Self'),(23,'2015-7-12',800,'pista house biryani expences','biryani','Self'),(24,'2015-7-12',200,'janu cakes other stuff','cakes ext.','Self'),(25,'2015-7-13',1000,'from friday 10/7 to 13/07','Home expences','Dad'),(26,'2015-7-13',20,'me and janu','panipuri','Self'),(27,'2015-7-14',80,'','chicken','Mom'),(28,'2015-7-14',450,'','mutton','Dad'),(29,'2015-7-14',10,'','pudeena','Mom'),(30,'2015-7-14',20,'\n','lemon','Mom'),(31,'2015-7-14',20,'','milk packet','Mom'),(32,'2015-7-14',120,'me mom nandam	','cinema','Mom'),(33,'2015-7-16',650,'pears soaps, deodrants ,oil,etc;','csd canteen','Mom'),(34,'2015-7-17',245,'online order book','food panda','Self'),(35,'2015-7-19',240,'online book','food panda','Self'),(36,'2015-7-20',200,'','petrol','Self'),(37,'2015-7-20',160,'','pomogranate','Self'),(38,'2015-7-15',1139,'june bill','mts bill','Self'),(39,'2015-7-21',240,'fish 1.5 kg','fish','Mom'),(40,'2015-7-21',20,'allam','zinger','Mom'),(41,'2015-7-21',20,'','mirchi and coriander','Mom'),(42,'2015-7-16',500,'expences from 16/7 to 20/7 by mom and dad','mom dad','Dad'),(43,'2015-7-22',10,'','panipuri','Self'),(44,'2015-7-22',70,'','maramaralu and boondi','Self'),(45,'2015-7-22',100,'','coconuts','Self'),(46,'2015-7-23',180,'','palav','Self'),(47,'2015-7-23',20,'','pan','Self'),(48,'2015-7-24',10,'','sugar cane juice','Self'),(49,'2015-7-24',390,'\n','honda show room','Dad'),(50,'2015-7-24',25,'','jilebi','Self'),(51,'2015-7-24',250,'','badam','Mom'),(52,'2015-7-24',50,'','maida bombayi ravva gottalu','Mom'),(53,'2015-7-24',10,'','tea','Self'),(54,'2015-7-22',300,'','more shopping','Mom'),(55,'2015-7-25',200,'','petrol','Self'),(56,'2015-7-25',110,'','more','Self'),(57,'2015-7-25',20,'','pani puri','Self'),(58,'2015-7-25',20,'','jilebi','Self'),(59,'2015-7-26',180,'','chicken','Dad'),(60,'2015-7-26',30,'','tea','Self'),(61,'2015-7-26',200,'','cinema','Self'),(62,'2015-7-27',50,'','flowers','Mom'),(63,'2015-8-01',100,'','coconuts','Self'),(64,'2015-8-01',20,'','tea','Self');
/*!40000 ALTER TABLE `entrys` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-12 20:10:34
