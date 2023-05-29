package com.zwh.common.service;

import com.zwh.common.model.entity.User;


/**
 * 用户服务
 * @author zwh
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey 秘钥
     * @return 用户信息
     */
    User getInvokeUser(String accessKey);
}
