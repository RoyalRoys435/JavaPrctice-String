class Main {
  public static void main(String[] args) {
    //string immutability
    String name = "Roy";
    name.concat(" murray");
    System.out.println(name);
    name = name.concat(" murray");
    System.out.println(name);
    System.out.println();
    //methods to compare strings

    //using equls() methodd

    String n1 = "Roy";
    String n2 = "Roy";
    String n3 = "Roy";
    String n4 = new String("Roy");
    String n5 = "Murray";

    System.out.println(n1.equals(n2));
    System.out.println(n1.equals(n3));
    System.out.println(n1.equals(n4));
    System.out.println(n1.equals(n5));
    System.out.println();

    String n6 = "murray";
    String n7 = "MURRAY";

    System.out.println(n6.equals(n7));
    System.out.println(n6.equalsIgnoreCase(n7));
    System.out.println();
    
    //by suing == operator

    String nae = "Murray";
    String nae2 = new String("Murray");
    String nae3 = "Murray";

    System.out.println(nae == nae2);
    System.out.println(nae == nae3);
    System.out.println();


    //String compare by compareTo() method

    System.out.println(n1.compareTo(n2));
    System.out.println(n1.compareTo(n3));
    System.out.println(n1.compareTo(n4));
    System.out.println(n1.compareTo(n5));

    System.out.println();

    //String Concatenation in Java

    //String Concatenation by + (String concatenation) operator

    String r = "Roy" + " Ngugi ";
    String m = " Murray";
    String n = r + m;
    System.out.println(n);

    System.out.println();

    //String Concatenation by concat() method

    String hey = "Hello";
    String all = " World!";
    String uhm = hey.concat(all);
    System.out.println(uhm);

    System.out.println();

    //Substring in Java

    System.out.println(hey.substring(0,2));
    System.out.println(all.substring(1,4));


    
    
  }
}