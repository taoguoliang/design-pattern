/**
 * @projectName design-pattern
 * @package com.taogl.structure.proxy.dynamic
 * @className com.taogl.structure.proxy.dynamic.CglibProxyFactory
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.taogl.structure.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * CglibProxyFactory
 *
 * @description 代理工厂
 * @author taogl
 * @date 2019/8/5 15:18
 * @version v1.0.0
 */
public class ProxyFactory {
    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
            target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            (proxy, method, args) -> {
                System.out.println("开始事务2");
                //执行目标对象方法
                Object returnValue = method.invoke(target, args);
                System.out.println("提交事务2");
                return returnValue;
            });
    }
}
