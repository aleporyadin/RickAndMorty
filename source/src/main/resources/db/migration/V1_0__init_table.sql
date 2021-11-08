CREATE TABLE `character`(
    `id`        INT AUTO_INCREMENT NOT NULL,
    `name`      VARCHAR(255) ,
    `status`    VARCHAR(255),
    `species`   VARCHAR(255),
    `type`      VARCHAR(255),
    `gender`    VARCHAR(255),

    PRIMARY KEY(`id`)
);