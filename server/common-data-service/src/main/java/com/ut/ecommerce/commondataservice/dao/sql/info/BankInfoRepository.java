package com.ut.ecommerce.commondataservice.dao.sql.info;

import com.ut.ecommerce.commondataservice.entity.sql.info.BankInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankInfoRepository extends JpaRepository<BankInfo, Integer> {

}
