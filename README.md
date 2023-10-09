# DateSorter

This project represents a solution to the task of sorting a list of dates according to specific rules using the `DateSorter` class.

## Method Description

`DateSorter` contains the `sortDates` method, which sorts a list of dates according to the following rules:

1. Dates with an 'r' in the month name are sorted in ascending order.
2. Dates without an 'r' in the month name are sorted in descending order.

Example:
- (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03) sorts to (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01).

## Usage

To use the `sortDates` method, create an instance of the `DateSorter` class and pass it a list of dates you want to sort. The method will return a sorted collection of dates.

Example of usage:

```java
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import sample.DateSorter;

public class Main {
    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3)
        );

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);
        System.out.println(sortedDates);
    }
}
