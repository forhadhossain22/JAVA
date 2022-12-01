public class logicalOperator {
    public static void main(String[] args) {
        boolean a=true, b=true, c=false, result;

        System.out.println("a = "+a+"\tb = "+b+"\tc = "+c);
        result = a && b || c;
        System.out.println("a && b || c = "+result);
        result = a || b && c;
        System.out.println("a && b || c = "+result);
        result = a && !a;
        System.out.println("a && !a = "+result);
        result = a || !a;
        System.out.println("a || !a = "+result);
        result = c && !c;
        System.out.println("c && !c = "+result);
        result = c || !c;
        System.out.println("c || !c = "+result);
    }
}
