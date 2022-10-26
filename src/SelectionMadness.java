
public class SelectionMadness
{
    // No instance variables //

    // no-parameter constructor with "empty" body since no instance variables
    public SelectionMadness() { }

    /* Simulates randomly flipping a fair coin and returning true for heads and
       false for tails; hint: this method should use the Math.random() method to
       generate a random number.  This method returns true (heads) 50% of the
       time and false (tails) 50% of the time, on average.
     */
    public boolean flipCoin()
    {
        if ((int) (Math.random() * 2)  == 0){
            return true;
        } else{
            return false;
        }
    }


    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3)
    {
        int greatest = 0;
        if (num1 > num2){//num 1 greater than num2
            if (num1 > num3){
                greatest = num1; //num1 is greatest
            } else {
                greatest = num3; //num3 is greatest
            }
        }else {
            if (num2 > num3) {
                greatest = num2; //num2 is greatest
            } else {
                greatest = num3; //num3 is greatest
            }
        }
        return greatest;//
    }


    /* Returns true if the three provided lengths create a right triangle, in
       other words, a2 + b2 = c2, where c is the longest side; returns false
       Otherwise (hint: use the largest() method that you wrote above!).
       Be careful -- this is a bit more challenging than it seems!  Consider if
       side1 = 3, side2 = 4, and side3 = 5 vs. if side1 = 5, side2 = 4, and
       side3 = 3 -- will your code work regardless of which side is the longest
       of the three?
     */
    public boolean rightTriangle(int side1, int side2, int side3) {
        int greatestVal = largest(side1, side2, side3);
//        System.out.println("largest: " + greatestVal);
        if (greatestVal == side1) {
//            System.out.println("side1");
            if (Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2)) {
                return true;
            } else {
                return false;
            }
        } else if (greatestVal == side2) {
//            System.out.println("side2");
            if (Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2)) {
                return true;
            } else {
                return false;
            }
        } else {
//            System.out.println("side3");
            if (Math.pow(side3, 2) == Math.pow(side2, 2) + Math.pow(side1, 2)){
                return true;
            } else{
                return false;
            }
        }
    }
}
