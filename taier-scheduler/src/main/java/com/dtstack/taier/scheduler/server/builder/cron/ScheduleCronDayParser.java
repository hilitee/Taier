/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.taier.scheduler.server.builder.cron;

import com.dtstack.taier.common.exception.RdosDefineException;
import com.dtstack.taier.scheduler.server.builder.ScheduleConf;

/**
 * 按天调度解析
 * Date: 2017/5/4
 * Company: www.dtstack.com
 * @author xuchao
 */

public class ScheduleCronDayParser implements IScheduleConfParser {

    private static final String CRON_FORMAT = "0 ${minute} ${hour} * * ?";

    @Override
    public String parse(ScheduleConf scheduleConf) {
        if (scheduleConf.getMin() == null) {
            throw new RdosDefineException(String.format(ScheduleConfManager.CustomError.ERROR_INFO,scheduleConf.getPeriodType(),"min"));
        }

        if (scheduleConf.getHour() == null) {
            throw new RdosDefineException(String.format(ScheduleConfManager.CustomError.ERROR_INFO,scheduleConf.getPeriodType(),"hour"));
        }

        Integer minute =scheduleConf.getMin();
        Integer hour = scheduleConf.getHour();

        return CRON_FORMAT.replace("${minute}", minute + "").replace("${hour}", hour + "");
    }
}