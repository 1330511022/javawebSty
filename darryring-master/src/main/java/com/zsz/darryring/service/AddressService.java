package com.zsz.darryring.service;

import com.zsz.darryring.domain.Address;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author zsz
* @description 针对表【address】的数据库操作Service
*/
public interface AddressService extends IService<Address> {

    List<Address> findAllAddressByUid(Integer uid);

    void deleteAddressByAid(Integer aid);

    void addNewAddress(Address address);
}
