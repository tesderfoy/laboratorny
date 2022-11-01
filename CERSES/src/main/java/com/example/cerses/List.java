package com.example.cerses;

import javafx.scene.control.Label;

public class List{
    public   LinkList head;

    public List(){
        head = null;
    }

    boolean isEmpty(){
        return head == null;
    }
    public void add(Object data){
        LinkList temp = new LinkList(data);
        temp.next = head;
        head = temp;
    }
    public void remove(){
        head = head.next;
    }

    public void removeAt(Object data){
        LinkList cur = head;
        LinkList prev = null;
        while (cur.next != null){
            if (cur.data == data){
                if (cur == head){
                    head = cur.next;
                }
                else {
                    prev.next = cur.next;
                }
            }
            prev = cur;
            cur = cur.next;
        }
    }
    public int find( Object key){
        LinkList temp = head;
        int c = 0;
        while (temp != null){
            if (temp.data == key){
                return c;
            }
            temp = temp.next;
            c++;
        }
        return -1;
    }

    public String print(){
        LinkList temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        return null;
    }

    public  void printNew(Label a){
        LinkList wer = head;
        while (wer != null){
            a.setText(wer.toString());

        }
    }

}
