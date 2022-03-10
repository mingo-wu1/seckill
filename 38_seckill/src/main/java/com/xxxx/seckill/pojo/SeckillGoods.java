package com.xxxx.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
@TableName("t_seckill_goods")
public class SeckillGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * seckill_goods_id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * goods_id
     */
    private Long goodsId;

    /**
     * seckill_price
     */
    private BigDecimal seckillPrice;

    /**
     * goods_stock
     */
    private Integer stockCount;

    /**
     * seckill_start_datetime
     */
    private Date startDate;

    /**
     * seckill_end_datetime
     */
    private Date endDate;


}
