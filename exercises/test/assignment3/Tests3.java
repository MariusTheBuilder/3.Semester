package assignment3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class Tests3 {
    private ArrayList<FestivalVolunteers> volunteers;

    @BeforeEach
    public void setUp() {
        volunteers = new ArrayList<FestivalVolunteers>();
        volunteers.add(new FestivalVolunteers("Ida", 3, 0));
        volunteers.add(new FestivalVolunteers("Malik", 2, 0));
        volunteers.add(new FestivalVolunteers("Oskar", 0, 0));
    }

    @Test
    public void createVolunteers() {
        assertEquals(3, volunteers.size());
    }

    @Test
    public void nameCheck() {
        assertEquals("Ida", volunteers.get(0).getName());
        assertEquals("Malik", volunteers.get(1).getName());
        assertEquals("Oskar", volunteers.get(2).getName());
        assertNotEquals("Oscar", volunteers.get(2).getName());

    }

    @Test
    public void addBarShift() {
        volunteers.get(0).addShift(new BarShift(8, "Beer bar"));

        assertEquals(8, volunteers.get(0).getPoints());
        assertNotEquals(0, volunteers.get(0).getPoints());
    }

    @Test
    public void addRecyclingShift() {
        volunteers.get(1).addShift(new RecyclingShift(8, "Beer bar", 6));

        assertEquals(14, volunteers.get(1).getPoints());
        assertNotEquals(0, volunteers.get(1).getPoints());

    }

    @Test
    public void checkLeader(){
        volunteers.get(0).addShift(new LeaderShift(8, "Bar team leader", volunteers.get(0).getFestivals()));
        volunteers.get(1).addShift(new LeaderShift(8, "Bar team leader", volunteers.get(1).getFestivals()));
        volunteers.get(2).addShift(new LeaderShift(0, "Bar team leader", volunteers.get(2).getFestivals()));

        assertEquals(24, volunteers.get(0).getPoints());
        assertEquals(16, volunteers.get(1).getPoints());
        assertEquals(0, volunteers.get(2).getPoints());
        assertNotEquals(1, volunteers.get(1).getPoints());



    }
}
