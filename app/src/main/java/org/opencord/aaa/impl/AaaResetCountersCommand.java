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

@Command(scope = "onos", name = "reset-aaa-counters",
        description = "reset all the aaa counters")
public class AaaResetCountersCommand extends AbstractShellCommand {

@Override
protected void execute() {
AuthenticationStatisticsService aaaStatisticsManager =  AbstractShellCommand.get(AuthenticationStatisticsService.class);

aaaStatisticsManager.getAaaStats().resetAccessRequestTx();
aaaStatisticsManager.getAaaStats().resetAcceptResponsesRx();
aaaStatisticsManager.getAaaStats().resetChallengeResponsesRx();
aaaStatisticsManager.getAaaStats().resetDroppedResponsesRx();
aaaStatisticsManager.getAaaStats().resetInvalidValidatorsRx();
aaaStatisticsManager.getAaaStats().resetMalformedResponsesRx();
aaaStatisticsManager.getAaaStats().resetPendingRequests();
aaaStatisticsManager.getAaaStats().resetRejectResponsesRx();
aaaStatisticsManager.getAaaStats().resetRequestReTx();
aaaStatisticsManager.getAaaStats().resetRequestRttMilis();
aaaStatisticsManager.getAaaStats().resetUnknownServerRx();
aaaStatisticsManager.getAaaStats().resetUnknownTypeRx();

}
}
