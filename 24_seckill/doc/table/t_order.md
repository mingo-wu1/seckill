
CREATE TABLE `t_order`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'order_id',
	`user_id` BIGINT(20) DEFAULT NULL COMMENT 'user_id',
	`goods_id` BIGINT(20) DEFAULT NULL COMMENT 'goods_id',
	`delivery_addr_id` BIGINT(20) DEFAULT NULL COMMENT 'delivery_addr_id',
	`goods_name` VARCHAR(16) DEFAULT NULL COMMENT 'redundant goods_name',
	`goods_count` INT(11) DEFAULT '0' COMMENT 'goods_count',
	`goods_price` DECIMAL(10,2) DEFAULT '0.00' COMMENT 'goods_price',
	`order_channel` TINYINT(4) DEFAULT '0' COMMENT '1pc,2andrid,3ios',
	`status` TINYINT(4) DEFAULT '0' COMMENT 'order_status,0new_order_unpay,1paid,2delivered,3received,4refund,5finished',
	`create_date` datetime DEFAULT NULL COMMENT 'order_create_datetime',
	`pay_date` datetime DEFAULT NULL COMMENT 'paid_datetime',
PRIMARY KEY(`id`)
)ENGINE = INNODB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4
