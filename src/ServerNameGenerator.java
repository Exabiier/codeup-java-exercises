import java.util.*;

public class ServerNameGenerator {
        public String [] adj = {"awful", "ahsamed", "better", "blue-eyed", "beautiful", "attractive", "average", "bloody", "adorable", "ugly"};
        public String[] noun = {"tree", "bird", "dog", "rock", "phone", "book", "car", "duck", "ship","human"};

        public String ran(){
            int x = (int)(Math.random()*11);
            return this.adj[x] + " -- " + this.noun[x];
        }

    public static void main(String[] args) {
        ServerNameGenerator y = new ServerNameGenerator();
        System.out.println(y.ran());


    }




}
