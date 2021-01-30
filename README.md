
Projeto mostra como criar um projeto de mutação de teste usando o android e a IDE android studio, podemos executar por dentro da IDE sem problema.  


Para executar o projeto primeiro precisamos executar os testes unitários, em seguida executamos a tag pitest:  
```
gradle test  
gradle pitest  
```
Usamos o Junit 5 no projeto para ficar bem atualizado, para isso precisamos adicionar na task do pitest:

pitest {  
    testPlugin = 'junit5'  
    junit5PluginVersion = '0.12'  
    targetClasses = ['com.reinaldo.mutation_testing.*']  //by default "${project.group}.*"  
    threads = 4  
    outputFormats = ['XML', 'HTML']  
    timestampedReports = true  
}  

Usamos como base o projeto do João Farias sobre mutação de testes, apesar de ele ter feito em kotlin o exemplo o mesmo não rodaria em um projeto android,  
ele segue um padrão maven java.  



Referencias:  
https://gradle-pitest-plugin.solidsoft.info/  
https://github.com/szpak/gradle-pitest-plugin  
https://junit.org/junit5/docs/current/user-guide/  
http://thatsabug.com//blog/gentle_intro_mutation_testing/  
