package com.ropandi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeString.split;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class DataBaseNasabahGenerator {

    File file;
    FileReader fileReader;
    BufferedReader reader;

    public static List<Cicilan> getCicilan(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        List<Cicilan> cicilanList = new ArrayList();
        Cicilan cicilan = null;
        String line = null;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            String[] split = line.split(",");
            cicilan = new Cicilan(Integer.parseInt(split[0]), split[1].trim(), Double.parseDouble(split[2].trim()), Integer.parseInt(split[3].trim()));
            cicilanList.add(cicilan);
        }
        return cicilanList;
    }
    public static List<DataCicilan> getDataNasabah() throws FileNotFoundException, IOException {
        File file = new File("D:\\DataNasabah.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        List<DataCicilan> peopleList = new ArrayList();
        DataCicilan person;
        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] split = line.split(",");
            person = new DataCicilan(Long.parseLong(split[0]),split[1].trim(), Long.parseLong(split[2].trim()),split[3].trim(), Integer.parseInt(split[4].trim()),Integer.parseInt(split[5].trim()), Integer.parseInt(split[6].trim()),split[7].trim(),split[8].trim());
            peopleList.add(person);
        }
        return peopleList;
    }

}
