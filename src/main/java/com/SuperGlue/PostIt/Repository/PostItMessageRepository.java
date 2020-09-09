package com.SuperGlue.PostIt.Repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.SuperGlue.PostIt.Model.PostItMessage;


/**
 * Message-repository-interface used by spring data to generate database queries
 * @author Daniel Dornhof
 *
 */
public interface PostItMessageRepository extends CrudRepository<PostItMessage, Long> {
	
	List<PostItMessage> findByName(String name);
	
}
