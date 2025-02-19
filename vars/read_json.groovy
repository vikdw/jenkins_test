import groovy.json.JsonSlurper

def jsonSlurper = new JsonSlurper()

def config = jsonSlurper.parse(new File('config.json'))

println "config = $config"

def read_json(json_file){
    def config = jsonSlurper.parse(new File(json_file))
    return config 
}