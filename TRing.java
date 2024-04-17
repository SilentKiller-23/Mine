import java.util.Scanner;

public class TRing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes : ");
        int n = sc.nextInt();

        System.out.println("Ring Formed as below : ");
        for(int i=0;i<n;i++){
            System.out.println(i+" ");
        }

        System.out.println('0');

        int ch = 0;

        do{
            System.out.println("Enter the Sender");
            int sender = sc.nextInt();

            System.out.println("Enter Receiver");
            int receiver = sc.nextInt();

            System.out.println("Enter the data");
            int data = sc.nextInt();

            int token = 0;
            System.out.println("Token passing");

            for(int i=token;i<sender;i++){
                System.out.println(" "+i+"->");
            }

            System.out.println(" "+sender);

            System.out.println("Sender"+sender+" Sending data "+data);

            for(int i=sender;i!=receiver;i=(i+1)%n){
                System.out.println("Data "+data+" Forwarded by "+i);
            }
            System.out.println("Receiver "+receiver+" Receieved the data");

            token = sender;

            System.out.println("Do you want to send data again,If yes Enter 1 And If no Enter 0");
            ch = sc.nextInt();

        }while(ch==1);
    }
}
