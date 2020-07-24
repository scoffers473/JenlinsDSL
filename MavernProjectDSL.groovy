job('First-Maven-Project-Via DSL') {
    description("First Maven job generated by DSL on ${new Date()}, this is a small project from github")
    scm {
        git("git@https://github.com/scoffers473/mvntest.git", master)
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package',' ./pom.xml')
    }
    publishers {
        // Archive the generated file
        archiveArtifacts '**/*.jar'
    }
}
