public class Country implements Comparable<Country>{
    private String countryName;
    private int year;
    private String gender;
    private double literacyRate;

    public Country(String countryName, int year, String gender, double literacyRate) {
        this.countryName = countryName;
        this.year = year;
        this.gender = gender.replace("(%)", "").trim(); //gender.substring(0, gender.indexOf(" ("));
        this.literacyRate = literacyRate;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    public void setLiteracyRate(double literacyRate) {
        this.literacyRate = literacyRate;
    }

    @Override
    public String toString() {
        return countryName + " (" + year + "), " + gender + ", " + literacyRate;
    }

    @Override
    public int compareTo(Country country) {
        if (this.literacyRate == country.getLiteracyRate()) {
            return 0;
        } else if (this.literacyRate > country.getLiteracyRate()) {
            return 1;
        } else {
            return -1;
        }
    }
}

/* from zoom

public class Result {

    private String sex;
    private String country;
    private int year;
    private double literacyPercent;

    public Result(String sex, String country, int year, double literacyPercent) {
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacyPercent;
    }
}
 */