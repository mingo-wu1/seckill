package com.xxxx.seckill.vo;

import com.xxxx.seckill.pojo.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsVo extends Goods {
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
