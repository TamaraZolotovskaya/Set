import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private Set<Passport> passports;

    public PassportList(Set<Passport> passports) {
        this.passports = passports;
    }

    public Set<Passport> getPassports() {
        return passports;
    }

    public void addPassport(Passport passport) {
        if (passports.contains(passport)){
              passports.remove(passport);
              System.out.println("Данные паспорта " +passport.getNumber()+" в списке изменены");}

              /* Если мы нооборот хотим менять новый паспорт на паспорт из списка
           System.out.println(passport+" нужно обновить");
            passport.setName(searchPassport(passport.getNumber()).getName());
            passport.setSurname(searchPassport(passport.getNumber()).getSurname());
            passport.setPatronymic(searchPassport(passport.getNumber()).getPatronymic());
            passport.setDateOfBirth(searchPassport(passport.getNumber()).getDateOfBirth());
            System.out.println(passport+" обновлен");*/

        else {System.out.println("Поспорт " +passport.getNumber()+" добавлен");}
        passports.add(passport);
    }

    public Passport searchPassport(int number){
        for (Passport passport:
                passports) {
            if(passport.getNumber()==number){return passport;}

        }
        return null;
    }

    @Override
    public String toString() {
        return passports.toString();
    }
}
