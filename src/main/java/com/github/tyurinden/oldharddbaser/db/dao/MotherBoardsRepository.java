package com.github.tyurinden.oldharddbaser.db.dao;

import com.github.tyurinden.oldharddbaser.db.models.MotherBoard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MotherBoardsRepository extends CrudRepository<MotherBoard, Long> {
    List<MotherBoard> findByTitle(String title);
}
