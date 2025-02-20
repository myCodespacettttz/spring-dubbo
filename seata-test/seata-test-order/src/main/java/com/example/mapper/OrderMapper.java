package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Order;
import entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    public void createOrder(@Param("userId") String userId, @Param("money") Integer money, @Param("commodityCode") String commodityCode);
}
