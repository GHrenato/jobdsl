project_name = "jenkins-pipeline-python-test"
repo = "git@github.com:GHrenato/test-jenkins-2.git"
repo_name = "repo"

pipelineJob(project_name) {
    definition {
        triggers{
            scm("H/2 * * * *")
        }

        cpsScm{
            scm {
                git {
                    remote {
                        name(repo_name)
                        url(repo)
                    }
                }
                scriptPath("Jenkinsfile")
            }
        }
    }
}