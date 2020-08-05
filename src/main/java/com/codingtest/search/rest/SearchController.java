package com.codingtest.search.rest;

import com.codingtest.search.model.Data;
import com.codingtest.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SearchController {
    @Autowired
    SearchService searchService;



    @GetMapping("/search/{searchString}")
    public ResponseEntity<List<Data>> searchCsv(@PathVariable String searchString){
        List<Data> resultList = searchService.searchCsv(searchString);
        System.out.println("Search Results:"+ resultList);
        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }
}
