 node {
            // Clean workspace before doing anything
            deleteDir()
    if (${config.projectName} == 'yes') {
            
                stage ('Clone') {
                    checkout scm
                }
                stage ('Build') {
                    sh ""
                }
                
       }
     }
