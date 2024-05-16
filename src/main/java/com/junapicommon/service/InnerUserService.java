package com.junapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.junapicommon.model.entity.User;

/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService extends IService<User> {

    //    数据库中查是否已分配给用户秘钥（accessKey）
    User getInvokeUser(String accessKey);

}
