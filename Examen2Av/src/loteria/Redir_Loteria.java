package loteria;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class Redir_Loteria {

	public static void main(String[] args) {
		Jedis con = new Jedis("localhost");
        con.connect();
               
        for (int i=1; i<=25; i++)
        	con.sadd("bombo", Integer.toString(i));

        System.out.println("Primer premi: " + con.spop("bombo"));
        System.out.println("Segon premi: " + con.spop("bombo"));
        System.out.println("Tercer premi premi: " + con.spop("bombo"));
        System.out.println();
        System.out.print("Números no premiats; ");
        Set<String> c = con.smembers("bombo");
        for (String s : c)
            System.out.print(s + " ");
        /*while(con.exists("bombo"))
        	System.out.print(con.spop("bombo") + " ");*/
        con.del("bombo");
        con.close();
	}

}
