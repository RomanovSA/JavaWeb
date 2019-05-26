package com.example.java.controller;

import com.example.java.domain.Record;
import com.example.java.repos.RecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class RecordControler
{
    @Autowired
    private RecordRepo recordRepo;

    @GetMapping("/baseRecord")
    public String baseRecord(Map<String, Object> model)
    {
        Iterable<Record> records = recordRepo.findAll();
        model.put("records", records);
        return "baseRecord";
    }

    @PostMapping("/baseRecord")
    public String addRecord(@RequestParam Long date, @RequestParam Long time, Map<String, Object> model)
    {
        Record record = new Record(date,time);

        recordRepo.save(record);
        Iterable<Record> records = recordRepo.findAll();
        model.put("records", records);
        return "baseRecord";
    }
}
