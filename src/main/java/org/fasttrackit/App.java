package org.fasttrackit;

import java.time.LocalDate;

public class App {

    public static void main(String[] args){

        LogicalOp exercises =new LogicalOp();

        LogicalOp.countAscending(10);
        LogicalOp.countDescending(-10);
        LogicalOp.countBetween(20,10);
        LogicalOp.countBetwenAscending(10,20);
        LogicalOp.countEvenNumbers();
        LogicalOp.countOddNumbers();
        exercises.sumAllNumbers(5);
        LogicalOp.printAsterisks();
    }

}
