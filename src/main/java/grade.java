public class grade {

    public char findgrade(int num) {

        if (num < 0) {

            throw new IllegalArgumentException(" num of grade can not be found");
        } else if (num < 60) {
            return 'F';
        }
        else if (num < 70) {
            return 'D';
        }
        else if (num < 80) {
            return 'C';
        }
        else if (num < 90) {
            return 'B';
        }
        else  {
            return 'A';
        }
    }
}
