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

  @Test
  public void d() throws Exception {

    String s3 = g.generateLoginForNomAndPrenom("Du","Paul");
    assertTrue("Le login doit être PDU",s3.equals("PDU"));

  }

  @Test
  public void e() throws Exception {

    String s3 = g.generateLoginForNomAndPrenom("Ralling","John");
    assertTrue("Le login doit être JRAL2",s3.equals("JRAL2"));

  }

}