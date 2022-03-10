package com.xxxx.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mingowu
 * @since 2022-03-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_seckill_order")
public class SeckillOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * seckill_order_id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * user_id
     */
    private Long userId;

    /**
     * order_id
     */
    private Long orderId;

    /**
     * goods_id
     */
    private Long goodsId;


}
