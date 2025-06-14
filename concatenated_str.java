public class concatenated_str {

    public static void main(String[] args)
     {
       String des= "This is Java Training,";
       String space=" ";
       String day="on Sunday :)";
       String concatenated_str= des+space+day;
       String conc_str=des.concat(space).concat(day);
       System.out.println("2nd type concatenated str is : "+conc_str);
       System.out.println("Text is \n"+concatenated_str);
       System.out.println(day.charAt(5));

    }
// {String[]training ={"Java Selenium", "Sunday","8 Jan"};
//     System.out.println(training[0]+"\n"+ training[1]+"\n"+ training[2]);
//   int [] nos={1,2,3,4,5};
//   int add_all=nos[0]+nos[1] + nos[2]+ nos[3]+ nos[4];
// System.out.println("addition is "+add_all);

// }
// {
//     final String demo="This is demo string.";
//     String test="This is test string.";
//     System.out.println("test string is :\n"+test);
//     System.out.println("demo string is: \n"+demo);
//    String test_up = test.toUpperCase();
//     System.out.println(test_up);
//     String test_lower = test.toLowerCase();
//     System.out.println(test_lower);
//    System.out.println("===========x===========");
//    System.out.println(demo.toUpperCase());
//    System.out.println(demo.toLowerCase());
// }

}
