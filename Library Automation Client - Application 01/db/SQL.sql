-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `library`
--

/*!40000 DROP DATABASE IF EXISTS `library`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `library` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;

USE `library`;

--
-- Table structure for table `audiobooks`
--

DROP TABLE IF EXISTS `audiobooks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `audiobooks` (
  `ID` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `NAME` varchar(45) NOT NULL,
  `Written_By` varchar(45) NOT NULL,
  `Listening_Time` varchar(45) DEFAULT NULL,
  `URL` varchar(200) DEFAULT NULL,
  `Summery` varchar(1000) DEFAULT NULL,
  `Genres` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=8929 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audiobooks`
--

LOCK TABLES `audiobooks` WRITE;
/*!40000 ALTER TABLE `audiobooks` DISABLE KEYS */;
/*!40000 ALTER TABLE `audiobooks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `books` (
  `BOOK_ID` int(11) NOT NULL,
  `TITLE_OF_BOOK` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `AUTHOR_NAME` varchar(50) NOT NULL,
  `ISBN` varchar(20) DEFAULT NULL,
  `BOOK_LINK` varchar(200) DEFAULT NULL,
  `CATEGORY` varchar(50) NOT NULL,
  `SECTION` varchar(5) NOT NULL,
  `PERMISSIONS` int(11) NOT NULL DEFAULT '1',
  `BOOK_PRICE` varchar(10) DEFAULT NULL,
  `ISSUE_PERSON` int(11) DEFAULT NULL,
  PRIMARY KEY (`BOOK_ID`),
  KEY `ISSUE_PERSON` (`ISSUE_PERSON`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `e_mail`
--

DROP TABLE IF EXISTS `e_mail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `e_mail` (
  `EMAIL_ID` varchar(50) NOT NULL,
  `SUBJECT` varchar(50) NOT NULL,
  `STATUS` varchar(15) NOT NULL,
  `TIME` tinytext NOT NULL,
  `SEND_TO` int(11) DEFAULT NULL,
  KEY `SEND_TO` (`SEND_TO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `e_mail`
--

LOCK TABLES `e_mail` WRITE;
/*!40000 ALTER TABLE `e_mail` DISABLE KEYS */;
/*!40000 ALTER TABLE `e_mail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lend_table`
--

DROP TABLE IF EXISTS `lend_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `lend_table` (
  `LEND_ID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ISSUE_DATE` tinytext NOT NULL,
  `DUE_DATE` tinytext NOT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `BOOK_ID` int(11) DEFAULT NULL,
  KEY `USER_ID` (`USER_ID`),
  KEY `BOOK_ID` (`BOOK_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lend_table`
--

LOCK TABLES `lend_table` WRITE;
/*!40000 ALTER TABLE `lend_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `lend_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `library_user`
--

DROP TABLE IF EXISTS `library_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `library_user` (
  `USER_ID` int(11) NOT NULL,
  `USER_NAME` varchar(50) NOT NULL,
  `SLTC_INDEX` varchar(10) NOT NULL,
  `MOBILE_NUMBER` varchar(10) NOT NULL,
  `NIC` varchar(14) NOT NULL,
  `EMAIL_ADDRESS` varchar(50) NOT NULL,
  `SCHOOL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `BATCH_NUMBER` varchar(5) NOT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `library_user`
--

LOCK TABLES `library_user` WRITE;
/*!40000 ALTER TABLE `library_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `library_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movies`
--

DROP TABLE IF EXISTS `movies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `movies` (
  `Movie_ID` varchar(10) NOT NULL,
  `Movie_Title` varchar(50) NOT NULL,
  `Released_Year` int(11) NOT NULL,
  `Certificate` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `RUNTIME` varchar(10) NOT NULL,
  `GENRE` varchar(100) NOT NULL,
  `URL` varchar(200) NOT NULL,
  `DIRECTOR` varchar(50) NOT NULL,
  `DISCRIPTION` varchar(1000) NOT NULL,
  PRIMARY KEY (`Movie_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=998956280 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies`
--

LOCK TABLES `movies` WRITE;
/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pdf_books`
--

DROP TABLE IF EXISTS `pdf_books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pdf_books` (
  `ID` text,
  `title` text NOT NULL,
  `author` text NOT NULL,
  `description` text,
  `generes` text NOT NULL,
  `ISBN` text,
  `language` text NOT NULL,
  `url` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pdf_books`
--

LOCK TABLES `pdf_books` WRITE;
/*!40000 ALTER TABLE `pdf_books` DISABLE KEYS */;
/*!40000 ALTER TABLE `pdf_books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profit`
--

DROP TABLE IF EXISTS `profit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `profit` (
  `BILL_ID` varchar(15) NOT NULL,
  `SLTC_INDEX` varchar(15) DEFAULT NULL,
  `RECIPT_NUMBER` varchar(20) NOT NULL,
  `DATE` varchar(15) NOT NULL,
  `DISCRIPTION` varchar(50) NOT NULL,
  `VALUE` varchar(10) DEFAULT NULL,
  `COUNTER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`BILL_ID`),
  KEY `COUNTER_ID` (`COUNTER_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profit`
--

LOCK TABLES `profit` WRITE;
/*!40000 ALTER TABLE `profit` DISABLE KEYS */;
/*!40000 ALTER TABLE `profit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `return_table`
--

DROP TABLE IF EXISTS `return_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `return_table` (
  `RETURN_ID` varchar(10) NOT NULL,
  `BOOK_ID` int(11) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `TAX` int(11) NOT NULL,
  `STATUS` int(11) DEFAULT NULL,
  KEY `USER_ID` (`USER_ID`),
  KEY `BOOK_ID` (`BOOK_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `return_table`
--

LOCK TABLES `return_table` WRITE;
/*!40000 ALTER TABLE `return_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `return_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `staff` (
  `ADMIN_ID` int(11) NOT NULL,
  `ADMIN_NAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(16) NOT NULL,
  `E_MAIL_ADDRESS` varchar(50) NOT NULL,
  `MOBILE_NUMBER` int(11) NOT NULL,
  PRIMARY KEY (`ADMIN_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (3032489,'admin','admin','admin@sltc.ac.lk',455677364);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tutorials`
--

DROP TABLE IF EXISTS `tutorials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tutorials` (
  `course_id` varchar(11) DEFAULT NULL,
  `course_title` text,
  `url` text,
  `num_lectures` varchar(11) DEFAULT NULL,
  `level` text,
  `content_duration` varchar(20) DEFAULT NULL,
  `subject` text
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tutorials`
--

LOCK TABLES `tutorials` WRITE;
/*!40000 ALTER TABLE `tutorials` DISABLE KEYS */;
/*!40000 ALTER TABLE `tutorials` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-19 10:11:03
