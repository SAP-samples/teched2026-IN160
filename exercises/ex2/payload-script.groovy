package script

import com.sap.gateway.ip.core.customdev.util.Message

def Message processData(Message message) {

    // Set the payload and return.
    message.setBody("Payload set in the integration flow designer")
    return message

}