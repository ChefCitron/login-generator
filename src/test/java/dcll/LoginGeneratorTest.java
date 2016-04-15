package dcll;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Florent on 15/04/2016.
 */
public class LoginGeneratorTest {
  LoginService l = new LoginService(new String[] {"JROL","BPER","CGUR","JDUP","JRAL","JRAL1"});
  LoginGenerator g = new LoginGenerator(l);

  @Test
  public void testGenerateLoginForNomAndPrenom() throws Exception {

    String s = g.generateLoginForNomAndPrenom("Durand","Paul");
    assertTrue("Le login doit être PDUR",s.equals("PDUR"));


  }
  @Test
  public void a() throws Exception {
    String s2 = g.generateLoginForNomAndPrenom("Rolling","Jean");
    assertTrue("le login doit être JROL1",s2.equals("JROL1"));
  }

  @Test
  public void b() throws Exception {

    String s3 = g.generateLoginForNomAndPrenom("Dùrand","Paul");
    assertTrue("Le login doit être PDUR",s3.equals("PDUR"));

  }

}