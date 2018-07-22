package com.ych.dao;

import com.ych.unity.Spittle;

import java.util.List;

public interface SpittleDao {

    public List<Spittle> findSpittList(long max, int count);
}
