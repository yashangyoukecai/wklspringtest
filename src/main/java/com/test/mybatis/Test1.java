package com.test.mybatis;

/**
 * Created by wklmogujie on 15/9/11.
 */
import java.io.IOException;
import java.io.Reader;
import java.util.*;
import com.wkl.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test1 {

    public static void main(String[] args) throws IOException {
        //mybatis的配置文件
        String resource = "conf.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
//        InputStream is = Test1.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        /**
         * 映射sql的标识字符串，classpath
         * userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "userMapper.getUser";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        User user = (User)session.selectOne(statement, 2);
        System.out.println("SelectOne" + "|"+ user+"\n");

        //Map方式多参数传入
        Map<String, Object> param=new HashMap<String, Object>();
        param.put("id", 1);
        param.put("age", 66);
        User Userwhole = (User)session.selectOne("userMapper.getUserDouble",param);
        System.out.println("SelectDoubleMap" + "|" + Userwhole+"\n");

        //JavaBean方式多参数传入
        User UserBean=new User();
        UserBean.setId(2);
        UserBean.setAge(66);
        User UserBeanNew = (User)session.selectOne("userMapper.getUserDouble",UserBean);
        System.out.println("SelectDoubleBean" + "|" + UserBeanNew+"\n");

        //JavaBean方式多参数传入,arraylist获取
        User UserbeanArray=new User();
        List<User> UserbeanArrayList = session.selectList("userMapper.getUserArray", UserbeanArray);
        System.out.println("getUserArray" + "|" + UserbeanArrayList + "\n");


        //insert
        User UserInsertFree=new User();
        UserInsertFree.setId(6);
        UserInsertFree.setName("无崖子");
        int IFreeResult = session.insert("userMapper.InsertUserfree",UserInsertFree);
//        System.out.println(UserInsertBasic.getId());
        System.out.println("InsertUserfree" + "|" + IFreeResult+"\n");
        session.commit();




        //insert
        User UserInsertBasic=new User();
        UserInsertBasic.setId(4);
        UserInsertBasic.setName("无情");
        UserInsertBasic.setAge(18);
        int Rinsert = session.insert("userMapper.InsertUserBasic",UserInsertBasic);
//        System.out.println(UserInsertBasic.getId());
        System.out.println("insertUser" + "|" + Rinsert+"\n");
        session.rollback();
        session.commit();


        //delete
//        User UserDeleteBasic=new User();
//        UserDeleteBasic.setId(3);
//        UserDeleteBasic.setAge(35);
//        int Rdelete = session.update("userMapper.DeleteUserBasic", UserDeleteBasic);
//        System.out.println("DeleteUserBasic" + "|" + Rdelete+"\n");
//        session.commit();


        //update
//        User UserUpdateBasic=new User();
//        UserUpdateBasic.setId(2);
//        UserUpdateBasic.setAge(27);
//        int Rupdate = session.update("userMapper.UpdateUserBasic", UserUpdateBasic);
//        System.out.println("UserUpdateBasic" + "|" + Rupdate+"\n");
//        session.commit();


        session.close();

    }
}