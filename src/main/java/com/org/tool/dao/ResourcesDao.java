package com.org.tool.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.tool.model.Resources;

@Repository
public interface ResourcesDao extends CrudRepository<Resources, Integer>{

}
