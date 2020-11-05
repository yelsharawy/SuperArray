import java.util.HashSet;

public class Demo {

    public static void removeDuplicates(SuperArray s) {
        /*
        for (int i = 0; i < s.size();) {
            String toTest = s.get(i);
            boolean keep = true;
            for (int j = 0; j < i; j++) {
                if (toTest.equals(s.get(j))) {
                    keep = false;
                    break;
                }
            }
            if (keep) {
                i++;
            } else {
                s.remove(i);
            }
        }
        */
        HashSet<String> seen = new HashSet<String>();
        for (int i = 0; i < s.size();) {
            String toTest = s.get(i);
            if (seen.contains(toTest)) {
                s.remove(i);
            } else {
                seen.add(toTest);
                i++;
            }
        }
    }

    public static void main(String[]args){
        SuperArray words = new SuperArray();
        //grouped to save vertical space
        words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
        words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
        words.add("una");    words.add("ebi");     words.add("toro");

        System.out.println(words);
        removeDuplicates(words);
        System.out.println(words);
    }
}
