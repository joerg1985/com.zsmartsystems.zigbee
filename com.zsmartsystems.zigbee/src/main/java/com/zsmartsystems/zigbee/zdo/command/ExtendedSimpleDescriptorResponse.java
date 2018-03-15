/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zdo.command;

import com.zsmartsystems.zigbee.zdo.ZdoResponse;
import javax.annotation.Generated;

/**
 * Extended Simple Descriptor Response value object class.
 * <p>
 * The Extended_Simple_Desc_rsp is generated by a remote device in response to an
 * Extended_Simple_Desc_req directed to the remote device. This command shall
 * be unicast to the originator of the Extended_Simple_Desc_req command.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */

@Generated(value = "com.zsmartsystems.zigbee.autocode.ZclProtocolCodeGenerator", date = "2018-03-14T23:37:27Z")
public class ExtendedSimpleDescriptorResponse extends ZdoResponse {
    /**
     * Default constructor.
     */
    public ExtendedSimpleDescriptorResponse() {
        clusterId = 0x801D;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(35);
        builder.append("ExtendedSimpleDescriptorResponse [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
