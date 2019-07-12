/**
 * @projectName design-pattern
 * @package com.taogl.structure.adapter
 * @className com.taogl.structure.adapter.AndroidCharge
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.taogl.structure.adapter;
/**
 * AndroidCharge
 *
 * @description 安卓TypeC充电器
 * @author taogl * @date 2019/7/8 11:06
 * @version v1.0.0
 */
public class AndroidCharge implements TypeCcInterface {
    @Override public void chargeWithTypeCcInterface() {
        System.out.println("使用TypeC给手机充电");
    }
}
