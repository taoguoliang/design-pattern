/**
 * @projectName design-pattern
 * @package com.taogl.structure.proxy.staticp
 * @className com.taogl.structure.proxy.staticp.UserDaoProxy
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.taogl.structure.proxy.staticp;
/**
 * UserDaoProxy
 *
 * @description 代理
 * @author taogl
 * @date 2019/8/5 15:06
 * @version v1.0.0
 */
public class UserDaoProxy implements IUserDao{
    private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(Object o) {
        System.out.println("代理运行开始");
        userDao.saveUser(o);
        System.out.println("代理运行结束");
    }
}
