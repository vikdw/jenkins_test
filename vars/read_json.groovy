def jsonReader(){
    def scriptcontents = libraryResource "data.json"  
    writeFile file: "temp_data.json", text: scriptcontents 
    sh "ls -lrt"
    sh "cat temp_data.json"


}