package com.transact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transact.model.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {

}
