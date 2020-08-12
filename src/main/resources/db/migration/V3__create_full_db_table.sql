--
-- Table structure for table `users`
--
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `login` varchar(30) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `firstname` varchar(60) DEFAULT NULL,
  `lastname` varchar(60) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `langue` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;


--
-- Table structure for table `roles`
--
CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `role` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_g50w4r0ru3g9uf6i6fr4kpro8` (`role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;




--
-- Table structure for table `role_user`
--

CREATE TABLE `role_user` (
  `id` int(11) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7tjfd3wunlpu0di6qpu5asgen` (`role_id`),
  KEY `FKhvai2k29vlwpt9wod4sw4ghmn` (`user_id`),
  CONSTRAINT `FK7tjfd3wunlpu0di6qpu5asgen` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  CONSTRAINT `FKhvai2k29vlwpt9wod4sw4ghmn` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;

--
-- Table structure for table `types`
--

CREATE TABLE `types` (
  `id` int(11) NOT NULL,
  `type` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;



--
-- Table structure for table `artiste_type`
--


CREATE TABLE `artiste_type` (
  `id` int(11) NOT NULL,
  `artist_id` int(11) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjb9lckjudyevrff5066bvn5yi` (`artist_id`),
  KEY `FK834kd94e6tkrumbpkidaf4qb9` (`type_id`),
  CONSTRAINT `FK834kd94e6tkrumbpkidaf4qb9` FOREIGN KEY (`type_id`) REFERENCES `types` (`id`),
  CONSTRAINT `FKjb9lckjudyevrff5066bvn5yi` FOREIGN KEY (`artist_id`) REFERENCES `artists` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;



--
-- Table structure for table `localities`
--

CREATE TABLE `localities` (
  `id` int(11) NOT NULL,
  `postal_code` varchar(6) DEFAULT NULL,
  `locality` varchar(60) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;

--
-- Table structure for table `locations`
--
CREATE TABLE `locations` (
  `id` int(11) NOT NULL,
  `slug` varchar(60) DEFAULT NULL,
  `designation` varchar(60) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `locality_id` int(11) DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,

  PRIMARY KEY (`id`),
  KEY `FK77hu8gj8t78jri9tncc5w79cf` (`locality_id`),
  CONSTRAINT `FK77hu8gj8t78jri9tncc5w79cf` FOREIGN KEY (`locality_id`) REFERENCES `localities` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;


--
-- Table structure for table `shows`
--
CREATE TABLE `shows` (
  `id` int(11) NOT NULL,
  `slug` varchar(60) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` text,
  `poster_url` varchar(255) DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL,
  `bookable` bit(1) NOT NULL,
  `price` float NOT NULL,

  PRIMARY KEY (`id`),
  KEY `FK71bpp8yqp5gsimorvud4hw7pg` (`location_id`),
  CONSTRAINT `FK71bpp8yqp5gsimorvud4hw7pg` FOREIGN KEY (`location_id`) REFERENCES `locations` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;





CREATE TABLE `artiste_type_show` (
  `id` int(11) NOT NULL,
  `artist_type_id` int(11) DEFAULT NULL,
  `show_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9hqh5ws9o18hsv249xnpqneni` (`artist_type_id`),
  KEY `FKrj9a76fdc02amg7dqivatnn4x` (`show_id`),
  CONSTRAINT `FK9hqh5ws9o18hsv249xnpqneni` FOREIGN KEY (`artist_type_id`) REFERENCES `artiste_type` (`id`),
  CONSTRAINT `FKrj9a76fdc02amg7dqivatnn4x` FOREIGN KEY (`show_id`) REFERENCES `shows` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;



--
-- Table structure for table `representations`
--
CREATE TABLE `representations` (
  `id` int(11) NOT NULL,
  `show_id` int(11) DEFAULT NULL,
  `when` timestamp NULL DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgqakkndousv8wnvorqc0gxi9a` (`location_id`),
  KEY `FKy5ar9ujldy3xw9p62v1qj3cs` (`show_id`),
  CONSTRAINT `FKgqakkndousv8wnvorqc0gxi9a` FOREIGN KEY (`location_id`) REFERENCES `locations` (`id`),
  CONSTRAINT `FKy5ar9ujldy3xw9p62v1qj3cs` FOREIGN KEY (`show_id`) REFERENCES `shows` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;


--
-- Table structure for table `representation_user`
--

CREATE TABLE `representation_user` (
  `id` int(11) NOT NULL,
  `representation_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `places` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKq2e0m47f76gpu7rbhyy8c9lvl` (`user_id`),
  KEY `FKe66sbi0sqmyw3hvtth2krm5tq` (`representation_id`),
  CONSTRAINT `FKe66sbi0sqmyw3hvtth2krm5tq` FOREIGN KEY (`representation_id`) REFERENCES `representations` (`id`),
  CONSTRAINT `FKq2e0m47f76gpu7rbhyy8c9lvl` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;


--
-- Table structure for table `hibernate_sequence`
--
CREATE TABLE `hibernate_sequence` (
  `next_val` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=UTF8mb4_unicode_ci;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` VALUES (1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1);


