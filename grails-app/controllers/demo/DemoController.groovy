package demo

class DemoController {

    def index(String name) {
        render name?.encodeAsPigLatin()
    }
}
