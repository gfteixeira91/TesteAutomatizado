package emUtil;
import org.junit.After;
import org.junit.Before;

import emUtil.Util;

public class baseEM {
	    private Util util;
	    private EMUtil emUtil;
	    
	    @Before
	    public void before() throws Exception {
	        this.util = new Util();
	        this.emUtil = new EMUtil(this.util);

	        this.emUtil.abrirPagina();
	        this.emUtil.realizarLoginSiteEM();
	    }

	    @After
	    public void after() throws InterruptedException {
	        Thread.sleep(5000);
	        util.getDriver().close();
	        util.getDriver().quit();
	    }

}
