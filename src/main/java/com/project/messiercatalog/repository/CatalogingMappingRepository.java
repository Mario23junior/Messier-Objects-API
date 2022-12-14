package com.project.messiercatalog.repository;

import com.project.messiercatalog.model.CatalogingMapping;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogingMappingRepository extends JpaRepository<CatalogingMapping, Long>{

	CatalogingMapping findByNgc(String ngc);

}
