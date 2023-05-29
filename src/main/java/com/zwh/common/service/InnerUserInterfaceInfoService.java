package com.zwh.common.service;

/**
 *
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId 接口 id
     * @param userId          用户 id
     * @return 更新接口调用情况是否成功
     */
    boolean invokeCount(long interfaceInfoId, long userId);

    /**
     * 判断用户是否有权限调用接口
     *
     * @param interfaceInfoId 接口 id
     * @param userId          用户 id
     * @return 结果
     */
    boolean validInvoke(long interfaceInfoId, long userId);
}
