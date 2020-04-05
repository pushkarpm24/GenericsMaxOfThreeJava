package com.bridgelabz.maximumOfThree;

public class MaximumOfThree<E extends Comparable<E>> {
    E first;
    E second;
    E third;

    public <E extends Comparable> E checkMaximum(E first, E second, E third) {
        E max=first;

        if (second.compareTo(max) > 0)
            max = second;

        if (third.compareTo(max) > 0)
            max = third;

        return max;
    }

}
