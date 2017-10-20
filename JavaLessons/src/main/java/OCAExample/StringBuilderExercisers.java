package OCAExample;

/**
 * User: tetiana.kryvets
 * Date: 10/19/17
 */
public class StringBuilderExercisers {

    public static void main (String[] arg){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println("Empty StringBuilder = " + sb.capacity());
        System.out.println("Initial capacity is 16(default) + length" + sb1.length()+ " = " + sb1.capacity());

        System.out.println("----------Strings:--------");
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println("The length of the string: =" + hannah.length());
        System.out.println("Symbol placed it 12 index, starting with 0 is: " + hannah.charAt(12));
        //Write an expression that refers to the letter b in the string referred to by hannah
        System.out.println("Index of b symbol is:" + hannah.indexOf('b'));

        System.out.println("----------ComputeResult-------------------");
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');
        System.out.println(index);
        result.setCharAt(0, original.charAt(0)); //result = shi
        System.out.println(result + "  ");    //si
        result.setCharAt(1, original.charAt(original.length()-1)); //result = se
        System.out.println(result + "   ");
        result.insert(1, original.charAt(4)); //  result = swe
        System.out.println(result + "   ");
        result.append(original.substring(1,4));  //result = sweoft
        System.out.println(result + "   ");
        result.insert(3, (original.substring(index, index+2) + " "));  //result = swear oft
        System.out.println(result + "   ");


    }


}
