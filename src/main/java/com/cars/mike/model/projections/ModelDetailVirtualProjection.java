package com.cars.mike.model.projections;


import com.cars.mike.model.Brand;
import com.cars.mike.model.Model;
import com.cars.mike.model.ModelType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

@Projection(name = "carModelDetailVirtualProjection", types = {Model.class})
public interface ModelDetailVirtualProjection {

    @Value("#{target.name}")
    String getCarModelName();
    @Value("#{target.price}")
    BigDecimal getCarPrice();
    Brand getBrand();
    ModelType getModelType();
    Short getSpeed();
    String getEngineType();

/*    @Value("#{target.modelType.name.split(' ')[0]} #{target.name}")
    String getFullName();*/


}
