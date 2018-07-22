package com.ych.unity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class Spittle {

    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longtitute;

    public Spittle(String message, Date time, Double latitude, Double longtitute) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longtitute = longtitute;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongtitute() {
        return longtitute;
    }

    /**
     * 工具，实现equals方法
     * 方法有三个参数，分别是(1)当前比较对象(2)另一个比较对象(3)比较的属性
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this,obj,"id","time");
    }

    /**
     * 实现hashcode的映射，自己可以定义映射的类型，根据id和name字段进行映射
     * @return
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this,"id","time");
    }
}
