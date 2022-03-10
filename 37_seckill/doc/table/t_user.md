
CREATE TABLE t_user(
	`id` BIGINT(20) NOT NULL COMMENT 'user_id, phone_number',
	`nickname` VARCHAR(255) NOT NULL,
	`password` VARCHAR(32) DEFAULT NULL COMMENT 'MD5(MD5(pass_plaintext + fixed_salt)+salt)',
	`salt` VARCHAR(10) DEFAULT NULL,
	`head` VARCHAR(128) DEFAULT NULL COMMENT 'head',
	`register_date` datetime DEFAULT NULL COMMENT 'register time',
	`last_login_date` datetime DEFAULT NULL COMMENT 'last login time',
	`login_count` int(11) DEFAULT '0' COMMENT 'login times',
	PRIMARY KEY(`id`)
)
