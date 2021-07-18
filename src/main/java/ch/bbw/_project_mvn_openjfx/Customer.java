package ch.bbw._project_mvn_openjfx;

import java.time.LocalDate;

public class Customer {

    private String lastname;
    private String firstname;
    private String email;
    private String telephone;
    private String address;
    private int plz;
    private String location;
    private String rentalType;
    private String level;
    private String gender;
    private LocalDate birthdate;
    private double height;
    private double weight;
    private int shoeSize;
    private String style;
    private LocalDate rentedOut;
    private LocalDate returnedOn;

    public Customer() {
    }

    public Customer(String lastname, String firstname, String email, String telephone, String address, int plz, String location,
                    String rentalType, String level, String gender, LocalDate birthdate, double height, double weight, int shoeSize,
                    String style, LocalDate rentedOut, LocalDate returnedOn) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.plz = plz;
        this.location = location;
        this.rentalType = rentalType;
        this.level = level;
        this.gender = gender;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
        this.shoeSize = shoeSize;
        this.style = style;
        this.rentedOut = rentedOut;
        this.returnedOn = returnedOn;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public LocalDate getRentedOut() {
        return rentedOut;
    }

    public void setRentedOut(LocalDate rentedOut) {
        this.rentedOut = rentedOut;
    }

    public LocalDate getReturnedOn() {
        return returnedOn;
    }

    public void setReturnedOn(LocalDate returnedOn) {
        this.returnedOn = returnedOn;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", plz=" + plz +
                ", location='" + location + '\'' +
                ", rentalType='" + rentalType + '\'' +
                ", level='" + level + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                ", height=" + height +
                ", weight=" + weight +
                ", shoeSize=" + shoeSize +
                ", style='" + style + '\'' +
                ", rentedOut=" + rentedOut +
                ", returnedOn=" + returnedOn +
                '}';
    }
}
