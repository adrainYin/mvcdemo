import com.ych.controller.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
/**
 * 导入静态包，可以直接使用类中的静态方法
 */
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class TestHelloController {

    /**
     * 测试代码，使用Mock模拟ServletContext
     *
     * @throws Exception
     */
    @Test
    public void tetsHello() throws Exception {
        //创建Controller实例对象
        HomeController homeController = new HomeController();
        //启动Mock模拟Controller,并编译
        MockMvc mockMvc = standaloneSetup(homeController).build();
        //模拟对 /home 的get请求，查询是否对应hello视图，在spring test中不能使用重名处理
        mockMvc.perform(get("/home")).andExpect(view().name("hello"));
    }
}
