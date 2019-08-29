package com.waziro.sell.service;

import com.waziro.sell.dataobject.ProductInfo;
import com.waziro.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     * @return
     */
    List<ProductInfo> findUpAll();
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);
    //增加库存
    void increaseStock(List<CartDTO> cartDTOList);
    //减少库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
