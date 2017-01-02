package com.cars.mike.repository;

import com.cars.mike.model.Model;
import com.cars.mike.utils.ModelTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ModelJpaRepository extends JpaRepository<Model, Long> {

    List<Model> findByPriceGreaterThanEqualAndPriceLessThanEqual(BigDecimal lowest, BigDecimal price);

    List<Model> findBySpeedGreaterThanEqual(short speed);

    List<Model> findByEngineType(String engineType);

    List<Model> findByModelTypeNameIn(List<ModelTypeEnum> types);

    List<Model> findByBrandNameIn(List<String> brands);
}
