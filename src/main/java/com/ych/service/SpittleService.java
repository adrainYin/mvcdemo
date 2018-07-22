package com.ych.service;

import com.ych.dao.SpittleDao;
import com.ych.unity.Spittle;

import java.util.List;

public class SpittleService {

    SpittleDao spittleDao;
    List<Spittle> spittles = spittleDao.findSpittList(Long.MAX_VALUE, 20);
}
