package com.nhlstenden.vegetablegraden.vegetable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsparagusTest
{
    private Asparagus asparagus;

    @BeforeEach
    void setup()
    {
        this.asparagus = new Asparagus();
    }

    @Test
    void grow_normalConditions_shouldGrow()
    {
        this.asparagus.grow(100, 100, 1);

        assertEquals(0.49, this.asparagus.getSizeInCm(), 0.01);

        this.asparagus.grow(1000, 1000, 1);

        assertEquals(5.42, this.asparagus.getSizeInCm(), 0.01);
    }

    @Test
    void grow_justEnoughWater_shouldBeGrowing()
    {
        this.asparagus.grow(100, 14, 10);

        assertEquals(Status.GROWING, this.asparagus.getStatus());
    }

    @Test
    void grow_toLessWater_shouldBeDestroyed()
    {
        this.asparagus.grow(100, 13, 10);

        assertEquals(Status.DESTROYED, this.asparagus.getStatus());
    }

    @Test
    void grow_elevenDays_shouldBeGrowing()
    {
        this.asparagus.grow(100, 13, 11);

        assertEquals(Status.GROWING, this.asparagus.getStatus());
    }

    @Test
    void grow_nineDays_shouldBeGrowing()
    {
        this.asparagus.grow(100, 13, 9);

        assertEquals(Status.GROWING, this.asparagus.getStatus());
    }

    @Test
    void addSizeInCm_exactSize_shouldBeReadyToHarvest()
    {
        this.asparagus.addSizeInCm(20.0);

        assertEquals(Status.READY_TO_HARVEST, this.asparagus.getStatus());
    }

    @Test
    void addSizeInCm_belowSize_shouldBeGrowing()
    {
        this.asparagus.addSizeInCm(19.0);

        assertEquals(Status.GROWING, this.asparagus.getStatus());
    }

    @Test
    void addSizeInCm_aboveSize_shouldBeReadyToHarvest()
    {
        this.asparagus.addSizeInCm(21.0);

        assertEquals(Status.READY_TO_HARVEST, this.asparagus.getStatus());
    }
}