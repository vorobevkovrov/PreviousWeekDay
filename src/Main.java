import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 3, 8);
        List<LocalDate> publicHolidays = new ArrayList<>();
        publicHolidays.add(LocalDate.of(2024, 3, 8));
        publicHolidays.add(LocalDate.of(2024, 2, 23));
        Main main = new Main();
        System.out.println(main.getPreviousWeekDay(localDate, publicHolidays));
    }

    public LocalDate getPreviousWeekDay(LocalDate localDate, List<LocalDate> publicHolidays) {
        for (LocalDate locDate : publicHolidays) {
            if (localDate.getDayOfWeek().toString().equals(locDate.getDayOfWeek().toString())){
            }
        }
        return localDate;
   //     if (localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {

       // }
       // return null;
    }
}

//    Напишите функцию которая вовращает предыдущий к текущей дате будний день.
//        Если предыдущий будний день - праздник то нужно вернуть предыдущий до него но также он должен быть будним днем.
//        Например для 2 марта 2023 (суббота) должен быть возвращено 1 марта (пятница).
//        Тот же случай с 2 марта 2023 должен вернуть четверг если 1 марта будет праздничным днем.
//        Вот сигнатура метода
//
//        Сигнатура с датой не уточнена, вы вольны сами решать какой именно формат даты передается и возвращается.
