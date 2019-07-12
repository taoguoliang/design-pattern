/**
 * @projectName design-pattern
 * @package com.taogl.structure.adapter
 * @className com.taogl.structure.adapter.AppleChargeAdapter
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.taogl.structure.adapter;
/**
 * AppleChargeAdapter
 *
 * @description 充电适配器
 * @author taogl
 * @date 2019/7/8 10:54
 * @version v1.0.0
 */
public class AppleChargeAdapter implements LightningInterface{
    private TypeCcInterface typeCcInterface;

    public AppleChargeAdapter(TypeCcInterface typeCcInterface) {
        this.typeCcInterface = typeCcInterface;
    }

    @Override
    public void chargeWithLightningInterface() {
        typeCcInterface.chargeWithTypeCcInterface();
    }
}
