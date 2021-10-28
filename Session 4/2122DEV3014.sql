/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE TABLE `cities` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `passenger_ride` (
  `id` int(11) DEFAULT NULL,
  `ride_id` int(11) DEFAULT NULL,
  `passenger_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `passengers` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `rides` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `departure_time` datetime NOT NULL,
  `train_id` int(11) DEFAULT NULL,
  `departure_city_id` int(11) DEFAULT NULL,
  `destination_city_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

CREATE TABLE `trains` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) NOT NULL,
  `max_speed` int(11) NOT NULL,
  `max_capacity` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO `cities` (`id`, `name`) VALUES
(1, 'Halle');
INSERT INTO `cities` (`id`, `name`) VALUES
(2, 'Elsene');
INSERT INTO `cities` (`id`, `name`) VALUES
(3, 'Brussel-Zuid');
INSERT INTO `cities` (`id`, `name`) VALUES
(4, 'Aalst');

INSERT INTO `passenger_ride` (`id`, `ride_id`, `passenger_id`) VALUES
(1, 1, 1);
INSERT INTO `passenger_ride` (`id`, `ride_id`, `passenger_id`) VALUES
(2, 2, 3);


INSERT INTO `passengers` (`id`, `name`) VALUES
(1, 'Axel');
INSERT INTO `passengers` (`id`, `name`) VALUES
(2, 'Ilyes');


INSERT INTO `rides` (`id`, `departure_time`, `train_id`, `departure_city_id`, `destination_city_id`) VALUES
(1, '2021-10-28 13:48:42', 1, 1, 3);
INSERT INTO `rides` (`id`, `departure_time`, `train_id`, `departure_city_id`, `destination_city_id`) VALUES
(2, '2021-10-28 18:48:42', 1, 3, 1);
INSERT INTO `rides` (`id`, `departure_time`, `train_id`, `departure_city_id`, `destination_city_id`) VALUES
(3, '2021-10-28 15:17:42', 1, 4, 3);

INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_capacity`) VALUES
(1, 'Desiro', 50, 300);



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;