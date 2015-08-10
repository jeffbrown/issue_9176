package demo

class PigLatinCodec {

    static encode = { String value ->
        value[1..-1] + value[0] + 'ay'
    }
}
