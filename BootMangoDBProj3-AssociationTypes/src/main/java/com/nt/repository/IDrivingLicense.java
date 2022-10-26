package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.DrivingLicence;

public interface IDrivingLicense extends MongoRepository<DrivingLicence,Long> {

}
