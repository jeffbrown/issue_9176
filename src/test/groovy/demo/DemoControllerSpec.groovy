package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
class DemoControllerSpec extends Specification {

    void "test pig latin codec"() {
        given:
        mockCodec PigLatinCodec

        when:
        params.name = 'jake'
        controller.index()

        then:
        response.text == 'akejay'
    }
}
