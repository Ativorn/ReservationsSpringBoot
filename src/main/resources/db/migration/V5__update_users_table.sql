ALTER TABLE `reservations`.`users`
    CHANGE COLUMN `email` `email`         VARCHAR(100) NOT NULL,
    CHANGE COLUMN `firstname` `firstname` VARCHAR(60)  NOT NULL,
    CHANGE COLUMN `langue` `langue`       VARCHAR(2)   NULL,
    CHANGE COLUMN `lastname` `lastname`   VARCHAR(60)  NOT NULL,
    CHANGE COLUMN `login` `login`         VARCHAR(30)  NOT NULL,
    CHANGE COLUMN `password` `password`   VARCHAR(255) NOT NULL,
    ADD UNIQUE INDEX `login_UNIQUE` (`login` ASC) VISIBLE;
;