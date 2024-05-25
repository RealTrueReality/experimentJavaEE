package wtr;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.truereality.pojo.User;
import com.truereality.util.MyBatisUtils;

import java.util.List;

/**
 * @author TrueReality
 * @date 2024/5/24
 * @apiNotes
 */
public class WtrTest {
    private static SqlSession session;

    @Before
    public void setUp() throws Exception {
        session = MyBatisUtils.getSession();
    }

    @Test
    public void testGetAllUser() {
        List<User> list = session.selectList("com.truereality.mapper" + ".UserMapper.getAllUser");
        list.forEach(System.out::println);
    }

    @Test
    public void testGetUserById() {
        User user = session.selectOne("com.truereality.mapper" + ".UserMapper.getUserById");
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        User user = new User(null, "NetEast", 20, "A888");
        int insert = session.insert("com.truereality.mapper" + ".UserMapper.addUser", user);
        System.out.println(insert > 0 ? "插入成功" : "插入失败");
        session.commit();
    }

    @Test
    public void testUpdateUser() {
        User user = new User(6, "wtr", 88, "A888");
        int update = session.update("com.truereality.mapper" + ".UserMapper.updateUserById", user);
        System.out.println(update > 0 ? "更新成功" : "更新失败");
        session.commit();
    }

    @Test
    public void testDeleteUser() {
        int delete = session.delete("com.truereality.mapper" + ".UserMapper.delUserById",6);
        System.out.println(delete > 0 ? "删除成功" : "删除失败");
        session.commit();
    }

    @After
    public void destroy() throws Exception {
        session.close();
    }
}
