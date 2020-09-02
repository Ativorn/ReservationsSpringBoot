-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 02 sep. 2020 à 16:51
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS = @@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION = @@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `reservations`
--

-- --------------------------------------------------------

--
-- Structure de la table `artiste_type`
--

CREATE TABLE `artiste_type`
(
    `id`        int(11) NOT NULL,
    `artist_id` int(11) DEFAULT NULL,
    `type_id`   int(11) DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `artiste_type`
--

INSERT INTO `artiste_type` (`id`, `artist_id`, `type_id`)
VALUES (6, 5, 1),
       (7, 8, 2);

-- --------------------------------------------------------

--
-- Structure de la table `artiste_type_show`
--

CREATE TABLE `artiste_type_show`
(
    `id`             int(11) NOT NULL,
    `artist_type_id` int(11) DEFAULT NULL,
    `show_id`        int(11) DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `artiste_type_show`
--

INSERT INTO `artiste_type_show` (`id`, `artist_type_id`, `show_id`)
VALUES (8, 6, 5),
       (26, 7, 5);

-- --------------------------------------------------------

--
-- Structure de la table `artists`
--

CREATE TABLE `artists`
(
    `id`        int(11)                                NOT NULL,
    `firstname` varchar(60) COLLATE utf8mb4_unicode_ci NOT NULL,
    `lastname`  varchar(60) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `artists`
--

INSERT INTO `artists` (`id`, `firstname`, `lastname`)
VALUES (1, 'Daniel', 'Marcelin'),
       (2, 'Philippe', 'Laurent'),
       (3, 'Marius', 'Von Mayenburg'),
       (4, 'Olivier', 'Boudon'),
       (5, 'Anne Marie', 'Loop'),
       (6, 'Pietro', 'Varasso'),
       (7, 'Laurent', 'Caron'),
       (8, 'Elena', 'Perez'),
       (9, 'Guillaume', 'Alexandre'),
       (10, 'Claude', 'Semal'),
       (11, 'Laurence', 'Warin'),
       (12, 'Pierre', 'Wayburn'),
       (13, 'Gwendoline', 'Gauthier');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence`
(
    `next_val` int(11) DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`)
VALUES (35),
       (35),
       (35),
       (35),
       (35),
       (35),
       (35),
       (35),
       (35),
       (35),
       (35),
       (35);

-- --------------------------------------------------------

--
-- Structure de la table `localities`
--

CREATE TABLE `localities`
(
    `id`          int(11) NOT NULL,
    `postal_code` varchar(6) COLLATE utf8mb4_unicode_ci  DEFAULT NULL,
    `locality`    varchar(60) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `localities`
--

INSERT INTO `localities` (`id`, `postal_code`, `locality`)
VALUES (1, '1000', 'Bruxelles'),
       (2, '1019', 'Farīmān'),
       (3, '1040', 'Carrizal'),
       (4, '1070', 'Fresno'),
       (5, '1090', 'Changuillo'),
       (6, '1080', 'Żabno'),
       (7, '2000', 'San Vicente'),
       (8, '3000', 'Nizhnekamsk'),
       (9, '4000', 'Las Vegas'),
       (10, '6000', 'Soledad'),
       (11, '4800', 'Athi River'),
       (12, '5000', 'Bor'),
       (13, '5042', 'Alibunan'),
       (14, '7000', 'Tiannan'),
       (15, '7419', 'Benešov nad Ploučnicí'),
       (16, '8419', 'Nsukka'),
       (17, '6005', 'Vũ Quang'),
       (18, '2408', 'Bangan-Oda'),
       (19, '8419', 'Opechenskiy Posad'),
       (20, '9419', 'Río de Oro');

-- --------------------------------------------------------

--
-- Structure de la table `locations`
--

CREATE TABLE `locations`
(
    `id`          int(11) NOT NULL,
    `slug`        varchar(60) COLLATE utf8mb4_unicode_ci  DEFAULT NULL,
    `designation` varchar(60) COLLATE utf8mb4_unicode_ci  DEFAULT NULL,
    `address`     varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    `locality_id` int(11)                                 DEFAULT NULL,
    `website`     varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    `phone`       varchar(30) COLLATE utf8mb4_unicode_ci  DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `locations`
--

INSERT INTO `locations` (`id`, `slug`, `designation`, `address`, `locality_id`, `website`, `phone`)
VALUES (1, 'theatre-royal-parc', 'Théâtre Royal du Parc', 'Rue de la Loi 3', 1, 'www.theatreduparc.be', '+3224100608'),
       (2, 'la-samaritaine', 'La Samaritaine', 'Rue de la samaritaine 24', 17, 'www.lasamaritaine.be', '+3224850608'),
       (3, 'belfius-art-collection', 'Belfius Art Collection', '50 rue de l\'écuyer', 9, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `representations`
--

CREATE TABLE `representations`
(
    `id`          int(11)   NOT NULL,
    `show_id`     int(11)        DEFAULT NULL,
    `when_time`   timestamp NULL DEFAULT NULL,
    `location_id` int(11)        DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `representations`
--

INSERT INTO `representations` (`id`, `show_id`, `when_time`, `location_id`)
VALUES (3, 5, '2020-08-26 21:00:00', 3),
       (22, 5, '2020-08-19 21:24:00', 1),
       (25, 5, '2020-08-04 20:20:00', 2),
       (27, 5, '2020-08-13 20:39:00', 3);

-- --------------------------------------------------------

--
-- Structure de la table `representation_user`
--

CREATE TABLE `representation_user`
(
    `id`                int(11) NOT NULL,
    `representation_id` int(11) DEFAULT NULL,
    `user_id`           int(11) DEFAULT NULL,
    `places`            int(11) NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `representation_user`
--

INSERT INTO `representation_user` (`id`, `representation_id`, `user_id`, `places`)
VALUES (28, 22, 9, 2),
       (29, 27, 11, 2);

-- --------------------------------------------------------

--
-- Structure de la table `roles`
--

CREATE TABLE `roles`
(
    `id`   int(11) NOT NULL,
    `role` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `roles`
--

INSERT INTO `roles` (`id`, `role`)
VALUES (1, 'ROLE_ADMIN'),
       (3, 'ROLE_AFFILIATE'),
       (2, 'ROLE_MEMBER');

-- --------------------------------------------------------

--
-- Structure de la table `role_user`
--

CREATE TABLE `role_user`
(
    `id`      int(11) NOT NULL,
    `role_id` int(11) DEFAULT NULL,
    `user_id` int(11) DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `role_user`
--

INSERT INTO `role_user` (`id`, `role_id`, `user_id`)
VALUES (2, 1, 2),
       (10, 2, 9),
       (12, 2, 11),
       (14, 2, 13),
       (24, 2, 23),
       (31, 3, 30);

-- --------------------------------------------------------

--
-- Structure de la table `shows`
--

CREATE TABLE `shows`
(
    `id`          int(11) NOT NULL,
    `slug`        varchar(60) COLLATE utf8mb4_unicode_ci  DEFAULT NULL,
    `title`       varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    `description` text COLLATE utf8mb4_unicode_ci         DEFAULT NULL,
    `poster_url`  varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    `location_id` int(11)                                 DEFAULT NULL,
    `bookable`    bit(1)  NOT NULL,
    `price`       float   NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `shows`
--

INSERT INTO `shows` (`id`, `slug`, `title`, `description`, `poster_url`, `location_id`, `bookable`, `price`)
VALUES (5, 'spectacle-primaire-', 'Spectacle primaire ', 'Spectacle classe primaires ', 'www.spectacle.be', 1, b'1',
        10);

-- --------------------------------------------------------

--
-- Structure de la table `types`
--

CREATE TABLE `types`
(
    `id`   int(11) NOT NULL,
    `type` varchar(60) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `types`
--

INSERT INTO `types` (`id`, `type`)
VALUES (1, 'Chanteur'),
       (2, 'Comedien');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users`
(
    `id`        int(11)                                 NOT NULL,
    `login`     varchar(30) COLLATE utf8mb4_unicode_ci  NOT NULL,
    `password`  varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
    `firstname` varchar(60) COLLATE utf8mb4_unicode_ci  NOT NULL,
    `lastname`  varchar(60) COLLATE utf8mb4_unicode_ci  NOT NULL,
    `email`     varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
    `langue`    varchar(2) COLLATE utf8mb4_unicode_ci            DEFAULT NULL,
    `active`    bit(1)                                  NOT NULL DEFAULT b'0'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`id`, `login`, `password`, `firstname`, `lastname`, `email`, `langue`, `active`)
VALUES (2, 'admin', '$2a$10$bU9Kpd3rJAQf6Ctyx42j8u0daFkedFmaTDQG8lEhaSIuEZD9Rva62', 'Admin', 'Admin',
        'admin@reservation.be', 'Fr', b'1'),
       (9, 'jade', '$2a$10$zeVvw4jxykdSAyG1zXCKn.A5spoAMaiu48jEmAB0KTpcfmyQwKlhe', 'Jade 2', 'Saint-Martin',
        'jade.Saintmartin@gmail.com', 'En', b'0'),
       (11, 'Oleg', '$2a$10$aXednomMl7PY545q0R4OP.Kcg7NlnZSACB4q9QqCWcD/k2GGwZcbm', 'Oleg 2', 'Vishnepolsky',
        'Vishnepolsky@gmail.com', 'Du', b'0'),
       (13, 'David_Blackmore', '$2a$10$2fFqyuKEjycmchJFT55nCOetihJRdHiUqcm/On3t0u2FgJEYKeYI6', 'David', 'Blackmore',
        'david@gmail.com', 'Fr', b'0'),
       (23, 'Frederic', '$2a$10$P.NeX9udyXlIZJIVsSeJ6urq3Kw2.fiyH05fltramHtiDFYSP6.W2', 'Frederic ', 'Renard',
        'Frederic@gmail.com', 'Fr', b'0'),
       (30, 'schoools', '$2a$10$M.li3IyRjp1liUGrwUV7X.ZSdm7u0sbkUmRVhjPdpqFha5kmVYdrW', 'Frederic ', 'Renard',
        'Frederic@gmail.com', 'Fr', b'1');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `artiste_type`
--
ALTER TABLE `artiste_type`
    ADD PRIMARY KEY (`id`),
    ADD KEY `FKjb9lckjudyevrff5066bvn5yi` (`artist_id`),
    ADD KEY `FK834kd94e6tkrumbpkidaf4qb9` (`type_id`);

--
-- Index pour la table `artiste_type_show`
--
ALTER TABLE `artiste_type_show`
    ADD PRIMARY KEY (`id`),
    ADD KEY `FK9hqh5ws9o18hsv249xnpqneni` (`artist_type_id`),
    ADD KEY `FKrj9a76fdc02amg7dqivatnn4x` (`show_id`);

--
-- Index pour la table `artists`
--
ALTER TABLE `artists`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `localities`
--
ALTER TABLE `localities`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `locations`
--
ALTER TABLE `locations`
    ADD PRIMARY KEY (`id`),
    ADD KEY `FK77hu8gj8t78jri9tncc5w79cf` (`locality_id`);

--
-- Index pour la table `representations`
--
ALTER TABLE `representations`
    ADD PRIMARY KEY (`id`),
    ADD KEY `FKgqakkndousv8wnvorqc0gxi9a` (`location_id`),
    ADD KEY `FKy5ar9ujldy3xw9p62v1qj3cs` (`show_id`);

--
-- Index pour la table `representation_user`
--
ALTER TABLE `representation_user`
    ADD PRIMARY KEY (`id`),
    ADD KEY `FKq2e0m47f76gpu7rbhyy8c9lvl` (`user_id`),
    ADD KEY `FKe66sbi0sqmyw3hvtth2krm5tq` (`representation_id`);

--
-- Index pour la table `roles`
--
ALTER TABLE `roles`
    ADD PRIMARY KEY (`id`),
    ADD UNIQUE KEY `UK_g50w4r0ru3g9uf6i6fr4kpro8` (`role`);

--
-- Index pour la table `role_user`
--
ALTER TABLE `role_user`
    ADD PRIMARY KEY (`id`),
    ADD KEY `FK7tjfd3wunlpu0di6qpu5asgen` (`role_id`),
    ADD KEY `FKhvai2k29vlwpt9wod4sw4ghmn` (`user_id`);

--
-- Index pour la table `shows`
--
ALTER TABLE `shows`
    ADD PRIMARY KEY (`id`),
    ADD KEY `FK71bpp8yqp5gsimorvud4hw7pg` (`location_id`);

--
-- Index pour la table `types`
--
ALTER TABLE `types`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `users`
--
ALTER TABLE `users`
    ADD PRIMARY KEY (`id`),
    ADD UNIQUE KEY `login` (`login`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `artiste_type`
--
ALTER TABLE `artiste_type`
    ADD CONSTRAINT `FK834kd94e6tkrumbpkidaf4qb9` FOREIGN KEY (`type_id`) REFERENCES `types` (`id`),
    ADD CONSTRAINT `FKjb9lckjudyevrff5066bvn5yi` FOREIGN KEY (`artist_id`) REFERENCES `artists` (`id`);

--
-- Contraintes pour la table `artiste_type_show`
--
ALTER TABLE `artiste_type_show`
    ADD CONSTRAINT `FK9hqh5ws9o18hsv249xnpqneni` FOREIGN KEY (`artist_type_id`) REFERENCES `artiste_type` (`id`),
    ADD CONSTRAINT `FKrj9a76fdc02amg7dqivatnn4x` FOREIGN KEY (`show_id`) REFERENCES `shows` (`id`);

--
-- Contraintes pour la table `locations`
--
ALTER TABLE `locations`
    ADD CONSTRAINT `FK77hu8gj8t78jri9tncc5w79cf` FOREIGN KEY (`locality_id`) REFERENCES `localities` (`id`);

--
-- Contraintes pour la table `representations`
--
ALTER TABLE `representations`
    ADD CONSTRAINT `FKgqakkndousv8wnvorqc0gxi9a` FOREIGN KEY (`location_id`) REFERENCES `locations` (`id`),
    ADD CONSTRAINT `FKy5ar9ujldy3xw9p62v1qj3cs` FOREIGN KEY (`show_id`) REFERENCES `shows` (`id`);

--
-- Contraintes pour la table `representation_user`
--
ALTER TABLE `representation_user`
    ADD CONSTRAINT `FKe66sbi0sqmyw3hvtth2krm5tq` FOREIGN KEY (`representation_id`) REFERENCES `representations` (`id`),
    ADD CONSTRAINT `FKq2e0m47f76gpu7rbhyy8c9lvl` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Contraintes pour la table `role_user`
--
ALTER TABLE `role_user`
    ADD CONSTRAINT `FK7tjfd3wunlpu0di6qpu5asgen` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
    ADD CONSTRAINT `FKhvai2k29vlwpt9wod4sw4ghmn` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Contraintes pour la table `shows`
--
ALTER TABLE `shows`
    ADD CONSTRAINT `FK71bpp8yqp5gsimorvud4hw7pg` FOREIGN KEY (`location_id`) REFERENCES `locations` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS = @OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION = @OLD_COLLATION_CONNECTION */;
