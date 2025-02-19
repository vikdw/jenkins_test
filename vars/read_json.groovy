import groovy.json.JsonSlurper


def read_json(json_file){
    def jsonSlurper = new JsonSlurper()
    def config = jsonSlurper.parse(new File('config.json'))
    def config = jsonSlurper.parse(new File(json_file))
    return config 
}