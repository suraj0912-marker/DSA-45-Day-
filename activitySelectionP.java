package com.practise;

import java.util.Arrays;

class Activity{
    int start;
    int end;
    Activity(int s,int e){
        this.start=s;
        this.end=e;
    }
}
public class activitySelectionP {
    public static void main(String[] args) {
        Activity[]arr={new Activity(1, 3),
                new Activity(2, 4),
                new Activity(3, 5),
                new Activity(0, 6),
                new Activity(5, 7),
                new Activity(8, 9),
                new Activity(5, 9)};
        Arrays.sort(arr,(a,b)->a.end-b.end);
        int count=1;
        int endtime=arr[0].end;


            for (int i = 1; i < arr.length; i++) {
                if (arr[i].start>=endtime){
                count++;
                endtime=arr[i].end;

            }
        }
        System.out.println("max"+count);
    }
}
