package com.github.akarsh00.ss.services

import com.intellij.openapi.project.Project
import com.github.akarsh00.ss.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
