/**
 * @projectName design-pattern
 * @package com.taogl.structure.adapter
 * @className com.taogl.structure.adapter.AdapterMain
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.taogl.structure.adapter;
/**
 * AdapterMain
 *
 * @description 适配器模式主类
 * @author taogl
 * @date 2019/7/8 10:56
 * @version v1.0.0
 */
public class AdapterMain {
    public static void main(String[] args) {
        AppleChargeAdapter appleChargeAdapter = new AppleChargeAdapter(new AndroidCharge());
        ApplePhone applePhone = new ApplePhone(appleChargeAdapter);
        applePhone.charge();

        AndroidChargeAdapter androidChargeAdapter = new AndroidChargeAdapter(() -> System.out.println("使用Lightning线充电"));
        AndroidPhone androidPhone = new AndroidPhone(androidChargeAdapter);
        androidPhone.charge();
    }
}
