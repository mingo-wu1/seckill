
CREATE TABLE `t_goods`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'goods_id',
	`goods_name` VARCHAR(16) DEFAULT NULL COMMENT 'goods_name',
	`goods_title` VARCHAR(64) DEFAULT NULL COMMENT 'goods_title',
	`goods_img` VARCHAR(64) DEFAULT NULL COMMENT 'goods_pic',
	`goods_detail` LONGTEXT COMMENT 'goods_detail',
	`goods_price` DECIMAL(10,2) DEFAULT '0.00' COMMENT 'goods_price',
	`goods_stock` INT(11) DEFAULT '0' COMMENT 'goods_stock, -1 means unlimit',
PRIMARY KEY(`id`)
)ENGINE = INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4
