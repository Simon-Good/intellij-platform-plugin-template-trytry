package com.github.simongood.intellijplatformplugintemplatetrytry.services

import com.intellij.openapi.project.Project
import com.github.simongood.intellijplatformplugintemplatetrytry.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
