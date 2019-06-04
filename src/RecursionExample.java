public class RecursionExample {
    public static void main (String[] args) {
        int n = 7;
        int result = factorial(n);
   //     System.out.println(result);

        Node five = new Node("5", null, null);
        Node three = new Node("3", null, null);
        Node four = new Node("4", null, null);
        Node two = new Node("2", null, null);


        Node mult = new Node( "*", five, three);
        Node div = new Node("/", four, two);

        Node plus = new Node("+", mult, div);

        walk(plus);

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

        System.out.println("Exit " + current.value);



        return;
    }
}

class  Node1 {
    String value;
    Node left;
    Node right;
    public Node1 ( String value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;

    }
}
