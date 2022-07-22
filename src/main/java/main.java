/*
Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design
pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

A Builder class builds the final object step by step. This builder is independent of other objects.
 */

public class main {

    public static void main(String[] args) {

        try {
            Athlete athlete = new Athlete.AthleteBuilder("Brian", "Winter", 33).build();
            System.out.println(athlete);

            Athlete athlete2 = new Athlete.AthleteBuilder("Brian", "Winter", 33)
                    .weight(101.5)
                    .bodyFatPercentage(26.89)
                    .build();
            System.out.println(athlete2);

        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }


    }
}
