import groovy.json.JsonSlurper


def jsonReader(file){
    def jsonSlurper = new JsonSlurper()
    
    def config = jsonSlurper.parse(new File(file))
    return config 
}