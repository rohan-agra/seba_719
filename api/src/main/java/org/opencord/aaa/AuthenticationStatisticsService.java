/*
 * Copyright 2018-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opencord.aaa;

import org.onosproject.event.ListenerService;

/**
 * Service for interacting with accounting module.
 */

public interface AuthenticationStatisticsService extends
        ListenerService<AuthenticationStatisticsEvent, AuthenticationStatisticsEventListener> {

    /**
     * Returns AaaStatistics object.
     *
     * @return AaaStatistics
    */
    public AaaStatistics getAaaStats();
    /**
     * Returns AuthenticationStatisticsDelegate object.
     *
     * @return AuthenticationStatisticsDelegate
    */
    public AuthenticationStatisticsDelegate getStatsDelegate();

    /**
     * Handle the roundTrip time of Radius Packet.
     *
     * @param identifier identifier of incoming radius packet
    */
    public void handleRoundtripTime(byte identifier);

    /**
     * Calculate average roundTrip time of multiple Packets.
    */
    public void calculatePacketRoundtripTime();

    /**
     * Put the identifier value to map.
     *
     * @param identifier identifier of incoming radius packet
    */
    public void putOutgoingIdentifierToMap(byte identifier);
}
