package com.codingtest.search.csv;

import com.codingtest.search.csv.CSvParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface CSVParser {

    List<List<String>> parse(File csvFile, char seprator) throws CSvParseException, FileNotFoundException;

    boolean contains(String query,boolean isCaseSensitive);
}
