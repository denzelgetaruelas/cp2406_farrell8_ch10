import java.util.ArrayList;
public class DemoPoems {
    public static void main(String[] args) {
        ArrayList<Poem> poems = new ArrayList<>();
        poems.add(new Couplet("Couplet:"));
        poems.add(new Limerick("Limerick:"));
        poems.add(new Haiku("Haiku:"));
        for (Poem poem : poems){
            System.out.println(poem + " lines");
        }
    }
}
