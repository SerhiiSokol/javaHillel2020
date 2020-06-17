CREATE TABLE user (
                      id            INT UNSIGNED NOT NULL AUTO_INCREMENT,
                      first_name     VARCHAR(20)           DEFAULT NULL,
                      second_name    VARCHAR(30)           DEFAULT NULL,
                      email         VARCHAR(40)           DEFAULT NULL,
                      phone         VARCHAR(13)           DEFAULT null,
                      address_id    INT UNSIGNED,
                      login         VARCHAR(15)  NOT NULL,
                      is_deleted    BOOLEAN DEFAULT FALSE,
                      pass VARCHAR(255)  NOT NULL,
                      PRIMARY KEY (id),
                      FOREIGN KEY (address_id) REFERENCES address (id)
                          ON DELETE RESTRICT
                          ON UPDATE CASCADE

)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;
CREATE TABLE address (
                         ID         INT UNSIGNED NOT NULL AUTO_INCREMENT,
                         pcode VARCHAR(255),
                         Country    VARCHAR(255),
                         City       VARCHAR(255),
                         Street     VARCHAR(255),
                         House      VARCHAR(255),
                         Flat       VARCHAR(255),
                         PRIMARY KEY (ID)

);