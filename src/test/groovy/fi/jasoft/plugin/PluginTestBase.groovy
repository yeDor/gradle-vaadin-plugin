package fi.jasoft.plugin

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.After
import org.junit.Before

/*
* Copyright 2015 John Ahlroos
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
class PluginTestBase {

    protected final File testDir = new File("build/tmp/tests")
    protected Project project
    protected GradleVaadinPlugin plugin

    @Before
    void setUp(){
        project = ProjectBuilder.builder().withProjectDir(testDir).build()
        plugin = new GradleVaadinPlugin().apply(project)
    }

    @After
    void tearDown(){
        plugin = null
        project = null
        if(testDir.exists()){
            testDir.deleteDir()
        }
    }
}
