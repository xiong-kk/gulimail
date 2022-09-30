package com.free.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.free.common.utils.PageUtils;
import com.free.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author xiongzhennan
 * @email xiongzhennan@gmail.com
 * @date 2022-09-30 16:36:04
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

