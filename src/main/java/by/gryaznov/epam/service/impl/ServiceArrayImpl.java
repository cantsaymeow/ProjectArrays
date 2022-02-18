package by.gryaznov.epam.service.impl;

import by.gryaznov.epam.entity.CustomArray;
import by.gryaznov.epam.service.ServiceArray;

public class ServiceArrayImpl extends CustomArray implements ServiceArray {
    @Override
    public int findMax() {
        int max = 0;
        for (int i = 0; i < getCustomArr().length; i++) {
            int temp = 0;
            if(temp > max)
                max = temp;
        }
        return max;
    }

    @Override
    public int findMin() {
        return 0;
    }

    @Override
    public int negToPos() {
        return 0;
    }

    @Override
    public int findAvg() {
        return 0;
    }

    @Override
    public int findSum() {
        return 0;
    }

    @Override
    public int findNegAndPos() {
        return 0;
    }
}
