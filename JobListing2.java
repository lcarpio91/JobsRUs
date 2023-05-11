package com.skillstrom.ass3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JobListing2 {
    private int id;
    private String title;
    private String description;
    private String streetAddress;
    private String city;
    private String state;
    private int zipcode;
    private double salary;
    private String field;
    private String contactEmail;

    public JobListing2() {
    }

    public JobListing2(int id, String title, String description, String streetAddress, String city, String state, int zipcode, double salary, String field, String contactEmail) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.salary = salary;
        this.field = field;
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public static List<JobListing2> readFromCSV(String filePath) {
        List<JobListing2> jobListings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                JobListing2 job = new JobListing2();
                job.setId(Integer.parseInt(values[0]));
                job.setTitle(values[1]);
                job.setDescription(values[2]);
                job.setStreetAddress(values[3]);
                job.setCity(values[4]);
                job.setState(values[5]);
                job.setZipcode(Integer.parseInt(values[6]));
                job.setSalary(Double.parseDouble(values[7]));
                job.setField(values[8]);
                job.setContactEmail(values[9]);
                jobListings.add(job);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jobListings;
    }

    public static void filterJobListings(List<JobListing2> jobListings) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter job title filter: ");
        String titleFilter = scanner.nextLine().trim();

        System.out.print("Enter state filter: ");
        String stateFilter = scanner.nextLine().trim();

        System.out.print("Enter minimum salary filter: ");
        double minSalaryFilter = Double.parseDouble(scanner.nextLine().trim());

        List<JobListing2> filteredList = jobListings.stream()
                .filter(job -> job.getTitle().contains(titleFilter))
                .filter(job -> job.getState().equals(stateFilter))
                .filter(job -> job.getSalary() >= minSalaryFilter)
                .collect(Collectors.toList());

        filteredList.forEach(job -> System.out.println(job.getTitle() + " (" + job.getSalary() + ")"));
    }

    public static void main(String[] args) {
        String filePath = "Listings/Listings.csv";  // Path to the CSV file, relative to the current directory
        List<JobListing2> jobListings = JobListing2.readFromCSV(filePath);
        filterJobListings(jobListings);
    }
}

//This code includes the JobListing class with all the required fields and methods, including a constructor,
//getters, and setters. It also includes a static method to read job listings from a CSV file, and a method to 
//filter them based on user input. In addition, it includes the main method that reads the job listings from the 
//CSV file and allows the user to filter them. The CSV file should be located in a folder named "Listings" in the
//user's file system.