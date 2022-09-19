package algodat;

import java.io.*;
import java.util.Objects;

public class List {
    private Element cur = null;     //current Element
    private Element first = null;   //first Element in the list
    private Element last = null;    //last Element in the list

    public void insertElement(Data data) {
        //inserting into an empty list
        if (cur == null) {
            cur = new Element(null, null, data);
            first = cur;
            last = cur;
        } else {
            //inserting at the last position
            if (cur.getSucc() == null) {
                cur.setSucc(new Element(cur, null, data));
                last = cur.getSucc();
                cur = last;
            } else {                   //inserting in between elements
                Element tmpSucc = cur.getSucc();
                cur.setSucc(new Element(cur, tmpSucc, data));
                tmpSucc.setPred(cur.getSucc());
                cur = cur.getSucc();
            }
        }
    }

    public void deleteElement() {
        //deleting first element
        if (cur == first) {
            first = cur.getSucc();
            cur.setSucc(null);
            last = cur;
        } else {
            //deleting the last element
            if (cur.getSucc() == null) {
                cur = cur.getPred();
                cur.setSucc(null);
                last = cur;
            } else {
                //deleting an element inbetween elements
                Element tmpPre = cur.getPred();
                Element tmpSucc = cur.getSucc();
                cur = tmpPre;
                cur.setSucc(tmpSucc);
                tmpSucc.setPred(cur);
            }
        }
    }

    public void printElement(int inum) {
        cur = first;
        while (cur.getSucc() != null) {
            System.out.print(cur.getData().toString());
            cur = cur.getSucc();
        }
    }

    public void printList(){
        cur = first;
        while(cur != null){
            System.out.println(cur.getData().toString());
            cur = cur.getSucc();
        }
    }

    public void findElement(int inum) {
        cur = first;
        while (cur != null) {
            if (Objects.equals(cur.getData().getInsuranceNumber(), inum)) {
                System.out.println(cur.getData().toString());
                cur = cur.getSucc();
            } else {
                cur = cur.getSucc();
            }
        }
    }

    public int countElements() {
        int count = 0;
        cur = first;
        if (cur == null) {
        }else{
            while(cur != null) {
                cur = cur.getSucc();
                count++;
            }
        }
        return count;
    }

    public void writeListToDisk(){
        try{
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Liste.txt"));
            cur = first;
            while(cur != last){
                out.writeUTF(cur.getData().toString());
                cur = cur.getSucc();
            }
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void readListFromDisk() throws ClassNotFoundException{
        try{
            ObjectInput in = new ObjectInputStream(new FileInputStream("Liste.txt"));
            cur = first;
            while(cur != last){
                cur = cur.getSucc();
                System.out.println(in.readObject());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
