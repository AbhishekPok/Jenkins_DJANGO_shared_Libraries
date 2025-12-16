# Jenkins Django Shared Libraries

A collection of reusable Jenkins shared library functions for building, testing, and deploying **Django** applications.

This repository contains Groovy shared library scripts designed to be used in Jenkins pipelines, enabling consistent CI/CD workflows across multiple Django projects.

## Repository Structure
.
├── vars/
│ └── *.groovy # Shared library functions
├── README.md # Project documentation


- `vars/` contains reusable pipeline steps.
- Each Groovy file in `vars/` is automatically exposed as a Jenkins pipeline function.

---

## Prerequisites

- Jenkins with Pipeline support enabled
- Jenkins agent with required tools (Git, Docker, Python, etc.)
- This repository configured as a **Global Pipeline Library** in Jenkins

---

## Jenkins Configuration

1. Go to **Manage Jenkins → Configure System**
2. Scroll to **Global Pipeline Libraries**
3. Add a new library:
   - **Name:** `DjangoDemo` (or any name you prefer)
   - **Default version:** `main`
   - **Retrieval method:** Modern SCM
   - **Source Code Management:** Git
   - **Project Repository:**  
     `https://github.com/AbhishekPok/Jenkins_DJANGO_shared_Libraries.git`

---

## Usage Example

Use the shared library in your `Jenkinsfile`:

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
