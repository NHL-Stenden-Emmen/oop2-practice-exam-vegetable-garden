package com.nhlstenden.vegetablegraden.garden;

import com.nhlstenden.vegetablegraden.vegetable.Asparagus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GardenTest
{
    @Test
    void addVegetable_oneTooMany_shouldThrowException() throws TooManyVegetablesException
    {
        Garden garden = new Garden();

        for (int i = 1; i <= 27; i++)
        {
            System.out.println("Adding vegetable " + i);
            garden.addVegetable(new Asparagus());
        }

        assertThrows(TooManyVegetablesException.class, () -> garden.addVegetable(new Asparagus()));
    }

    @Test
    void addVegetable_justEnough_shouldNotThrowException() throws TooManyVegetablesException
    {
        Garden garden = new Garden();

        for (int i = 1; i <= 26; i++)
        {
            System.out.println("Adding vegetable " + i);
            garden.addVegetable(new Asparagus());
        }

        assertDoesNotThrow(() -> garden.addVegetable(new Asparagus()));
    }
}