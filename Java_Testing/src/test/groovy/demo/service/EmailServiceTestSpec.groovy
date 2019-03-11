package demo.service

import demo.domain.Order
import spock.lang.Specification

class EmailServiceTestSpec extends Specification {
    def "send email with only order placed "() {
        setup : "initialise email service"
        EmailService emailService = EmailService.getInstance()

        and: "to set mock object of order "
        def order = Mock(Order)

        when: "to send email"
        emailService.sendEmail(order)

        then: "throw exception"
        thrown(RuntimeException)
    }

    def "send email with a valid order and valid email id "() {

        setup: "initialise email service "
        EmailService emailService = EmailService.getInstance()

        and: "to set mock object of order "
        def order = Mock(Order)

        and:"initialise string"
        String str="emailName"

        when: "to send email"
        Boolean result =emailService.sendEmail(order,str)

        then: "throw exception"
        result

    }
}
