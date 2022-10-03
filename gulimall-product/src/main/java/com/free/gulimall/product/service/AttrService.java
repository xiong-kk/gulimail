package com.free.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.free.common.utils.PageUtils;
import com.free.gulimall.product.entity.AttrEntity;
import com.free.gulimall.product.vo.AttrVo;

import java.util.Map;

/**
 * 商品属性
 *
 * @author xiongzhennan
 * @email xiongzhennan@gmail.com
 * @date 2022-09-30 13:29:17
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);
}

