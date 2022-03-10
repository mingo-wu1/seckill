package com.xxxx.seckill.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author mingowu
 * @since 2022-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * user_id, phone_number
     */
    private Long id;

    private String nickname;

    /**
     * MD5(MD5(pass_plaintext + fixed_salt)+salt)
     */
    private String password;

    private String salt;

    /**
     * head
     */
    private String head;

    /**
     * register time
     */
    private Date registerDate;

    /**
     * last login time
     */
    private Date lastLoginDate;

    /**
     * login times
     */
    private Integer loginCount;


}
