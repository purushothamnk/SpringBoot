package com.regvector.JournalApp.repository;

import com.regvector.JournalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {
    JournalEntry findById(int id);
}
