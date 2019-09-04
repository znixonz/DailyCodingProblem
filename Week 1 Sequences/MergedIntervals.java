//Given a collection of intervals, merge all overlapping intervals.
//
//        Example 1:
//
//        Input: [[1,3],[2,6],[8,10],[15,18]]
//        Output: [[1,6],[8,10],[15,18]]
//        Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
//        Example 2:
//
//        Input: [[1,4],[4,5]]
//        Output: [[1,5]]
//        Explanation: Intervals [1,4] and [4,5] are considered overlapping.

package com.company;
import java.util.Comparator;
import java.util.Arrays;

public class MergedIntervals{
    public static void main(String[] args){
        Solution_mergedIntervals mySolution_mergedIntervals = new Solution_mergedIntervals();
        int[][] x = mySolution_mergedIntervals.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        //deeptoString convert 2D array to String
        String out = Arrays.deepToString(x);
        System.out.print(out);

    }
}

class Solution_mergedIntervals{
    public int[][] merge(int[][] intervals){

        //to sort the 2D array by their 1st element in descending order
        //so that its easier to merge the intervals
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return 0;
            }
        });

        int i = 0;
        int j = 1;
        int k = 1;

        while ((i+j)<intervals.length){
            //checking whether the "start time" of NEXT 2nd Array is larger than the "ending time" of PREVIOUS 2D Array
            if(intervals[i][1] < intervals[i+j][0]){
                //K increases when we manage to merge an array
                //so that we can print the 2D result array below
                k++;

                //this interval array is 1D array in which, the element are 2D arrays
                intervals[i+1] = intervals[i+j];

                //moving to the next 2D array element
                i++;

                //j remain bcuz we are comparing "starting time" of NEXT 2D array and the PREVIOUS "ending time" of 2D array
                //j must not increase so that the CURRENT array , can only compare to the NEXT array
                j = 1;
                continue;
            }
            else {
                //replacing the ending time of the 2D array with the next ending time of the next 2D array
                //because they are overlapping
                intervals[i][1] = Math.max(intervals[i][1],intervals[i+j][1]);

                //j increases is to check whether is there anymore overlapping 2D array
                j++;
                continue;
            }
        }
        int[][] result = new int[k][2];
        System.arraycopy(intervals,0,result,0,k);
        return result;
    }
}
