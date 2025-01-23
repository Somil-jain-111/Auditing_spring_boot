package com.audit.practice.Audit.Practice.respository;

import com.audit.practice.Audit.Practice.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {

}
