job('First-Maven-Project-Via-DSL') {
    description("First Maven job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on github")
    scm {
        git("git@https://github.com/scoffers473/mvntest.git", 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', './pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.jar'
    }
}
