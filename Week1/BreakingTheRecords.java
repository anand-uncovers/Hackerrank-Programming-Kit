//Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.
//
//        Example
//
//        Scores are in the same order as the games played. She tabulates her results as follows:
//
//        Count
//        Game  Score  Minimum  Maximum   Min Max
//        0      12     12       12       0   0
//        1      24     12       24       0   1
//        2      10     10       24       1   1
//        3      24     10       24       1   1
//        Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.
//
//        Function Description
//
//        Complete the breakingRecords function in the editor below.
//
//        breakingRecords has the following parameter(s):
//
//        int scores[n]: points scored per game
//        Returns
//
//        int[2]: An array with the numbers of times she broke her records. Index  is for breaking most points records, and index  is for breaking least points records.
//        Input Format
//
//        The first line contains an integer , the number of games.
//        The second line contains  space-separated integers describing the respective values of .
//
//        Constraints
//

        import java.util.*;
class BreakingTheRecords {
    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        System.out.println(scores);

        int n=scores.size();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        List<Integer> mi = new ArrayList<>();
        List<Integer> ma = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(scores.get(i)>max){
                ma.add(scores.get(i));
                max=scores.get(i);
            }
            if(scores.get(i)<min){
                mi.add(scores.get(i));
                min=scores.get(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(ma.size()-1);
        result.add(mi.size()-1);


        return result;

    }
}