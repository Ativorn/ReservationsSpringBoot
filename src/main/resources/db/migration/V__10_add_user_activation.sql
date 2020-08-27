ALTER TABLE `reservations`.`users`
ADD COLUMN `active` BIT(1) NOT NULL DEFAULT 0 AFTER `langue`;
UPDATE `users` SET `active` = '1' WHERE (`id` = '2');