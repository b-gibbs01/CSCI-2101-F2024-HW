package HW2;


public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    // Example 1: pythagorean(3,4) would return 5



    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements required here you will probably need at the least 5 if / elseif / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method
        // Example: grade(68) would return a D






    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method
    //      Example: tip(100, 4, 18) would return 5.0

    
 


    // You can either create a tester class or put your code here
     
    public static double pythag(double a, double b) {
        double sideA=Math.pow(a,2);
        double sideB=Math.pow(b,2);
        double sideC=Math.sqrt(sideA+sideB);
        return sideC;
    }

    public static String myGrade(double g) {
        String finalG="";
        
        if (g<=60){
            return finalG=("F");
        }
        if(g>60&&g<70){
            return finalG=("D");
        }
        if(g>70&&g<80){
            return finalG=("C");
        }
        if(g>80&&g<90){
            return finalG=("B");
            
        }
        if(g>=90){
            return finalG=("A");
        }
    else return finalG;    
    }
    

    public static double tipper(double total, int people, double percent) {
        double totally=Math.round(total);
        double percenter=percent/100;
        double finalTip= ((totally*percenter)+totally)/people;
        return finalTip;
    }
    
    public static void main(String[] args){
        System.out.println(pythag(6,7));
        System.out.println(myGrade(68));
        System.out.println(tipper(55.5,3,18));
    }
}
