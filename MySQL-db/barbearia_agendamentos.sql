-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: barbearia
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agendamentos`
--

DROP TABLE IF EXISTS `agendamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agendamentos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `agendamento` timestamp NULL DEFAULT NULL,
  `data_agend` date DEFAULT NULL,
  `hora_inicio` time DEFAULT NULL,
  `hora_termino` time DEFAULT NULL,
  `usuario_id` int DEFAULT NULL,
  `pagamento_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_agendamentos_pagamentos` (`pagamento_id`),
  KEY `FKs5lmx5o5udlyyh6qj75gy2jkf` (`usuario_id`),
  CONSTRAINT `fk_agendamentos_pagamentos` FOREIGN KEY (`pagamento_id`) REFERENCES `pagamentos` (`id`) ON DELETE CASCADE,
  CONSTRAINT `fk_pagamento_agendamento` FOREIGN KEY (`pagamento_id`) REFERENCES `pagamentos` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FKs5lmx5o5udlyyh6qj75gy2jkf` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendamentos`
--

LOCK TABLES `agendamentos` WRITE;
/*!40000 ALTER TABLE `agendamentos` DISABLE KEYS */;
INSERT INTO `agendamentos` VALUES (2,'2023-05-12 23:13:54','2023-05-20','08:00:00','09:00:00',2,3),(3,'2023-05-12 23:13:54','2023-05-20','10:00:00','11:00:00',3,4),(4,'2023-05-12 23:13:54','2023-05-20','13:00:00','14:00:00',4,5),(7,'2023-05-12 23:13:54','2023-05-21','14:00:00','15:00:00',7,8),(8,'2023-05-12 23:13:54','2023-05-22','08:30:00','09:30:00',8,9),(9,'2023-05-12 23:13:54','2023-05-22','10:30:00','11:30:00',9,10),(11,'2023-05-12 23:14:39','2023-05-23','11:30:00','12:30:00',11,12);
/*!40000 ALTER TABLE `agendamentos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-07 16:08:13
