package com.transact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transact.model.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {

}
