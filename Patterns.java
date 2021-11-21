import java.util.*;

class LeftTriangle {
    Scanner scan = new Scanner(System.in);
    int time;
    
    void left_triangle() {
    System.out.println("Enter the Value");
    time = scan.nextInt();
System.out.println("");
        for (int i = 1; i <= time; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Screen display is done ");
    }
}

class RightTriangle extends LeftTriangle {

    void right_triangle() {
    System.out.println("Enter the Value");
time = scan.nextInt();    
System.out.println("");
for (int i = 1; i <= time; i++) {
            for (int j = 2 * (time - 2); j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                // System.out.print(" ");

            }
            System.out.println();

        }
        System.out.print("Screen display is done ");

    }
}

class Arrow extends RightTriangle {

    void arr() {
    System.out.println("Enter the Value");    
    time = scan.nextInt();
    System.out.println("");
    for (int i = 1; i <= time; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = (time - 1); i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print("  ");

            }

            System.out.println();

        }
        System.out.println("Screen display is done ");

    }
}

class ReverseTriangle extends Arrow {
    
    void reverse() {
    System.out.println("Enter the Value");
time = scan.nextInt();    
System.out.println("");    
for (int a = time; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b);
                System.out.print("  ");

            }

            System.out.println();

        }
    }
}

class Diamond extends ReverseTriangle {

    
    void dia() {
System.out.println("Enter the Value");
time = scan.nextInt();    
System.out.println("");
for (int i = 1; i <= time; i++) {
            for (int j = time; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
                System.out.print(i);

            }
            System.out.println();
        }
        for (int i = (time - 1); i >= 1; i--) {
            for (int j = time; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
                System.out.print(i);

            }
            System.out.println();
        }
        System.out.println("Screen display is done ");

    }
}

class Pyramid extends Diamond {
    
    void pyramid_pattern() {
System.out.println("Enter the Value");
time = scan.nextInt();  
System.out.println("");        
        for (int i = 1; i <= time; i++) {
            for (int j = time; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
                System.out.print(i);

            }
            System.out.println();
        }
        System.out.println("Screen display is done ");

    }
}

class Patterns {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice;

        LeftTriangle left = new LeftTriangle();
        RightTriangle right = new RightTriangle();
        Arrow a = new Arrow();
        ReverseTriangle reverse = new ReverseTriangle();
        Diamond diam = new Diamond();
        Pyramid pyr = new Pyramid();

        do {
            System.out.println("\n 1. LeftTriangle" + "\n 2. RightTriangle" + "\n 3. Arrow" + "\n 4. ReverseTriangle"
                    + "\n 5. Diamond" + "\n 6. Pyramid" + " \n 7. Exit");
            System.out.print(" ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    left.left_triangle();
                    break;
                case 2:
                    right.right_triangle();
                    break;
                case 3:
                    a.arr();
                    break;
                case 4:
                    reverse.reverse();
                    break;
                case 5:
                    diam.dia();
                    break;
                case 6:
                    pyr.pyramid_pattern();
                    break;
                case 7:
                    return;
            }
        } while (choice <= 7);

    }

}