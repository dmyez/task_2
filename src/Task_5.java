public class Task_5 {
    public static void main (String[] args) {
        int x = 7;
        int result = factorial(x);
        //     System.out.println(result);

        Node c = new Node("c", null, null);
        Node f = new Node("f", null, null);
        Node n = new Node("n", null, null);
        Node e = new Node("e", null, null);


        Node d = new Node( "d", f, n);
        Node b = new Node("b", c, d);
        Node a = new Node("a", b, e);

        walk(a);

    }

    public static int factorial (int n) {
        if ( n == 0) {
            return 1;
        }
        int currentFactorial = factorial( n - 1);
        return  n * factorial( n - 1);
    }

    public static void walk(Node current){
        System.out.println("Enter " + current.value);
        if (current.left != null) {
            walk(current.left);
        }
        if (current.right !=null) {
            walk(current.right);
        }

        System.out.println("Exit  " + current.value);



        return;
    }
}

class  Node {
    String value;
    Node left;
    Node right;
    public Node ( String value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;

    }
}


