import groovy.json.JsonSlurper


def jsonReader(json_file='data.json'){
    def jsonSlurper = new JsonSlurper()
    
    def config = jsonSlurper.parse(new File(json_file))
    return config 
}