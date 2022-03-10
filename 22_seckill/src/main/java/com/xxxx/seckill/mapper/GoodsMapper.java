package com.xxxx.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.seckill.pojo.Goods;
import com.xxxx.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mingowu
 * @since 2022-03-08
 */
public interface GoodsMapper extends BaseMapper<Goods> {
    /**
     * 获取商品列表
     */
    List<GoodsVo> findGoodsVo();
}
