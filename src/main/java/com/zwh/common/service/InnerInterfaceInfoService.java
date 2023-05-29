package com.zwh.common.service;

import com.zwh.common.model.entity.InterfaceInfo;

/**
 * 接口服务
 */
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
