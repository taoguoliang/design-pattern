/**
 * @projectName design-pattern
 * @package com.taogl.structure.adapter
 * @className com.taogl.structure.adapter.AndroidPhone
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.taogl.structure.adapter;
/**
 * AndroidPhone
 *
 * @description 安卓手机
 * @author taogl
 * @date 2019/7/8 11:21
 * @version v1.0.0
 */
public class AndroidPhone {

    private TypeCcInterface typeCcInterface;

    public AndroidPhone(TypeCcInterface typeCcInterface) {
        this.typeCcInterface = typeCcInterface;
    }

    public void charge() {
        System.out.println("开始给安卓手机充电");
        typeCcInterface.chargeWithTypeCcInterface();
        System.out.println("结束给安卓手机充电");
    }
}
