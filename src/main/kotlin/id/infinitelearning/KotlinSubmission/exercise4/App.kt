package id.infinitelearning.KotlinSubmission.exercise4

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    class validationException(message: String) : Throwable(message)

    fun sayHello(name: String){
        if(name.isBlank()){
            throw validationException("Name is blank")
        }
        println("Hello $name")
    }

    fun main(){
        try {
            sayHello("")
        } catch (error: validationException){
            println("Error with message ${error.message}")
        }
    }
