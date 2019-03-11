package demo.domain

import spock.lang.Specification

class OrderTestSpec extends Specification {
    def "Setting quantity of an item"() {
        given:
        def order = new Order();

        when: "add only one item"
        order.setQuantity(5);

        then: "expect value of the item"
        order.getQuantity() == 5
    }

    def "Set name of the item"() {
        given:
        def order = new Order();

        when: "add only one item"
        order.setItemName("Mango")

        then: "expect value of the item"
        order.getItemName() == "Mango"

    }

    def "SetPrice"() {
        given:
        def order = new Order()

        when: "add only one item"
        order.setPrice(50)

        then: "expect value of the item"
        order.getPrice() == 50
    }

    def "SetPriceWithTex"() {
        given:
        def order = new Order()

        when: "add only one item"
        order.setPrice(60.2)

        then: "expect value of the item"
        order.getPrice() == 60.2
    }
}
