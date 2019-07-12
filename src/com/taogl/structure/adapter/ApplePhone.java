/**
 * @projectName design-pattern
 * @package com.taogl.structure.adapter
 * @className com.taogl.structure.adapter.ApplePhone
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.taogl.structure.adapter;
/**
 * ApplePhone
 *
 * @description 苹果手机
 * @author taogl
 * @date 2019/7/8 10:48
 * @version v1.0.0
 */
public class ApplePhone {
    private LightningInterface lightningInterface;

    public ApplePhone() {
    }

    public ApplePhone(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }

    public void charge() {
        System.out.println("开始给苹果手机充电");
        lightningInterface.chargeWithLightningInterface();
        System.out.println("结束给苹果手机充电");
    }
}
