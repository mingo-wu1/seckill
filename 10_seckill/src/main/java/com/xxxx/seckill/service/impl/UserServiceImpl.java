package com.xxxx.seckill.service.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.seckill.mapper.UserMapper;
import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.service.IUserService;
import com.xxxx.seckill.utils.MD5Util;
import com.xxxx.seckill.utils.ValidatorUtil;
import com.xxxx.seckill.vo.LoginVo;
import com.xxxx.seckill.vo.RespBean;
import com.xxxx.seckill.vo.RespBeanEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mingowu
 * @since 2022-03-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 登录
     * @param loginVo
     * @return
     */
    @Override
    public RespBean doLogin(LoginVo loginVo){
        String mobile = loginVo.getMobile();
        String password = loginVo.getPassword();
	System.out.println(mobile);
         //参数校验
//         if (StringUtils.isEmpty(mobile)||StringUtils.isEmpty(password)){
//         	return RespBean.error(RespBeanEnum.LOGIN_ERROR);
//         }
//         if (!ValidatorUtil.isMobile(mobile)){
//         	return RespBean.error(RespBeanEnum.MOBILE_ERROR);
//         }
        //根据手机号获取用户
        User user = userMapper.selectById(mobile);
        System.out.println(user);
        if (null == user) {
//            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
            return RespBean.error(RespBeanEnum.MOBILE_ERROR);
        }
        //判断密码是否正确
        if (!MD5Util.formPassToDBPass(password, user.getSalt()).equals(user.getPassword())) {
//            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
            System.out.println("---------md5 error-------------");
            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        }

        return RespBean.success();
    }
}
