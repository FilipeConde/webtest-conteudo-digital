package homepageTests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class UnstableTests extends BaseTest {

    @Test
    public void mustTriggerBtnEnviar() {
        homePage.sendMessage();
        String sentMsgResponse = "Agradecemos pelo contato! Em breve retornaremos sua mensagem";
        Assert.assertTrue(homePage.getSentEmailResponse().contains(sentMsgResponse));
    }

}
