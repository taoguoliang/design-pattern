/**
 * @projectName design-pattern
 * @package com.taogl.structure.proxy.staticp
 * @className com.taogl.structure.proxy.staticp.CglibUserDao
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.taogl.structure.proxy.cglib;

/**
 * CglibUserDao
 *
 * @description 保存
 * @author taogl
 * @date 2019/8/5 14:48
 * @version v1.0.0
 */
public class CglibUserDao {
    public void saveUser(Object o) {

        System.out.println("Cglib方式调用保存接口");
    }
}
