package com.strange.jay.tea.springcloudfunction.function;

import com.amazonaws.services.lambda.runtime.events.SQSBatchResponse;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SqsFunction implements Function<SQSEvent, SQSBatchResponse> {

    Logger LOGGER = LoggerFactory.getLogger(SqsFunction.class);


    @Override
    public SQSBatchResponse apply(final SQSEvent sqsEvent) {
        LOGGER.info("Processing SQS Event.");
        for (var record : sqsEvent.getRecords()) {
            LOGGER.info("Record: " + record.getBody());
        }
        return new SQSBatchResponse();
    }
}
