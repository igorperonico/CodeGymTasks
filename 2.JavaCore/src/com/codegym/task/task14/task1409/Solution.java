package com.codegym.task.task14.task1409;

/*
Bridges

*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    // 5. Create a public println(Bridge bridge) method in the Solution class.
    public static void println(Bridge bridge) {
        /*6. In the println method, display the result of calling getCarsCount() method on the bridge object.*/
        System.out.println(bridge.getCarsCount());
    }

}

