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
@TableName("t_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * order_id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * user_id
     */
    private Long userId;

    /**
     * goods_id
     */
    private Long goodsId;

    /**
     * delivery_addr_id
     */
    private Long deliveryAddrId;

    /**
     * redundant goods_name
     */
    private String goodsName;

    /**
     * goods_count
     */
    private Integer goodsCount;

    /**
     * goods_price
     */
    private BigDecimal goodsPrice;

    /**
     * 1pc,2andrid,3ios
     */
    private Integer orderChannel;

    /**
     * order_status,0new_order_unpay,1paid,2delivered,3received,4refund,5finished
     */
    private Integer status;

    /**
     * order_create_datetime
     */
    private Date createDate;

    /**
     * paid_datetime
     */
    private Date payDate;


}
