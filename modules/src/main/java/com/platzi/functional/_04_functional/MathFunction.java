package com.platzi.functional._04_functional;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunction {
    public static void main(String[] args) {

        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(5));
        System.out.println(square.apply(25));

        Function<Integer, Boolean> isOdd = x ->  x % 2 == 1;

        Predicate<Integer> isEven = x -> x % 2 == 0;

        isEven.test(4);

        Predicate<Student> isApproved = student ->  student.getCalificacion() >= 6.0;
        Student telesforo = new Student(5.9);
        System.out.println(isApproved.test(telesforo));
    }

    static class Student {
        private  double calificacion;

        public Student(double calificacion){
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}
