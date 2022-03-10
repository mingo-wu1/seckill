package com.xxxx.seckill.vo;

import com.xxxx.seckill.validator.IsMobile;
import lombok.Data;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Getter
@Data
public class LoginVo {
    @NotNull
    @IsMobile //自定义注解
    private String mobile;

    @NotNull
    @Length(min = 32)
    private String password;
}
