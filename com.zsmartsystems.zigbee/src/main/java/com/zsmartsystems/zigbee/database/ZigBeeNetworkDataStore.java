/**
 * Copyright (c) 2016-2024 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.database;

import java.util.Collections;
import java.util.Set;
import java.util.UUID;

import com.zsmartsystems.zigbee.IeeeAddress;

/**
 * Interface to be implemented by users providing a node database for persisting device data outside of the framework.
 * <p>
 * ZigBee coordinators do not store any information about devices that have joined the network. In order to provide a
 * continuous service, information about nodes that have joined needs to be persisted between restarts of the framework.
 * <p>
 * The underlying data store implementation must be able to store and retrieve node data with the
 * {@link #writeNode(ZigBeeNodeDao)} and {@link #readNode(IeeeAddress)} methods, and also provide a list of all nodes
 * currently in the store with the {@link #readNetworkNodes()} method.
 * <p>
 * A simple <key, value> data store is also defined to allow the system to persist system critical information between
 * restarts.
 * <p>
 * Backup Read and Write methods are defined to allow the system to write and restore a single, coherent set of backup
 * data for the network.
 *
 * @author Chris Jackson
 *
 */
public interface ZigBeeNetworkDataStore {
    /**
     * Reads the list of nodes that are currently included in network. The underlying data store should return the list
     * of all nodes that have been stored with {@link #writeNode(ZigBeeNodeDao)}. If {@link #removeNode(IeeeAddress)}
     * has subsequently been called, the node shall not be returned in this Set.
     *
     * @return nodes the {@link Set} of {@link IeeeAddress}s of all nodes currently included in the network. Must not
     *         return null - if no nodes are currently in the network, return an empty Set.
     */
    Set<IeeeAddress> readNetworkNodes();

    /**
     * Called when the library wants to restore the saved information about a node. This is normally only done on system
     * startup.
     *
     * @param address the {@link IeeeAddress} of the node to retrieve
     * @return the {@link ZigBeeNodeDao} containing the node data. May return null if the node is not found in the
     *         database.
     */
    ZigBeeNodeDao readNode(IeeeAddress address);

    /**
     * Called when information about a node has been updated, and the node must persist the node data to non-volatile
     * storage.
     *
     * @param node the {@link ZigBeeNodeDao} to be persisted
     */
    void writeNode(ZigBeeNodeDao node);

    /**
     * Called when a node has been removed from the network. It is expected that the database implementation will remove
     * this data from the storage.
     *
     * @param address the {@link IeeeAddress} of the node to remove
     */
    void removeNode(IeeeAddress address);

    /**
     * Writes an object into the data store
     *
     * @param key the name of the object. Users must use globally unique names to avoid clashes
     * @param object the object value to write to the store
     */
    default void writeObject(String key, Object object) {
    }

    /**
     * Reads an object from the data store
     *
     * @param key the name of the object. Users must use globally unique names to avoid clashes
     * @return the object value read from the store or null if data for the requested key was not found
     */
    default Object readObject(String key) {
        return null;
    }

    /**
     * Writes a {@link ZigBeeNetworkBackupDao} to the data store
     *
     * @param backup
     * @return
     */
    default boolean writeBackup(ZigBeeNetworkBackupDao backup) {
        return false;
    }

    /**
     * Reads a {@link ZigBeeNetworkBackupDao} from the data store
     *
     * @param uuid the {@link UUID} of the backup
     * @return the restored {@link ZigBeeNetworkBackupDao} or null
     */
    default ZigBeeNetworkBackupDao readBackup(UUID uuid) {
        return null;
    }

    /**
     * Returns a summary of all backups in the system.
     *
     * @return A {@link Set} of {@link ZigBeeNetworkBackupDao} containing at least the network information
     */
    default Set<ZigBeeNetworkBackupDao> listBackups() {
        return Collections.emptySet();
    }

}
