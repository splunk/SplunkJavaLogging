package com.splunk.logging;

/**
 * @copyright
 *
 * Copyright 2013-2015 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/**
 * Container for Splunk http event collector event data
 */
public class HttpEventCollectorEventInfo<E> {
    private double time; // time in "epoch" format
    private final String severity;
    private final E message;

    /**
     * Create a new HttpEventCollectorEventInfo container
     * @param severity of event
     * @param message is an event content
     */
    public HttpEventCollectorEventInfo(final String severity, final E message) {
        this.time = System.currentTimeMillis() / 1000.0;
        this.severity = severity;
        this.message = message;
    }

    /**
     * @return event timestamp in epoch format
     */
    public double getTime() {
        return time;
    }

    /**
     * @return event severity
     */
    public final String getSeverity() {
        return severity;
    }

    /**
     * @return event message
     */
    public final E getMessage() {
        return message;
    }
}