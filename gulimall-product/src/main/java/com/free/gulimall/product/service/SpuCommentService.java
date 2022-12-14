package com.free.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.free.common.utils.PageUtils;
import com.free.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author xiongzhennan
 * @email xiongzhennan@gmail.com
 * @date 2022-09-30 13:29:17
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

