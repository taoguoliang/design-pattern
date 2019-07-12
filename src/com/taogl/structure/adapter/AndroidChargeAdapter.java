/**
 * @projectName design-pattern
 * @package com.taogl.structure.adapter
 * @className com.taogl.structure.adapter.AndroidChargeAdapter
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.taogl.structure.adapter;
/**
 * AndroidChargeAdapter
 *
 * @description 安卓手机适配器
 * @author taogl
 * @date 2019/7/8 11:19
 * @version v1.0.0
 */
public class AndroidChargeAdapter implements TypeCcInterface{

    private LightningInterface lightningInterface;

    public AndroidChargeAdapter(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }

    @Override
    public void chargeWithTypeCcInterface() {
        lightningInterface.chargeWithLightningInterface();
    }
}
