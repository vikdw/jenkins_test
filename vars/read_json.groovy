def jsonReader(file){
    def scriptcontents = libraryResource "${file}"  
    writeFile file: "temp_data.json", text: scriptcontents 
    sh "ls -lrt"
    sh "cat temp_data.json"


}