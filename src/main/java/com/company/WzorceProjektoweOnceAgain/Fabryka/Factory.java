package com.company.WzorceProjektoweOnceAgain.Fabryka;

public interface Factory<T>  {
    T getSpecialOfTheDay(DayOfWeek day);
}
