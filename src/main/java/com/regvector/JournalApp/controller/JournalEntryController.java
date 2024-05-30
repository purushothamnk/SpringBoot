package com.regvector.JournalApp.controller;

import com.regvector.JournalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {
    private Map<Long, JournalEntry>jornalEntries= new HashMap<>();

    @GetMapping
    public List<JournalEntry> getall() {
       return new ArrayList<>(jornalEntries.values());
   }

//   @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myentry) {
//        jornalEntries.put(myentry.getId(), myentry);
//        return true;
//   }
   @GetMapping("id/{myId}")
   public JournalEntry getEntryById(@PathVariable long myId) {
        return jornalEntries.get(myId);
   }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable long myId) {
        return jornalEntries.remove(myId);
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateEntryById(@PathVariable long id, @RequestBody JournalEntry myEntry, @PathVariable String myId) {
        return jornalEntries.put(id, myEntry);
    }

}
