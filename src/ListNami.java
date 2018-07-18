import java.util.LinkedList;
import java.util.List;

public class ListNami {
    public static void main(String[] args) {
        List<String> domuo = new LinkedList<>();

        domuo.add("as");
        domuo.add("tu");
        domuo.add("jis");
        domuo.add("ji");
        domuo.add("jie");
        domuo.add("jos");

        System.out.println(domuo.get(0));
    }
        private String getLast(List<String> domuo){
            return domuo.get(domuo.size()-1);
        }
    }

