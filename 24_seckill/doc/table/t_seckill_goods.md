
CREATE TABLE `t_seckill_goods`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'seckill_goods_id',
	`goods_id` BIGINT(20) DEFAULT NULL COMMENT 'goods_id',
	`seckill_price` DECIMAL(10,2) DEFAULT '0.00' COMMENT 'seckill_price',
	`stock_count` INT(10) DEFAULT NULL COMMENT 'goods_stock',
	`start_date` datetime DEFAULT NULL COMMENT 'seckill_start_datetime',
	`end_date` datetime DEFAULT NULL COMMENT 'seckill_end_datetime',
PRIMARY KEY(`id`)
)ENGINE = INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
