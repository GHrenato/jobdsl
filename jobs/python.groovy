project_name = "project-a/jenkins-pipeline-python"
repo = "git@github.com:GHrenato/test-jenkins-2.git"
repo_name = "repo"

folder('project-a') {
    displayName('Project A')
    description('Folder for project A')
}

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
