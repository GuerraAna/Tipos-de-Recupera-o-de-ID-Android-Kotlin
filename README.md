# Tipos de Recuperação de ID Android - Kotlin



## FindViewByID (menos usada):

### Passo a passo:

1) Apenas crie no onCreate() a seguinte estrutura:

val nomeDoComponente = findViewById< tipoDoWidget >(R.id.nomeDoComponente)



## Synthetics (deprecated):

### Passo a passo:

1) No build.gradle (Module), nível de projeto/app, adicione o seguinte plugin e depois sincronize:

id 'kotlin-android-extensions'

2) Apenas chame no onCreate() os componentes desejados.



## ViewBinding (mais usada):

### Passo a passo:

1) No build.gradle (Module), nível de projeto/app, adicione no android a seguinte implementação e sincronize:

buildFeatures {

​	viewBinding true

}

2) Antes do onCreate(), crie:

private lateinit binding: ActivityMainBinding

3) Analise o meu código e veja que foi criado a seguinte linha:

binding = ActivityMainbinding.inflate(layoutInflater)

setContentView(binding.root)
