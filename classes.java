public class classes {
    public static class ssflat {
        int story = 1;
        String color = "red";
        int length = 3;
        int width = 5;
        String[] person;

        public int areaOfFlat() {
            return length * width;
        }

        public ssflat() {
            color = "green";
            story = 2;

        }

        public ssflat(int s, String c) {
            story = s;
            color = c;
        }
    }

    public static void main(String[] args) {
        // ssflat f1 = new ssflat();
        // print
        // System.out.println(f1.color);

        // access
        // f1.color = "green";
        // System.out.println(f1.color);
        // modification
        // f1.color = "green";
        // f1.story = 2;
        // f1.length = 6;
        // f1.width = 10;
        // ssflat f1 = new ssflat(8,"blue");
        // System.out.println(f1.story);
        ssflat f1 = new ssflat();
        f1.person = new String[5];
        System.out.println(f1.person);
        System.out.println(f1.person.length);
        f1.person[0] = "Rahul";
        System.out.println(f1.person[0]);
    }
}
