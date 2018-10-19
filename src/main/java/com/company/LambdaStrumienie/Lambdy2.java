package com.company.LambdaStrumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Lambdy2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int n = random.nextInt(100);
            list.add(n);
        }

        List<Integer> evenNumberListObj = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumberListObj);


        // powtorzyc sobie lambdy
        // powtorzyc sobie optionale



    }
}
