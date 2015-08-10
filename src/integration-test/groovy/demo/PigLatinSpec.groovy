package demo

import geb.spock.GebSpec
import grails.test.mixin.integration.Integration

@Integration
class PigLatinSpec extends GebSpec {

    void "test pig latin codec"() {
        when:
        go '/piglatin/jeff'

        then:
        $().text() == 'effjay'
    }
}
