package com.codingtest.search.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CSVParserImpl implements CSVParser {
    @Override
    public List<List<String>> parse(File csvFile, char seprator) throws CSvParseException, FileNotFoundException {


        return null;
    }

    @Override
    public boolean contains(String query, boolean isCaseSensitive) {
        return false;
    }
}
