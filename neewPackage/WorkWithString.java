package neewPackage;

import java.util.Locale;

import static jdk.internal.org.jline.utils.AttributedStringBuilder.append;

//import static jdk.internal.org.jline.utils.AttributedStringBuilder.append;

public class WorkWithString {
    public static void main(String[] args) {

        String s1 = "HELLO THERE";

        System.out.println(s1);
        System.out.println(s1.length());
        //   System.out.printf( "the length of string is " + "%d" + s1.length());


        for (int count = s1.length() -1 ; count > 0; count--){
            System.out.print(s1.charAt(count));
        }
    }
    }

    class kfkk{
        public static void main(String[] args) {

            String s1 = new String("hello");
            String s2 = new String("birthday");
            String s3 = new String("lockdown");
            String s4 = new String("lOCKDOWN");


            if ( s1.equals("hello")) {
                System.out.println("s1 equals hello");
            }
            else
            {
                System.out.println("does not equal");
                }


            if ( s1 == "hello"){
                System.out.println("s1 == hello");
            }
            else
            {
                System.out.println("does not equal");
            }


            if ( s3.equalsIgnoreCase(s4)){
                System.out.println(true);

            }
            else {
                System.out.println(false);
            }

            }




        }



    class startWith {
        public static void main(String[] args) {

            String strings[] = {"started", "starting", "ending", "ended"};

            for (String string : strings) {
                if (string.startsWith("st"))
                    System.out.println(string);

            }

            for (String string : strings) {
                if (string.startsWith("art", 2)) {
                    System.out.println(string);
                }
            }

            for (String string : strings) {
                if (string.endsWith("ed")) {
                    System.out.println(string);
                } else {
                    System.out.println();
                }
            }
        }
    }

                       class GetIndexOf{
                    public static void main(String[] args) {

                        String s1  = "ahfjksopspdlswpmd";

                        System.out.println(s1.indexOf('k'));

                    }
                }

                class lastIndex{

                    public static void main(String[] args) {

                        String s1 = "hello there";

                        for ( int count = s1.length() -1 ; count > 0; count --){
                            System.out.print(s1.charAt(count));
                        }
                    }
                }


                class fjjd{
                    public static void main(String[] args) {

                        String s1 = new String("happy birthday");

                        for (int count = s1.length() - 1; count >= 0; count-- ){
                            System.out.print(s1.charAt(count));
                        }


                        System.out.println(s1.length());

                    }

                }

                class jdkk {
                    public static void main(String[] args) {

                        String[] s1 = {"amazing", "amani", "incredible", "increase"};

                        for (String strings : s1) {
                            if (strings.startsWith("inc")) {
                                System.out.println(strings);
                            }
                        }
                    }
                }

                    class jdk{
                        public static void main(String[] args) {

                            String letter =  "adnsmnncjsjhdvghbbdbsjd";

                            System.out.println(letter.lastIndexOf('j'));
                        }

                    }

                    class SubString{
                        public static void main(String[] args) {

                            String letters = "abcdefghijklmabcdefghijklm";

                            System.out.println(letters.substring(20));
                            System.out.println(letters.substring(3, 6));
                        }

                    }

                    class UpperCase{
                        public static void main(String[] args) {

                            String s1 = "happy";
                            String s2 = " BIRTHDAY";
                            String s3 = "   spaces    ";
                            System.out.println(s1.toUpperCase(Locale.ROOT));
                            System.out.println(s2.toLowerCase(Locale.ROOT));
                            System.out.println(s1.toUpperCase());
                            System.out.println(s3.trim());
                        }

 }

//
//    class StringBuilderBB {
//
//
//        // private StringBuilder append(Object objectRef)
//
//        public static void main(String[] args) {
//
//            Object objectRef = "hello";
//            String string = "goodbye";
//            char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
//            boolean booleanValue = true;
//            char characterValue = 'Z';
//            int integerValue = 7;
//            long longValue = 10000000000L;
//            float floatValue = 2.5f;
//            double doubleValue = 33.333;
//
//            StringBuilder lastBuffer = new StringBuilder("last buffer");
//            StringBuilder buffer = new StringBuilder("hello, how are you");
//
//
//            buffer.append(objectRef)
//                    .append("%n");
//            buffer.append(string)
//                    .append("%n");
//            buffer.append(charArray)
//                    .append("%n");
//            //  buffer.append(charArray, 0, 3)
//            //        .append("%n");
//            buffer.append(booleanValue)
//                    .append("%n");
//            buffer.append(characterValue)
//                    .append("%n");
//            buffer.append(integerValue)
//                    .append("%n");
//            buffer.append(longValue)
//                    .append("%n");
//            buffer.append(floatValue)
//                    .append("%n");
//            buffer.append(doubleValue)
//                    .append("%n");
//                    .append(lastBuffer);
//
//            System.out.println(buffer.toString());
//        }
//
//    }

    class kdk{
        public static void main(String[] args) {



            StringBuilder buffer = new StringBuilder("hello how are you ");

            System.out.println(buffer.length());
            System.out.println(buffer.capacity());
            buffer.ensureCapacity(75);
            System.out.println(buffer.capacity());


        }
    }



