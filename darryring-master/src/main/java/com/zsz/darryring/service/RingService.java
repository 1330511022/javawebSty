package com.zsz.darryring.service;

import com.zsz.darryring.domain.Ring;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author zsz
* @description 针对表【ring】的数据库操作Service
*/
public interface RingService extends IService<Ring> {

    List<Ring> findHotRings(Integer num);
    List<Ring> findRingsByLikeRName(String condition);

    Ring findRingByRid(Integer rid);
}
