import java.util.HashSet;

public class Demo {

    public static void removeDuplicates(SuperArray s) {
        /* regular O(n^2) version
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
            if (seen.add(toTest)) {
                i++;
            } else {
                s.remove(i);
            }
        }
    }

    public static SuperArray findOverlap(SuperArray a, SuperArray b) {
        SuperArray output = new SuperArray();
        for (int i = 0; i < a.size(); i++) {
            String element = a.get(i);
            if (b.contains(element)) {
                output.add(element);
            }
        }
        removeDuplicates(output);
        return output;
    }

    public static SuperArray zip(SuperArray a, SuperArray b) {
        SuperArray output = new SuperArray();
        for (int i = 0; i < a.size() || i < b.size(); i++) {
            if (i < a.size()) output.add(a.get(i));
            if (i < b.size()) output.add(b.get(i));
        }
        return output;
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
        System.out.println();

        System.out.println(findOverlap(new SuperArray(new String[] {"9","1","2","2","3","4"}), new SuperArray(new String[] {"0","4","2","2","9"})));
        System.out.println();

        System.out.println(zip(new SuperArray(new String[] {"a","b","c","d","e","f"}), new SuperArray(new String[] {"0","1","2","3"})));
        System.out.println(zip(new SuperArray(new String[] {"a","b","c"}), new SuperArray(new String[] {"0","1","2","3","4"})));
    }

}
