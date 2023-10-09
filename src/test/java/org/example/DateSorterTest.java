package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DateSorterTest {

    @Test
    public void testSortDates() {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3)
        );

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        List<LocalDate> expectedDates = Arrays.asList(
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3),
                LocalDate.of(2004, 7, 1)
        );

        assertIterableEquals(expectedDates, sortedDates);
    }

    @Test
    public void testSortDatesWithEmptyList() {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = new ArrayList<>();

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        assertTrue(sortedDates.isEmpty());
    }

    @Test
    public void testSortDatesWithSingleDate() {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = List.of(
                LocalDate.of(2023, 10, 5)
        );

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        assertEquals(unsortedDates, sortedDates);
    }
}