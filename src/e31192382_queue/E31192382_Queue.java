package e31192382_queue;
import java.util.Scanner;
/**
 *
 * @author KARIN
 */
public class E31192382_Queue {
    int id;
    String nama,perlu;
    E31192382_Queue next;
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan id        : ");
        id=in.nextInt();
        System.out.print("Masukkan nama      : ");
        nama=str.nextLine();
        System.out.print("Masukkan keperluan : ");
        perlu=str.nextLine();
        next=null;
    }
    public void read(){
        System.out.println("|| "+id+" \t|| "+nama+" \t|| "+perlu+" \t||");
    }
    public static void main(String[] args){
        int menu=0;
        linked que=new linked();
        while(menu!=4){
            System.out.print("1.Enqueue\n2.Dequeue\n3.View\n4.Exit\n : ");
            menu=in.nextInt();
            switch (menu) {
                case 1:
                    que.enque();
                    break;
                case 2:
                    que.deque();
                    break;
                case 3:
                    que.view();
                    break;
                case 4:
                    System.out.println("- keluar -");
                    break;
                default:
                    System.out.println("- Salah -");
                    break;
            }
            System.out.println("");
        }
    }
}
class linked{
    E31192382_Queue head,tail;
    public linked(){
        head=null;
        tail=null;
    }
    public void enque(){
        E31192382_Queue baru=new E31192382_Queue();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void deque(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("Keluar Data Dengan Id : "+head.id);
            head=head.next;
        }
    }
    public void view(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
            for(E31192382_Queue a=head; a!=null; a=a.next) a.read();
        }
    }
}