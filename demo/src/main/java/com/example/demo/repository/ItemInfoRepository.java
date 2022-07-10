package com.example.demo.repository;

import com.example.demo.domain.ItemInfo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ItemInfoRepository extends CrudRepository<ItemInfo, String> {

    ItemInfo findByItemName(String itemName);
    void deleteByItemName(String itemName);
}
