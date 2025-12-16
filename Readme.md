# Jenkins Django Shared Libraries

A collection of reusable Jenkins shared library functions for building, testing, and deploying Django applications.

## Repository Structure

```
.
├── vars/
│   └── *.groovy    # Shared library functions
└── README.md       # Project documentation
```

Each Groovy file in `vars/` is automatically exposed as a Jenkins pipeline function.

## Prerequisites

- Jenkins with Pipeline support enabled
- Jenkins agent with required tools (Git, Docker, Python, etc.)
- This repository configured as a **Global Pipeline Library** in Jenkins

## Setup

1. Navigate to **Manage Jenkins → Configure System**
2. Scroll to **Global Pipeline Libraries** and add a new library:
   - **Name:** `DjangoDemo`
   - **Default version:** `main`
   - **Retrieval method:** Modern SCM → Git
   - **Project Repository:** `https://github.com/AbhishekPok/Jenkins_DJANGO_shared_Libraries.git`

## Usage Example

```groovy
@Library('DjangoDemo') _

pipeline {
    agent any
    stages {
        stage('Code Fetch') {
            steps {
                script {
                    codefetch(
                        "https://github.com/AbhishekPok/django-notes-app.git",
                        "main"
                    )
                }
            }
        }
    }
}
```
