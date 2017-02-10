
import com.webapp.service.TestServiceInterface;
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
}
