package homepageTests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class ActionButtonsTests extends BaseTest {

/*
    @Test
    public void mustTriggerMouseOverAlyssonMsg() {

    }

    @Test
    public void mustTriggerMouseOverStephanieMsg() {

    }

    @Test
    public void mustTriggerBtnBlogNavigateLeft() {

    }

    @Test
    public void mustTriggerBtnBlogNavigateRight() {

    }
*/
    @Test
    public void mustTriggerBtnEnviar() {
        homePage.sendMessage();
        String sentMsgResponse = "Agradecemos pelo contato! Em breve retornaremos sua mensagem";
        Assert.assertTrue(homePage.getSentEmailResponse().contains(sentMsgResponse));
    }

}
