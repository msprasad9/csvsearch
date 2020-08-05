package com.codingtest.search.service;

import com.codingtest.search.model.Data;
import com.opencsv.CSVReader;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    @Value("${file.path}")
    private String filePath;

    public List<Data> searchCsv(String searchString){
        List<Data> searchResults = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            String[] data;
            while ((data = csvReader.readNext()) != null) {
                for(String s : data) {
                    if(StringUtils.containsIgnoreCase(s,searchString)) searchResults.add(transform(data));
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return searchResults;
    }

    public Data transform(String[] values){
        Data data = new Data();
        data.setRegion(values[0]);
        data.setCountry(values[1]);
        data.setItemType(values[2]);
        data.setSalesChannel(values[3]);
        data.setOrderPriority(values[4]);
        data.setOrderDate(values[5]);
        data.setOrderId(values[6]);
        data.setShipDate(values[7]);
        data.setUnitsSold(values[8]);
        data.setUnitPrice(values[9]);
        data.setUnitCost(values[10]);
        data.setTotalRevenue(values[11]);
        data.setTotalCost(values[12]);
        data.setTotalProfit(values[13]);
        return data;
    }
}
