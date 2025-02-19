import groovy.json.JsonSlurper


def jsonReader(){
    def jsonSlurper = new JsonSlurper()
    def file = libraryResources "data.json"
    
    def config = jsonSlurper.parse(new File(file))
    return config 
}