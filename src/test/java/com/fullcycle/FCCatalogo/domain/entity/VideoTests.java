package com.fullcycle.FCCatalogo.domain.entity;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class VideoTests {

    @Test
    public void throwIllegalArgumentExceptionWhenTitleIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new Video(null, "", 0, false));
    }

    @Test
    public void throwIllegalArgumentExceptionWhenTitleIsBlank() {
        assertThrows(IllegalArgumentException.class, () -> new Video("", "", 0, false));
    }

    @Test
    public void throwIllegalArgumentExceptionWhenYearLauchedIsGreaterThanToday() {
        assertThrows(IllegalArgumentException.class,
                () -> new Video("Title1", "", Calendar.getInstance().get(Calendar.YEAR) + 20, false));
    }

    @Test
    public void throwIllegalArgumentExceptionWhenYearLauchedIsNotInRange() {
        assertThrows(IllegalArgumentException.class,
                () -> new Video("Title1", "", 1000, false));
    }

    @Test
    public void throwIllegalArgumentExceptionWhenYearLauchedIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new Video("Title1", "", null, false));
    }
}
