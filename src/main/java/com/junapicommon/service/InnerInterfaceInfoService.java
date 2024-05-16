package com.junapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.junapicommon.model.entity.InterfaceInfo;

/**
* @author 27164
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-05-03 21:02:10
*/
public interface InnerInterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo post, boolean add);


//    从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
    InterfaceInfo getInterfaceInfo(String path,String method);

}
