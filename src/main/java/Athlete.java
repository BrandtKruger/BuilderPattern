public class Athlete {

    private final String name;
    private final String lastName;
    private final int age;
    private final double weight;
    private final double bodyFatPercentage;

    private Athlete(AthleteBuilder athleteBuilder) {
        this.name = athleteBuilder.name;
        this.lastName = athleteBuilder.lastName;
        this.age = athleteBuilder.age;
        this.weight = athleteBuilder.weight;
        this.bodyFatPercentage = athleteBuilder.bodyFatPercentage;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", bodyFatPercentage=" + bodyFatPercentage +
                '}';
    }

    public static class AthleteBuilder{
        private final String name;
        private final String lastName;
        private final int age;
        private double weight;
        private double bodyFatPercentage;

        public AthleteBuilder(String name, String lastName, int age){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public AthleteBuilder weight(double weight){
            this.weight = weight;
            return this;
        }

        public AthleteBuilder bodyFatPercentage(double bodyFatPercentage){
            this.bodyFatPercentage = bodyFatPercentage;
            return this;
        }

        public Athlete build() throws Exception {
            Athlete athlete = new Athlete(this);
            validateAthleteData(athlete);
            return athlete;
        }

        private void validateAthleteData(Athlete athlete) throws Exception {

            if (athlete.getAge() == 0){
                throw new Exception("Invalid age");
            }

            if (athlete.getName() == null || athlete.getName().isEmpty()){
                throw new Exception("Name can not be empty.");
            }

            if (athlete.getLastName() == null || athlete.getLastName().isEmpty()){
                throw new Exception("Last Name can not be empty.");
            }

            if (athlete.getWeight() < 0){
                throw new Exception("The athlete weight is invalid");
            }

            if (athlete.getBodyFatPercentage() < 0){
                throw new Exception("The athlete body fat percentage is invalid");
            }
        }
    }
}
