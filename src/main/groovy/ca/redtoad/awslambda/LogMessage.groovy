package ca.redtoad.awslambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger

class LogMessage {
    String run(String message, Context context) {
        context.logger.log("message received: '$message'\n")
        message
    }
}
