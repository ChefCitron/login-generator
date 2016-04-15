package dcll;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Florent on 15/04/2016.
 */
public class LoginServiceTest {

  @Test
  public void testConstruc() throws Exception {
    ArrayList<String> logins = new ArrayList<String>();
    LoginService l = new LoginService(new String[]{});
    List<String> i = l.findAllLogins();
    assertTrue("La liste des logins doit contenir 0 élément",i.size() ==0);
    LoginService l2 = new LoginService(new String[]{"Pierre"});
    List<String> i2;
    i2 = l2.findAllLogins();
    assertTrue("La liste des logins doit contenir 1 élément",i2.size() ==1);
    boolean b = i2.get(0).equals("Pierre");
    assertTrue("La liste des logins ne doit contenir que Pierre",b);
  }

  @Test
  public void testLoginExists() throws Exception {
    ArrayList<String> logins = new ArrayList<String>();
    LoginService l2 = new LoginService(new String[]{"Pierre"});
    assertTrue("Le Nom pierre doit être reconnu",l2.loginExists("Pierre"));
    assertFalse("le nom patrick ne doit pas être reconnu",l2.loginExists("Patrick"));
  }

  @Test
  public void testAddLogin() throws Exception {
    ArrayList<String> logins = new ArrayList<String>();
    LoginService l = new LoginService(new String[]{"Pierre"});
    List<String> i;
    i = l.findAllLogins();
    l.addLogin("Paul");
    assertTrue("La liste des logins doit contenir 2 élément",i.size() ==2);
    assertTrue("Paul doit existe",l.loginExists("Paul"));
  }

  @Test
  public void testFindAllLoginsStartingWith() throws Exception {
    ArrayList<String> logins = new ArrayList<String>();
    LoginService l = new LoginService(new String[]{"Pierre","Paul","Paulet"});
    List<String> i = l.findAllLoginsStartingWith("P");
    assertTrue("La liste des logins doit contenir 3 éléments", i.size()==3);
    List<String> i2 = l.findAllLoginsStartingWith("Pau");
    assertTrue("La liste des logins doit contenir 2 éléments", i2.size()==2);
    List<String> i3 = l.findAllLoginsStartingWith("Paule");
    assertTrue("La liste des logins doit contenir 1 éléments", i3.size()==1);
    List<String> i0 = l.findAllLoginsStartingWith("Cake");
    assertTrue("La liste des logins doit contenir 0 éléments", i3.size()==0);

  }

  @Test
  public void testFindAllLogins() throws Exception {

  }
}