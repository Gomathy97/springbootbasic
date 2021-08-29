package com.gomathy.learningspring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.gomathy.learningspring.data.entity.Room;


@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
