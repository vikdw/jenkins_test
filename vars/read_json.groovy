def jsonReader(){
    def tempFile = libraryResource "data.json"
    writeFile file : "temp_data.json" tempFile
    sh "ls -lrt"
    sh "cat temp_data.json"


}