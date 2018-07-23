import com.ych.controller.HomeController;
import com.ych.controller.StudentController;
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

    @Test
    public void testShowStudentRegisterInform() throws Exception {
        StudentController studentController = new StudentController();
        //对网络环境的http请求进行模拟，可以模拟对controller的测试
        MockMvc mockMvc = standaloneSetup(studentController).build();
        mockMvc.perform(get("/student/showRegisterInform")).andExpect(view().name("registerInform"));
    }
}
