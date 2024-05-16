package com.junapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.junapicommon.model.entity.UserInterfaceInfo;

/**
* @author 27164
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-05-09 21:32:09
*/
public interface InnerUserInterfaceInfoService  {


    //接口调用服务
    boolean invokeAddCount(long interfaceInfoId,long userId);

}
