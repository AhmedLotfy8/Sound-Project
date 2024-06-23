class Node {
    int data;
    Node Next = null;
}

class LinkedList {

    static Node Head = null;

    static Node createNode (int Data) {

        Node node = new Node();

        if (node != null) {

            node.data = Data;
            node.Next = null;

        }

        return node;
    }


    static boolean addNode (int Data) {
        boolean ans = false;

        Node nodde = createNode(Data);
        Node temp = Head;

        if (nodde != null) {

            if (Head == null) {
                Head= nodde;
            }

            else {

                while (temp.Next != null) {
                    temp = temp.Next;
                }
                temp = nodde;
            }
            ans = true;
        }

        return ans;
    }

   public static boolean insertNode (int Data, int pos) {
        boolean ans = false;

        Node noode = createNode(Data);

        if (noode != null) {

            if (Head == null) { // no list
                Head = noode;
            }

            else {

                if (pos == 0) {
                    noode.Next = Head;
                    Head = noode;
                }

                else {
                    Node temp = null; //////////////////////////

                    for (int i=0; (i<pos-1)&&(temp.Next!=null); i++) {
                        temp = temp.Next;
                    }

                    if (temp.Next == null) {
                        temp.Next = noode;
                    }

                    else {
                        noode.Next = temp.Next;
                        temp.Next = noode;
                    }
                }

            }
            ans = true;
        }

        return ans;
   }

   public static Node searchNode (int Data) {
        Node nodee = Head;

        while (nodee != null && nodee.data != Data){
            nodee = nodee.Next;
        }

        return nodee;
   }

   public static boolean deleteNode (int pos) {
       boolean ans = false;

       if (Head != null) { // list found

           if (pos == 0) {
               Head = Head.Next;
           }

           else {
               Node last = Head.Next, beforeLast = Head;

               for (int i=0; (i<pos-1) && (last != null); i++) {

                   beforeLast = beforeLast.Next;
                   last = last.Next;

               }
               if (last != null) { // there exist node to delete

                   beforeLast.Next = last.Next;
               }
           }
           ans = true;
       }
       return ans;
   }
}

