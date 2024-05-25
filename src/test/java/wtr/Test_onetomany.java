package wtr;

import com.truereality.onetomany.User;
import com.truereality.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author TrueReality
 * @date 2024/5/25
 * @apiNotes
 */
public class Test_onetomany {
    private static SqlSession session;

    @Before
    public void setUp() throws Exception {
        session = MyBatisUtils.getSession();
    }


    @Test
    public void findUserWithOrders1() {
        // 2、查询 id 为 1 的用户信息
        User user = session.selectOne("com.truereality.onetomany.mapper."+ "UserMapper.findUserWithOrders", 1);
        // 3、输出查询结果信息
        System.out.println(user);
    }
    @Test
    public void findUserWithOrders2() {
        // 2、查询 id 为 1 的用户信息
        User user = session.selectOne("com.truereality.onetomany.mapper."+ "UserMapper.findUserWithOrders2", 1);
        // 3、输出查询结果信息
        System.out.println(user);
    }

    @After
    public void destroy() throws Exception {
        session.close();
    }
}
