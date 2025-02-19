def read_json(json_file){
    def props = readJSON file: json_file
    return props 
}