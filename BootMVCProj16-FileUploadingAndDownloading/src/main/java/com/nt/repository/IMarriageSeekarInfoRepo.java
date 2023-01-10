package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.MarriageSeekerInfo;

public interface IMarriageSeekarInfoRepo extends  CrudRepository<MarriageSeekerInfo,Integer>  {
											//PagingAndSortingRepository<MarriageSeekerInfo ,Integer> {

}
