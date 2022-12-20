import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private final int number;
    private String surname;
private String name;
private String patronymic;
private LocalDate dateOfBirth;



    public Passport(int number, String surname, String name, String patronymic, LocalDate dateOfBirth) {
        if(number<=0){throw new IllegalArgumentException("Номер паспорта введён неверно");}
        else {this.number = number;}
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setDateOfBirth(dateOfBirth);
    }

    public void setSurname(String surname) {
        if(StringUtils.IsNullOrBlank(surname)){
            throw new IllegalArgumentException("Заполните фамилию");
        }
        this.surname = surname;
    }

    public void setName(String name) {
        if(StringUtils.IsNullOrBlank(name)){
            throw new IllegalArgumentException("Заполните имя");
        }
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth==null){
            throw new IllegalArgumentException("Заполните дату рождения");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Паспорт" +
                " номер " + number +
                ", " + surname +
                " " + name +
                " " + patronymic +
                ", дата рождения "+ dateOfBirth;
    }
}
