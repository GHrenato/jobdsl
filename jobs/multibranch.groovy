multibranchPipelineJob('python-deploy') {
    branchSources {
        git {
            remote('git@github.com:GHrenato/test-jenkins-2.git')
       }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
