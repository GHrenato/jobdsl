multibranchPipelineJob('python-deploy') {
    triggers {
         periodic(1)
}
    branchSources {
        git {
            id("43972896")
            remote('git@github.com:GHrenato/test-jenkins-2.git')
       }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
