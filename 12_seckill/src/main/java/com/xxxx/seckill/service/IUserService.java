package com.xxxx.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.vo.LoginVo;
import com.xxxx.seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mingowu
 * @since 2022-03-05
 */
public interface IUserService extends IService<User> {
    /**
     * 登录
     */
    RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);
}
