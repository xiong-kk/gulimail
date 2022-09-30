package com.free.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.free.common.utils.PageUtils;
import com.free.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author xiongzhennan
 * @email xiongzhennan@gmail.com
 * @date 2022-09-30 16:49:31
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

