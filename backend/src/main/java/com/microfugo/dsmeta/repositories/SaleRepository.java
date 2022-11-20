package com.microfugo.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microfugo.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long> {
	

}
