import groovy.json.JsonSlurper


def jsonReader(file){
    def jsonSlurper = new JsonSlurper()
    def tempFile = libraryResource "data.json"
    writeFile file : "temp_data.json" tempFile
    def config = jsonSlurper.parse(new File('temp_data.json'))
    return config 
}