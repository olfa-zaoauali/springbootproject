package com.olfa.springbootproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.olfa.springbootproject.model.modelCRM;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<modelCRM,Long> {


}
