/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.structure;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to implement the Ember Enumeration <b>EmberStatus</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public enum EmberStatus {
    /**
     * Default unknown value
     */
    UNKNOWN(-1),

    /**
     * The generic 'no error' message.
     */
    EMBER_SUCCESS(0x0000),

    /**
     * The generic 'fatal error' message.
     */
    EMBER_ERR_FATAL(0x0001),

    /**
     * An invalid value was passed as an argument to a function
     */
    EMBER_BAD_ARGUMENT(0x0002),

    /**
     * The manufacturing and stack token format in nonvolatile memory is different than what the
     * stack expects (returned at initialization).
     */
    EMBER_EEPROM_MFG_STACK_VERSION_MISMATCH(0x0004),

    /**
     * The static memory definitions in ember-staticmemory.h are incompatible with this stack
     * version
     */
    EMBER_INCOMPATIBLE_STATIC_MEMORY_DEFINITIONS(0x0005),

    /**
     * The manufacturing token format in non-volatile memory is different than what the stack
     * expects (returned at initialization).
     */
    EMBER_EEPROM_MFG_VERSION_MISMATCH(0x0006),

    /**
     * The stack token format in non-volatile memory is different than what the stack expects
     * (returned at initialization).
     */
    EMBER_EEPROM_STACK_VERSION_MISMATCH(0x0007),

    /**
     * There are no more buffers.
     */
    EMBER_NO_BUFFERS(0x0018),

    /**
     * Specified an invalid baud rate
     */
    EMBER_SERIAL_INVALID_BAUD_RATE(0x0020),

    /**
     * Specified an invalid baud rate
     */
    EMBER_SERIAL_INVALID_PORT(0x0021),

    /**
     * Tried to send too much data
     */
    EMBER_SERIAL_TX_OVERFLOW(0x0022),

    /**
     * There was not enough space to store a received character and the character was dropped.
     */
    EMBER_SERIAL_RX_OVERFLOW(0x0023),

    /**
     * Detected a UART framing error
     */
    EMBER_SERIAL_RX_FRAME_ERROR(0x0024),

    /**
     * Detected a UART parity error.
     */
    EMBER_SERIAL_RX_PARITY_ERROR(0x0025),

    /**
     * There is no received data to process.
     */
    EMBER_SERIAL_RX_EMPTY(0x0026),

    /**
     * The receive interrupt was not handled in time, and a character was dropped.
     */
    EMBER_SERIAL_RX_OVERRUN_ERROR(0x0027),

    /**
     * The MAC transmit queue is full
     */
    EMBER_MAC_TRANSMIT_QUEUE_FULL(0x0039),

    /**
     * MAC header FCR error on receive
     */
    EMBER_MAC_UNKNOWN_HEADER_TYPE(0x003A),

    /**
     * The MAC can't complete this task because it is scanning.
     */
    EMBER_MAC_SCANNING(0x003D),

    /**
     * No pending data exists for device doing a data poll.
     */
    EMBER_MAC_NO_DATA(0x0031),

    /**
     * Attempt to scan when we are joined to a network.
     */
    EMBER_MAC_JOINED_NETWORK(0x0032),

    /**
     * Scan duration must be 0 to 14 inclusive. Attempt was made to scan with an incorrect duration
     * value.
     */
    EMBER_MAC_BAD_SCAN_DURATION(0x0033),

    /**
     * emberStartScan was called with an incorrect scan type.
     */
    EMBER_MAC_INCORRECT_SCAN_TYPE(0x0034),

    /**
     * emberStartScan was called with an invalid channel mask.
     */
    EMBER_MAC_INVALID_CHANNEL_MASK(0x0035),

    /**
     * Failed to scan current channel because we were unable to transmit the relevant MAC command.
     */
    EMBER_MAC_COMMAND_TRANSMIT_FAILURE(0x0036),

    /**
     * We expected to receive an ACK following the transmission, but the MAC level ACK was never
     * received.
     */
    EMBER_MAC_NO_ACK_RECEIVED(0x0040),

    /**
     * Indirect data message timed out before polled.
     */
    EMBER_MAC_INDIRECT_TIMEOUT(0x0042),

    /**
     * The Simulated EEPROM is telling the application that there is at least one flash page to be
     * erased. The GREEN status means the current page has not filled above the
     * ERASE_CRITICAL_THRESHOLD. The application should call the function
     * halSimEepromErasePage when it can to erase a page.
     */
    EMBER_SIM_EEPROM_ERASE_PAGE_GREEN(0x0043),

    /**
     * The Simulated EEPROM is telling the application that there is at least one flash page to be
     * erased. The RED status means the current page has filled above the
     * ERASE_CRITICAL_THRESHOLD. Due to the shrinking availability of write space, there is a
     * danger of data loss. The application must call the function halSimEepromErasePage as soon
     * as possible to erase a page.
     */
    EMBER_SIM_EEPROM_ERASE_PAGE_RED(0x0044),

    /**
     * The Simulated EEPROM has run out of room to write any new data and the data trying to be set has
     * been lost. This error code is the result of ignoring the SIM_EEPROM_ERASE_PAGE_RED error
     * code. The application must call the function halSimEepromErasePage to make room for any
     * further calls to set a token.
     */
    EMBER_SIM_EEPROM_FULL(0x0045),

    /**
     * A fatal error has occurred while trying to write data to the Flash. The target memory
     * attempting to be programmed is already programmed. The flash write routines were asked to
     * flip a bit from a 0 to 1, which is physically impossible and the write was therefore inhibited.
     * The data in the flash cannot be trusted after this error.
     */
    EMBER_ERR_FLASH_WRITE_INHIBITED(0x0046),

    /**
     * A fatal error has occurred while trying to write data to the Flash and the write verification
     * has failed. The data in the flash cannot be trusted after this error, and it is possible this
     * error is the result of exceeding the life cycles of the flash.
     */
    EMBER_ERR_FLASH_VERIFY_FAILED(0x0047),

    /**
     * Attempt 1 to initialize the Simulated EEPROM has failed. This failure means the information
     * already stored in Flash (or a lack thereof), is fatally incompatible with the token
     * information compiled into the code image being run.
     */
    EMBER_SIM_EEPROM_INIT_1_FAILED(0x0048),

    /**
     * Attempt 2 to initialize the Simulated EEPROM has failed. This failure means Attempt 1
     * failed, and the token system failed to properly reload default tokens and reset the
     * Simulated EEPROM.
     */
    EMBER_SIM_EEPROM_INIT_2_FAILED(0x0049),

    /**
     * Attempt 3 to initialize the Simulated EEPROM has failed. This failure means one or both of the
     * tokens TOKEN_MFG_NVDATA_VERSION or TOKEN_STACK_NVDATA_VERSION were incorrect and the
     * token system failed to properly reload default tokens and reset the Simulated EEPROM.
     */
    EMBER_SIM_EEPROM_INIT_3_FAILED(0x004A),

    /**
     * A fatal error has occurred while trying to write data to the flash, possibly due to write
     * protection or an invalid address. The data in the flash cannot be trusted after this error,
     * and it is possible this error is the result of exceeding the life cycles of the flash.
     */
    EMBER_ERR_FLASH_PROG_FAIL(0x004B),

    /**
     * A fatal error has occurred while trying to erase flash, possibly due to write protection. The
     * data in the flash cannot be trusted after this error, and it is possible this error is the
     * result of exceeding the life cycles of the flash
     */
    EMBER_ERR_FLASH_ERASE_FAIL(0x004C),

    /**
     * The bootloader received an invalid message (failed attempt to go into bootloader).
     */
    EMBER_ERR_BOOTLOADER_TRAP_TABLE_BAD(0x0058),

    /**
     * Bootloader received an invalid message (failed attempt to go into bootloader).
     */
    EMBER_ERR_BOOTLOADER_TRAP_UNKNOWN(0x0059),

    /**
     * The bootloader cannot complete the bootload operation because either an image was not found
     * or the image exceeded memory bounds.
     */
    EMBER_ERR_BOOTLOADER_NO_IMAGE(0x005A),

    /**
     * The APS layer attempted to send or deliver a message, but it failed.
     */
    EMBER_DELIVERY_FAILED(0x0066),

    /**
     * This binding index is out of range of the current binding table.
     */
    EMBER_BINDING_INDEX_OUT_OF_RANGE(0x0069),

    /**
     * This address table index is out of range for the current address table.
     */
    EMBER_ADDRESS_TABLE_INDEX_OUT_OF_RANGE(0x006A),

    /**
     * An invalid binding table index was given to a function.
     */
    EMBER_INVALID_BINDING_INDEX(0x006C),

    /**
     * The API call is not allowed given the current state of the stack
     */
    EMBER_INVALID_CALL(0x0070),

    /**
     * The link cost to a node is not known.
     */
    EMBER_COST_NOT_KNOWN(0x0071),

    /**
     * The maximum number of in-flight messages (i.e. EMBER_APS_UNICAST_MESSAGE_COUNT) has
     * been reached.
     */
    EMBER_MAX_MESSAGE_LIMIT_REACHED(0x0072),

    /**
     * The message to be transmitted is too big to fit into a single over-the-air packet
     */
    EMBER_MESSAGE_TOO_LONG(0x0074),

    /**
     * The application is trying to delete or overwrite a binding that is in use.
     */
    EMBER_BINDING_IS_ACTIVE(0x0075),

    /**
     * The application is trying to overwrite an address table entry that is in use.
     */
    EMBER_ADDRESS_TABLE_ENTRY_IS_ACTIVE(0x0076),

    /**
     * Conversion is complete.
     */
    EMBER_ADC_CONVERSION_DONE(0x0080),

    /**
     * Conversion cannot be done because a request is being processed.
     */
    EMBER_ADC_CONVERSION_BUSY(0x0081),

    /**
     * Conversion is deferred until the current request has been processed.
     */
    EMBER_ADC_CONVERSION_DEFERRED(0x0082),

    /**
     * No results are pending
     */
    EMBER_ADC_NO_CONVERSION_PENDING(0x0084),

    /**
     * Sleeping (for a duration) has been abnormally interrupted and exited prematurely.
     */
    EMBER_SLEEP_INTERRUPTED(0x0085),

    /**
     * The transmit hardware buffer underflowed.
     */
    EMBER_PHY_TX_UNDERFLOW(0x0088),

    /**
     * The transmit hardware did not finish transmitting a packet.
     */
    EMBER_PHY_TX_INCOMPLETE(0x0089),

    /**
     * An unsupported channel setting was specified.
     */
    EMBER_PHY_INVALID_CHANNEL(0x008A),

    /**
     * An unsupported power setting was specified.
     */
    EMBER_PHY_INVALID_POWER(0x008B),

    /**
     * The packet cannot be transmitted because the physical MAC layer is currently transmitting a
     * packet. (This is used for the MAC backoff algorithm.)
     */
    EMBER_PHY_TX_BUSY(0x008C),

    /**
     * The transmit attempt failed because all CCA attempts indicated that the channel was busy
     */
    EMBER_PHY_TX_CCA_FAIL(0x008D),

    /**
     * The software installed on the hardware doesn't recognize the hardware radio type.
     */
    EMBER_PHY_OSCILLATOR_CHECK_FAILED(0x008E),

    /**
     * The expected ACK was received after the last transmission.
     */
    EMBER_PHY_ACK_RECEIVED(0x008F),

    /**
     * The stack software has completed initialization and is ready to send and receive packets
     * over the air
     */
    EMBER_NETWORK_UP(0x0090),

    /**
     * The network is not operating.
     */
    EMBER_NETWORK_DOWN(0x0091),

    /**
     * An attempt to join a network failed.
     */
    EMBER_JOIN_FAILED(0x0094),

    /**
     * After moving, a mobile node's attempt to re-establish contact with the network failed.
     */
    EMBER_MOVE_FAILED(0x0096),

    /**
     * An attempt to join as a router failed due to a ZigBee versus ZigBee Pro incompatibility.
     * ZigBee devices joining ZigBee Pro networks (or vice versa) must join as End Devices, not
     * Routers.
     */
    EMBER_CANNOT_JOIN_AS_ROUTER(0x0098),

    /**
     * The local node ID has changed. The application can obtain the new node ID by calling
     * emberGetNodeId().
     */
    EMBER_NODE_ID_CHANGED(0x0099),

    /**
     * The local PAN ID has changed. The application can obtain the new PAN ID by calling
     * emberGetPanId().
     */
    EMBER_PAN_ID_CHANGED(0x009A),

    /**
     * An attempt to join or rejoin the network failed because no router beacons could be heard by the
     * joining node.
     */
    EMBER_NO_BEACONS(0x00AB),

    /**
     * An attempt was made to join a Secured Network using a pre-configured key, but the Trust Center
     * sent back a Network Key in-the-clear when an encrypted Network Key was required.
     */
    EMBER_RECEIVED_KEY_IN_THE_CLEAR(0x00AC),

    /**
     * An attempt was made to join a Secured Network, but the device did not receive a Network Key.
     */
    EMBER_NO_NETWORK_KEY_RECEIVED(0x00AD),

    /**
     * After a device joined a Secured Network, a Link Key was requested but no response was ever
     * received.
     */
    EMBER_NO_LINK_KEY_RECEIVED(0x00AE),

    /**
     * An attempt was made to join a Secured Network without a pre-configured key, but the Trust
     * Center sent encrypted data using a pre-configured key.
     */
    EMBER_PRECONFIGURED_KEY_REQUIRED(0x00AF),

    /**
     * The node has not joined a network.
     */
    EMBER_NOT_JOINED(0x0093),

    /**
     * The chosen security level (the value of EMBER_SECURITY_LEVEL) is not supported by the stack
     */
    EMBER_INVALID_SECURITY_LEVEL(0x0095),

    /**
     * A message cannot be sent because the network is currently overloaded.
     */
    EMBER_NETWORK_BUSY(0x00A1),

    /**
     * The application tried to send a message using an endpoint that it has not defined.
     */
    EMBER_INVALID_ENDPOINT(0x00A3),

    /**
     * The application tried to use a binding that has been remotely modified and the change has not
     * yet been reported to the application.
     */
    EMBER_BINDING_HAS_CHANGED(0x00A4),

    /**
     * An attempt to generate random bytes failed because of insufficient random data from the
     * radio.
     */
    EMBER_INSUFFICIENT_RANDOM_DATA(0x00A5),

    /**
     * There was an error in trying to encrypt at the APS Level. This could result from either an
     * inability to determine the long address of the recipient from the short address (no entry in
     * the binding table) or there is no link key entry in the table associated with the destination,
     * or there was a failure to load the correct key into the encryption core.
     */
    EMBER_APS_ENCRYPTION_ERROR(0x00A6),

    /**
     *  There was an attempt to form a network using commercial security without setting the Trust
     * Center master key first.
     */
    EMBER_TRUST_CENTER_MASTER_KEY_NOT_SET(0x00A7),

    /**
     * There was an attempt to form or join a network with security without calling
     * emberSetInitialSecurityState() first
     */
    EMBER_SECURITY_STATE_NOT_SET(0x00A8),

    /**
     * The passed key data is not valid. A key of all zeros or all F's are reserved values and cannot be
     * used.
     */
    EMBER_KEY_INVALID(0x00B2),

    /**
     * There was an attempt to set an entry in the key table using an invalid long address. An entry
     * cannot be set using either the local device's or Trust Center's IEEE address. Or an entry
     * already exists in the table with the same IEEE address. An Address of all zeros or all F's are
     * not valid addresses in 802.15.4.
     */
    EMBER_KEY_TABLE_INVALID_ADDRESS(0x00B3),

    /**
     * There was an attempt to set a security configuration that is not valid given the other
     * security settings.
     */
    EMBER_SECURITY_CONFIGURATION_INVALID(0x00B7),

    /**
     * There was an attempt to broadcast a key switch too quickly after broadcasting the next
     * network key. The Trust Center must wait at least a period equal to the broadcast timeout so
     * that all routers have a chance to receive the broadcast of the new network key.
     */
    EMBER_TOO_SOON_FOR_SWITCH_KEY(0x00B8),

    /**
     * The message could not be sent because the link key corresponding to the destination is not
     * authorized for use in APS data messages. APS Commands (sent by the stack) are allowed. To use
     * it for encryption of APS data messages it must be authorized using a key agreement protocol
     * (such as CBKE).
     */
    EMBER_KEY_NOT_AUTHORIZED(0x00BB),

    /**
     * The security data provided was not valid, or an integrity check failed.
     */
    EMBER_SECURITY_DATA_INVALID(0x00BD),

    /**
     * A ZigBee route error command frame was received indicating that a source routed message from
     * this node failed en route.
     */
    EMBER_SOURCE_ROUTE_FAILURE(0x00A9),

    /**
     * A ZigBee route error command frame was received indicating that a message sent to this node
     * along a many-to-one route failed en route. The route error frame was delivered by an ad-hoc
     * search for a functioning route.
     */
    EMBER_MANY_TO_ONE_ROUTE_FAILURE(0x00AA),

    /**
     * A critical and fatal error indicating that the version of the stack trying to run does not
     * match with the chip it is running on. The software (stack) on the chip must be replaced with
     * software that is compatible with the chip
     */
    EMBER_STACK_AND_HARDWARE_MISMATCH(0x00B0),

    /**
     * An index was passed into the function that was larger than the valid range.
     */
    EMBER_INDEX_OUT_OF_RANGE(0x00B1),

    /**
     * There are no empty entries left in the table.
     */
    EMBER_TABLE_FULL(0x00B4),

    /**
     * The requested table entry has been erased and contains no valid data.
     */
    EMBER_TABLE_ENTRY_ERASED(0x00B6),

    /**
     * The requested function cannot be executed because the library that contains the necessary
     * functionality is not present.
     */
    EMBER_LIBRARY_NOT_PRESENT(0x00B5),

    /**
     * The stack accepted the command and is currently processing the request. The results will be
     * returned via an appropriate handler.
     */
    EMBER_OPERATION_IN_PROGRESS(0x00BA),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_0(0x00F0),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_1(0x00F1),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_2(0x00F2),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_3(0x00F3),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_4(0x00F4),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_5(0x00F5),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_6(0x00F6),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_7(0x00F7),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_8(0x00F8),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_9(0x00F9),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_10(0x00FA),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_11(0x00FB),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_12(0x00FC),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_13(0x00FD),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_14(0x00FE),

    /**
     * This error is reserved for customer application use. This will never be returned from any
     * portion of the network stack or HAL.
     */
    EMBER_APPLICATION_ERROR_15(0x00FF);

    /**
     * A mapping between the integer code and its corresponding type to
     * facilitate lookup by code.
     */
    private static Map<Integer, EmberStatus> codeMapping;

    private int key;

    static {
        codeMapping = new HashMap<Integer, EmberStatus>();
        for (EmberStatus s : values()) {
            codeMapping.put(s.key, s);
        }
    }

    private EmberStatus(int key) {
        this.key = key;
    }

    /**
     * Lookup function based on the EmberStatus type code. Returns null if the
     * code does not exist.
     *
     * @param code the code to lookup
     * @return enumeration value of the alarm type.
     */
    public static EmberStatus getEmberStatus(int code) {
        if (codeMapping.get(code) == null) {
            return UNKNOWN;
        }

        return codeMapping.get(code);
    }

    /**
     * Returns the EZSP protocol defined value for this enumeration.
     *
     * @return the EZSP protocol key
     */
    public int getKey() {
        return key;
    }
}