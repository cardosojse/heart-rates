package HeartRates;

import java.time.LocalDate;

public class HeartRate {
    private String name;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public HeartRate(String name, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getUserName(String name, String lastName) {
        return name + " " + lastName;
    }

    public String getBirthDate() {
        return birthDay + "/" + birthMonth + "/" + birthYear;
    }

    public int getUserAge() {
        int year = LocalDate.now().getYear();
        return year - birthYear;
    }

    public int getHeartRate() {
        int age = getUserAge();
        return 220 - age;
    }

    public int getTargetHeartRate() {
        int HeartRate = getHeartRate();
        int maxHeartRate = (int) (HeartRate * 0.85);
        int minHeartRate = (int) (HeartRate * 0.50);

        return maxHeartRate - minHeartRate;
    }
}
