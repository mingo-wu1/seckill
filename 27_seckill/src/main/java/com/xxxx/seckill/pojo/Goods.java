package com.xxxx.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

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
@TableName("t_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * goods_id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * goods_name
     */
    private String goodsName;

    /**
     * goods_title
     */
    private String goodsTitle;

    /**
     * goods_pic
     */
    private String goodsImg;

    /**
     * goods_detail
     */
    private String goodsDetail;

    /**
     * goods_price
     */
    private BigDecimal goodsPrice;

    /**
     * goods_stock, -1 means unlimit
     */
    private Integer goodsStock;


}
