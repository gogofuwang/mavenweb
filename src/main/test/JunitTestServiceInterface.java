
import com.webapp.service.TestServiceInterface;
import com.webapp.service.impl.DataDownLoaderServiceImpl;
import com.webapp.util.SpringUtil;
import org.junit.Test;
public class JunitTestServiceInterface {
    @Test
    public void Test001()
    {
        TestServiceInterface tsi = (TestServiceInterface)SpringUtil.CreateInstance().getBean("testservice");
        tsi.Test001();
        tsi.Test002();
        tsi.Test003();
    }
    @Test
    public void Test002()
    {
        DataDownLoaderServiceImpl service = new DataDownLoaderServiceImpl();
        String str = service.SendUrlRequest("http://www.sina.com.cn/");
        System.out.println(str);
    }
}
