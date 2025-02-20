def jsonReader(file){
    def scriptcontents = libraryResource "${file}"  
    writeFile file: "${file}", text: scriptcontents 
    sh "ls -lrt"
    sh "cat ${file}"
}