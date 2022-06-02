import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Please May You Enter The Temperature Value? : ");
        heat = input.nextInt();
        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */

        if (heat < 5) {
            System.out.print("You May Go To The Ski");

        } else if (heat>=5 && heat<15) {
            System.out.print("You May Go To The Cinema");

        }else if (heat>=15 && heat<25){
            System.out.print("You May Go To The Picnic");
        }else if(heat>=25){
            System.out.print("You may Go To The Swim");
        }else{
            System.out.print("Value Fail! Please Try Again ");
        }

    }
}
