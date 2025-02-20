package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Stock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockMapper extends BaseMapper<Stock> {
    public Integer updateStock(Stock stock);
}
