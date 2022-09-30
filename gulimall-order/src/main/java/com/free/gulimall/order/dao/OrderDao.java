package com.free.gulimall.order.dao;

import com.free.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiongzhennan
 * @email xiongzhennan@gmail.com
 * @date 2022-09-30 16:49:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
