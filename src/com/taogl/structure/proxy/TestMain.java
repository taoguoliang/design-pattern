/**
 * @projectName design-pattern
 * @package com.taogl.structure.proxy.staticp
 * @className com.taogl.structure.proxy.TestMain
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.taogl.structure.proxy;

import com.taogl.structure.proxy.cglib.CglibProxyFactory;
import com.taogl.structure.proxy.cglib.CglibUserDao;
import com.taogl.structure.proxy.dynamic.ProxyFactory;
import com.taogl.structure.proxy.staticp.IUserDao;
import com.taogl.structure.proxy.staticp.UserDao;
import com.taogl.structure.proxy.staticp.UserDaoProxy;

/**
 * TestMain
 *
 * @description 测试主类
 * @author taogl
 * @date 2019/8/5 15:11
 * @version v1.0.0
 */
public class TestMain {
    public static void main(String[] args) {

        //static
        IUserDao userDao = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.saveUser(new Object());

        //dynamic --  (IUserDao)proxyFactory.getProxyInstance(); 只能被强转为接口类型而不能是实现类
        ProxyFactory proxyFactory = new ProxyFactory(userDao);
        IUserDao iUserDao = (IUserDao)proxyFactory.getProxyInstance();
        iUserDao.saveUser(new Object());

        //Cglib --
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(new CglibUserDao());
        CglibUserDao cglibUserDao = (CglibUserDao)cglibProxyFactory.getProxyInstance();
        cglibUserDao.saveUser(new Object());
    }
}
