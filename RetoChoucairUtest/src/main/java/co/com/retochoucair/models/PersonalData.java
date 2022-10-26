package co.com.retochoucair.models;

public class PersonalData {
private String firstName;
private String lastName;
private String email;
private String month;
private String day;
private String year;
private String city;
private String zip;
private String country;
private String computer;
private String version;
private String language;
private String cellPhone;
private String system;
private String password;
private String confirmPassword;
private String model;

    public PersonalData(String firstName, String lastName, String email, String month, String day, String year, String city, String zip, String country, String computer, String version, String language, String cellPhone, String system, String password, String confirmPassword, String model) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.computer = computer;
        this.version = version;
        this.language = language;
        this.cellPhone = cellPhone;
        this.system = system;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.model = model;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getComputer() {
        return computer;
    }

    public String getVersion() {
        return version;
    }

    public String getLanguage() {
        return language;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getSystem() {
        return system;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getModel() {
        return model;
    }
}
