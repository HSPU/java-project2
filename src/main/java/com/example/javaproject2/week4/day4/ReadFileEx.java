package com.example.javaproject2.week4.day4;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "EUC-KR"));
        String line;
        while ((line = br.readLine()) != null) {
                lines.add(line);
        }
        return lines;
    }
    public Hospital parse(String str) {
        String[] splitted = str.split(",");

        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }
    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines){
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx();
        List<String> strLines = rfe.getLines("C:\\git\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10..csv");
        List<Hospital> hospitals = rfe.getHospitals(strLines);
        System.out.println(hospitals.get(2).getName());
    }
}
