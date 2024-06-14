    /*
here I created a HashSet where all the integers will be stored without the duplicate then started a
loop and in the loop, I used an if statement to find a number that doesn't add to the set if it's true then it'll return true
or return false.
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> hashset  = new  HashSet<Integer>();
         for (int a: nums){
             if (!hashset.add(a)){return true;}
             }
         return false;
    }
}
