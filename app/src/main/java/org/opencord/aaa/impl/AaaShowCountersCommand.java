/*
 * Copyright 2016-present Open Networking Foundation
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
package org.opencord.aaa.impl;

import org.apache.karaf.shell.commands.Command;
import org.onosproject.cli.AbstractShellCommand;
import org.opencord.aaa.AuthenticationStatisticsService;

@Command(scope = "onos", name = "show-aaa-counters",
        description = "Shows aaa counters")

public class AaaShowCountersCommand extends AbstractShellCommand {
@Override
protected void execute() {

AuthenticationStatisticsService aaaStatisticsManager =  AbstractShellCommand.get(AuthenticationStatisticsService.class);
print("AcceptResponsesRx = %s, AccessRequestsTx = %s, ChallengeResponsesRx = %s, DroppedResponsesRx = %s,"
                + " InvalidValidatorsRx = %s, MalformedResponsesRx = %s, PendingRequests = %s,"
                + " RejectResponsesRx = %s, RequestReTx = %s, RequestRttMilis = %s,"
                + " UnknownServerRx = %s, UnknownTypeRx = %s ",
                aaaStatisticsManager.getAaaStats().getAcceptResponsesRx().toString(),
                aaaStatisticsManager.getAaaStats().getAccessRequestsTx().toString(),
                aaaStatisticsManager.getAaaStats().getChallengeResponsesRx().toString(),
                aaaStatisticsManager.getAaaStats().getDroppedResponsesRx().toString(),
                aaaStatisticsManager.getAaaStats().getInvalidValidatorsRx().toString(),
                aaaStatisticsManager.getAaaStats().getMalformedResponsesRx().toString(),
                aaaStatisticsManager.getAaaStats().getPendingRequests().toString(),
                aaaStatisticsManager.getAaaStats().getRejectResponsesRx().toString(),
                aaaStatisticsManager.getAaaStats().getRequestReTx().toString(),
                aaaStatisticsManager.getAaaStats().getRequestRttMilis().toString(),
                aaaStatisticsManager.getAaaStats().getUnknownServerRx().toString(),
                aaaStatisticsManager.getAaaStats().getUnknownTypeRx().toString());
}
}

